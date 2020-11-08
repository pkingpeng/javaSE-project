package com.pqr.lesson24.jdbc2;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @file: PreJDBCTools.java
 * @time: 2020/11/7 9:33 PM
 * @Author by Pking
 *
 * 使用普通statement有什么缺点
 *
 * 1.存在sql注入的风险
 * 使用preparedstatement 预处理
 *
 * 2.preparedStatement会预先编译，效率高于普通statement
 * statement执行 每次都会编辑再解析
 */
public class PreJDBCTools {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    private void conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Username?useSSL=false&serverTimezone=UTC", "root", "mysql");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //更新方法
//    public int update(String sql) throws SQLException {
//        //使用占位符
//        //update user_info set id = 3 where username = "cj";
//        //？ --> 参数的占位符
//        //update user_info set id = 3 where username = ?
//        return preparedStatement.executeUpdate(sql);
//    }

    public List<HashMap<String, String>> query(String sql, String[] args){
        List<HashMap<String, String>> hashMapList = new ArrayList<>();
        //每一个hashmap就是一条记录
        //每个行的值 就是一个key
        //预处理查询
        // "select * from user_info where username = ?"
        try {
            conn();
            preparedStatement = connection.prepareStatement(sql);

            if(args != null && args.length > 0){
                for(int i = 1;i <= args.length; i++){
                    //将第一 ？ 替换为 "pengqr"
                    preparedStatement.setString(1, args[i - 1]);
                    System.out.println(args[i - 1]);
                }
            }

            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //存储数据的list
            while(resultSet.next()){
                //getColumnCount --> 获取列的数量
                HashMap<String, String> map = new HashMap<>();
                for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++){
                    //getColumnName(i) -> 返回的是key
                    String key = resultSetMetaData.getColumnName(i);
                    String value = resultSet.getString(i);

                    map.put(key,value);
                    System.out.println(key + "-"+ value);
                }
                hashMapList.add(map);
                System.out.println();
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            close();
        }
        return hashMapList;
    }


    private void close() {
        try {
            if(resultSet != null) {
                resultSet.close();
            }
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //预处理
        PreJDBCTools preJDBCTools = new PreJDBCTools();
        String sql = "select * from user_info where username = ?";
        List<HashMap<String,String>> hashMapList = preJDBCTools.query(sql, new String[]{"pengqr"});
        System.out.println(hashMapList);

    }


}
