package com.pqr.lesson23.jdbc;
// import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * @File：Test.java
 * @Date:2020-11-05 5:13 下午
 * @Author:pengquanrun
 */
public class Test {
    //加载driver（驱动）com.mysql.jdbc.Driver
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库的连接
            String url = "jdbc:mysql://localhost:3306/Username";
            String user = "root";
            String password = "mysql";
            Connection connection = DriverManager.getConnection(url,user,password);
            //输出连接
            System.out.println(connection);
            //创建语句
            Statement statement = connection.createStatement();
            //执行一个update-->增删改 语句
            int result = statement.executeUpdate("insert into user_info values('lidd',123456);");
            System.out.println("改变的行数：" + result);
            //关闭连接(一定要关闭!!!!!!) 建议写到fianlly，确保一定关闭

            //查询
            ResultSet resultSet = statement.executeQuery("select * from user_info where username = \"pengquanrun\"");
            //next方法表示有没有下一个
            while(resultSet.next()){
                String username = resultSet.getString(1);
                String pwd = resultSet.getString(2);
                System.out.println(username  +":"+ pwd);
            }
            statement.close();
            connection.close();
        }catch(Exception e){ //ClassNotFoundException | SQLException
            e.printStackTrace();
        }
    }
}
