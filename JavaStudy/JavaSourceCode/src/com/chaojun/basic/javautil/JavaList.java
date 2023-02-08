package com.chaojun.basic.javautil;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        //List集合调用remove删除对象，  会调用对象的equals方法，  如果对象的equals方法始终return true， 将会删除第一个对象
        Person cj1 = new Person(1, "cj1", 21);
        Person cj2 = new Person(2, "cj2", 21);
        Person cj3 = new Person(3, "cj3", 21);
        Person cj4 = new Person(4, "cj4", 21);
        ArrayList<Object> list = new ArrayList<>();
        list.add(cj1);
        list.add(cj2);
        list.add(cj3);
        list.add(cj4);
//        System.out.println(list);
//        list.remove(cj2);
//        System.out.println(list);

        //测试java 1.8引入的sort方法
//        list.sort((a, b) -> b.getId() - a.getId());
//        System.out.println(list);

        //测试java 1.8引入的replaceAll方法
//        list.replaceAll(person -> ((Person)person).getName());
//        System.out.println(list);

        //测试java1.8引入的ListIterator的一些反向遍历的方法
        ListIterator<Object> objectListIterator = list.listIterator();
        while(objectListIterator.hasNext()){
            System.out.println(objectListIterator.next());
            objectListIterator.add("-------分隔符--------");
        }
        objectListIterator.next();
        System.out.println("-------加入分隔符字符串后进行反向遍历--------");
        while(objectListIterator.hasPrevious()){
            System.out.println(objectListIterator.previous());
        }
    }
}

