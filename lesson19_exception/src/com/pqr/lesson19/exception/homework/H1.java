package com.pqr.lesson19.exception.homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @file: H1.java
 * @time: 2020/11/2 11:19 PM
 * Author by pengquanrun
 */
public class H1 {
    public static void main(String[] args) {
        HashSet<fruit> hashSet = new HashSet<fruit>();
        fruit f1 = new fruit();
        f1.setName("apple");
        f1.setPrice(12.00);
        f1.setAddress("China");
        hashSet.add(f1);

        fruit f2 = new fruit();
        f2.setName("apple");
        f2.setPrice(11.00);
        f2.setAddress("America");
        hashSet.add(f2);

        fruit f3 = new fruit();
        f3.setName("orange");
        f3.setPrice(10.00);
        f3.setAddress("America");
        hashSet.add(f3);

        Iterator<fruit> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
