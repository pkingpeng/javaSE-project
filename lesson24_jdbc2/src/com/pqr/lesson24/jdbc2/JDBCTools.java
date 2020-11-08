package com.pqr.lesson24.jdbc2;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @File：JDBCTools.java
 * @Date:2020-11-05 8:33 下午
 * @Author:pengquanrun
 */
public class JDBCTools {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
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
    public List<HashMap<String, String>> query(String sql){
        List<HashMap<String, String>> hashMapList = new ArrayList<HashMap<String, String>>();
        //每一个hashmap就是一条记录
        //每个行的值 就是一个key
        try {
            conn();
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //存储数据的list
            while(resultSet.next()){
                //getColumnClassName --> 获取列的数量
                HashMap<String, String> map = new HashMap<String, String>();
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
            if(statement != null) {
                statement.close();
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
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sql = "select * from user_info where username ='"+name +"'";
        //输入 ' or 1=1# 会有sql注入的风险，会打印出所有数据
        JDBCTools jdbcTools = new JDBCTools();
        List<HashMap<String,String>> hashMapList = jdbcTools.query(sql);
        System.out.println(hashMapList);


    }


}
