package com.chaojun.basic.javautil;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        //使用lambda表达式传递条件给方法，  使用到了Predicate对象
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("145");
        list2.add("167");
        list2.add("8920");
        int i = judgeResult(list2, str -> str.contains("1"));
        System.out.println("i=" + i);


        //Stream的使用,
        IntStream is = IntStream.builder()
                .add(6)
                .add(5)
                .add(7)
                .add(4)
                .add(8)
                .build();
        //获取最大值
//        OptionalInt max = is.max();
//        System.out.println("max="+max);
        //获取最小值
//        OptionalInt min = is.min();
//        System.out.println("min="+min);
        //获取总值
//        System.out.println(is.sum());
        //获取元素个数
//        System.out.println(is.count());
        //获取平均值
//        System.out.println(is.average());
        //判断是否全部满足lambda表达式的条件
//        boolean result = is.allMatch(value -> value > 4);
//        System.out.println("result="+result);
        //判断是否有满足lambda表达式的条件
//        boolean result = is.anyMatch(value -> value > 7);
//        System.out.println("result="+result);
        //改变每个值后返回新的IntStream
//        IntStream intStream = is.map(value -> value * 2);
//        intStream.forEach(value -> System.out.println(value));
        //使用中间方法对Instream进行排序
//        IntStream sorted = intStream.sorted();
//        sorted.forEach(str-> System.out.println(str));

        //使用Collection转Stream方法操作集合
        Stream<String> stringStream = list2.stream().filter(value -> value.length() > 3);
        System.out.println(stringStream.findFirst());
    }

    public static int judgeResult(Collection<String> collection, Predicate<String> predicate) {
        int total = 0;
        for (String str : collection) {
            if (predicate.test(str)) {
                total++;
            }
        }
        return total;
    }
}
