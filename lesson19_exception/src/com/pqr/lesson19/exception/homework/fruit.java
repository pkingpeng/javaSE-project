package com.pqr.lesson19.exception.homework;

/**
 * @file: fruit.java
 * @time: 2020/11/2 11:17 PM
 * Author by pengquanrun
 *
 * 创建自定义类水果，要求包含水果名称、单价、产地等属性
 * 使用HashSet存储水果，并提供equals方法和hashCode方法使用水果的名称属性判定水果是否相同，使用迭代器输出
 *
 */
public class fruit {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    @Override
    public String toString() {
        return "fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        fruit fruit = (fruit)obj;
        if(fruit.getName().equals(name)){
            return true;
        }
        return false;
    }
}
