package com.pqr.lesson25.jdbc3;

import java.sql.*;

/**
 * @file: Test.java
 * @time: 2020/11/7 11:05 PM
 * @Author by Pking
 */
public class Test {
    Connection connection = null;
    Statement statement = null;
    private void conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Username?useSSL=false&serverTimezone=UTC", "root", "mysql");
            statement = connection.createStatement();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //事物的操作
    public void testTranction() throws SQLException {
        conn();
        try {
            //设置事物提交的方式-->设置connection的事物提交方式
            //默认一条sql语句提交一次
            connection.setAutoCommit(false);
            //设置不手动提交
            //sql1 sql2同时提交 -->同时成功 同时失败
            connection.createStatement();
            //转账300元
            String sql1 = "update user_card set money = money + 300 where username = \"zhangsan\"";

            String sql2 = "update user_card set money = money - 300 where username = \"lisi\" ";

            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            //commit --> 执行操作
            connection.commit();
        }catch (Exception e){
            connection.rollback();
            //如果没提交的话，错了可以rollback，将所有操作撤销
            //若提交以后rollback则没用，因此rollback 与 commit不同时执行
            e.printStackTrace();
        }finally {
            close();
        }
    }

    //jdbc批量处理
    public void excuteBatch(){
        conn();
        try {
            statement = connection.createStatement();
            String sql = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu1', '1200')";
            String sql1 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu2', '1200')";
            String sql2 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu3', '1200')";
            String sql3 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu4', '1200')";
            String sql4 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu5', '1200')";
            String sql5 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu6', '1200')";
            String sql6 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu7', '1200')";
            String sql7 = "INSERT INTO `Username`.`user_card`(`id`, `username`, `money`) VALUES (4, 'zhaoliu8', '1200')";
            //转入缓冲区
            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.addBatch(sql3);
            statement.addBatch(sql4);
            statement.addBatch(sql5);
            statement.addBatch(sql6);
            statement.addBatch(sql7);

            //执行批量
            statement.executeBatch();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //分页
    /**
     * 每页20条记录
     * 第一页: 1-20 limit 0,20
     * 第二页：21-40 limit 20,20
     *
     */
    public void turnOverpage(int nowPage){
        //limit--> keyword：两个参数： 起始索引 显示条数
        int pageSize = 20;
        int startIndex = (nowPage - 1) * pageSize;
        String sql = "select * from user_info limit" + startIndex + "," + pageSize;

        //查询
    }

    private void close(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Test test = new Test();
        test.testTranction();
        test.excuteBatch();
    }
}
