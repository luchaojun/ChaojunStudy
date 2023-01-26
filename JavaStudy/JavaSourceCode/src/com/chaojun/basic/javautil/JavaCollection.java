package com.chaojun.basic.javautil;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

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

        //使用lambda表达式测试removeIf方法 -- 删除符合条件的对象
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("145");
        list.add("167");
        list.add("8920");
        list.removeIf(str -> str.contains("1"));
        System.out.println(list);


        IntStream is = IntStream.builder()
                .add(6)
                .add(5)
                .add(7)
                .add(4)
                .add(8)
                .build();
        OptionalInt max = is.max();
        System.out.println(max.getAsInt());
    }
}
