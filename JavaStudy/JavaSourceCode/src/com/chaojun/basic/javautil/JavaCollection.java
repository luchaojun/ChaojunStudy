package com.chaojun.basic.javautil;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class JavaCollection {
    public static void main(String[] args) {
        //List toArray方法的使用，     String[]::new代表返回的泛型类型
        List<String> strs = List.of("a", "b", "c");
        String[] strings = strs.toArray(String[]::new);


        //使用Iterable接口当中的forEach方法便利集合，  另外用到lambda表达式
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.forEach(obj -> System.out.println(obj));
    }
}
