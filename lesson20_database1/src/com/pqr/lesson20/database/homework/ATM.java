package com.pqr.lesson20.database.homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @File：ATM.java
 * @Date:2020-11-04 11:23 上午
 * @Author:pengquanrun
 *
 * 简易自动提款机
 * 1. 创建用户类User（包含卡号、姓名、密码、余额等属性），用户开卡时录入的姓名和密码（自动分配一个卡号、初始金额设置为0）。
 * 2. 使用ArrayList或LinkedList存储全部注册用户
 * 形式如：ArrayList<User> userList = new ArrayList<User>();
 * 3. 实现功能
 * （1）存款
 * （2）取款（如果余额不足要提示）
 * （3）查询余额（只能查看当前卡号的余额）
 * 4. 技术要求，使用异常处理用户的错误输入（即程序保护容错功能）。
 *
 */
public class ATM {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<User> userArrayList = new ArrayList<User>();
    public static int index = -1;

    public static void main(String[] args) {
        System.out.println("=================Welcome=================");
        while(true){
            System.out.println("1.开卡 2.登陆");

            //异常处理其他输入
            try{
                //运行时异常
                scanner = new Scanner(System.in);
                int UserInput = scanner.nextInt();
                switch (UserInput){
                    case 1:
                        //开卡
                        newUser();
                        break;
                    case 2:
                        //登陆
                        login();
                        break;
                }
            }catch (Exception e){
                System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void newUser(){
        System.out.println("=================开卡=================");
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        //卡号自动分配 ->不重复
        //使用当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String cardNo = simpleDateFormat.format(date);
        //实例化User对象 --> 存储卡
        User user = new User();
        user.setCardNo(cardNo);
        user.setName(name);
        user.setPassword(password);

        //存储User
        userArrayList.add(user);
        System.out.println("您的卡号为:" + cardNo);
        System.out.println("您的密码为:" + password);
    }

    public static void login(){
        System.out.println("=================登陆=================");
        System.out.println("请输入卡号：");
        String cardNo = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        //寻找是否有该User
        if(userArrayList != null && userArrayList.size() != 0){
            for(int i = 0;i< userArrayList.size(); i++){
                User user = userArrayList.get(i);
                //遍历获取每一个用户 进行比对
                if(user.getCardNo().equals(cardNo)){
                    if(!(user.getPassword().equals(pwd))){
                        System.out.println("您输入的密码不正确");
                        index = -2;
                        break;
                    }
                    //记录登陆用户在userArrayList里面的索引
                    index = i;
                }
            }
        }
        if(index != -1 && index != -2){//找到索引
            System.out.println("登陆成功...");
            //登陆成功以后
            //（1）存款
            //（2）取款（如果余额不足要提示）
            //（3）查询余额（只能查看当前卡号的余额）
            showMenu();//显示功能菜单
        }else {
            if(index != -2){
                System.out.println("找不到该卡号");
            }
        }
    }

    public static void showMenu(){
        boolean flag = true;
        while(flag){
            System.out.println("1.存款 2.取款 3.查询余额 4.返回上一步");
            try{
                scanner = new Scanner(System.in);
                int UserInput = scanner.nextInt();
                switch (UserInput){
                    case 1:
                        //存款
                        deposit();
                        break;
                    case 2:
                        //取款
                        withdrawl();
                        break;
                    case 3:
                        //查询余额
                        User currentUser = userArrayList.get(index);
                        System.out.println(currentUser);
                        break;
                    case 4:
                        //返回上一步
                        flag = false;
                        break;
                }
            }catch (Exception e){
                System.out.println("输入错误，没有此选项");
            }
        }
    }

    public static void deposit(){
        System.out.println("请输入当前存款金额");
        int money = scanner.nextInt();
        User currentUser = userArrayList.get(index);
        //为当前用户累加金额
        currentUser.setMoney(currentUser.getMoney() + money);
        System.out.println(currentUser);
    }

    public static void withdrawl(){
        System.out.println("请输入当前取款金额");
        int money = scanner.nextInt();
        User currentUser = userArrayList.get(index);
        //为当前用户累加金额
        int diffMoney = currentUser.getMoney() - money;
        if(diffMoney < 0){
            System.out.println("您的余额不足");
            return;
        }
        currentUser.setMoney(diffMoney);
        System.out.println(currentUser);

    }
}


class User{
    private String cardNo;
    private String name;
    private String password;
    private int money = 0;//默认余额0

    @Override
    public String toString() {
        return "User{" +
                "cardNo='" + cardNo + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
