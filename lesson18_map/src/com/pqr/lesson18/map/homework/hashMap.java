package com.pqr.lesson18.map.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @file: hashMap.java
 * @time: 2020/11/2 10:52 PM
 * Author by pengquanrun
 */
public class hashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        //存储
        hashMap.put("pqr",80);
        hashMap.put("ppp",70);
        hashMap.put("qqq",60);
        hashMap.put("qqq",50);
        //size
        System.out.println("size:" + hashMap.size());
        //print qqq -->被后面的 qqq:50覆盖
        System.out.println("qqq:" + hashMap.get("qqq"));
        // if contain
        System.out.println("if contains:" + hashMap.containsKey("pqr"));
        //return key set
        System.out.println("keySet:" + hashMap.keySet());
        //return entrySet
        System.out.println("entrySet:" + hashMap.entrySet());
        //return values collection
        System.out.println("values set:" + hashMap.values());
        //hashMap遍历 获取entry对象
        System.out.println("遍历hashMap");
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        //遍历方法2
        System.out.println("遍历方法2");
        Set<String> set = hashMap.keySet();
        for(String key: set){
            System.out.println(key + " = " + hashMap.get(key));
        }

        // homework : 其他的遍历方式
    }
}
