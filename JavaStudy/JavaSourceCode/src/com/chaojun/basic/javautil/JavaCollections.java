package com.chaojun.basic.javautil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);

// ==============Collections排序操作================
          //list集合元素倒置
//        Collections.reverse(list);
//        System.out.println("reverse="+list);
          //list洗牌
//        Collections.shuffle(list);
//        System.out.println("shuffle="+list);
          //list集合排序
//        Collections.sort(list);
//        System.out.println("sort="+list);
          //list集合自定义排序
//        Collections.sort(list, (a, b)-> a>b?-1:(a<b?1:0));
//        System.out.println("sortComparator="+list);
        //list集合指定位置倒置
//        Collections.swap(list, 1, 2);
//        System.out.println("swap="+list);
        //distance索引后的元素往前移动
//        Collections.rotate(list, -3);
//        System.out.println("rotate="+list);

// ==============Collections查找和替换操作================
//        Collections.sort(list);
        //二分法查找
//        System.out.println("binarySearch="+Collections.binarySearch(list, 4));
        //查找最大值
//        System.out.println("max="+Collections.max(list));
//        System.out.println("max="+Collections.max(list, (a, b)-> a>b?1:(a<b?-1:0)));
        //查找最小值
//        System.out.println("min="+Collections.min(list));
//        System.out.println("min="+Collections.max(list, (a, b)-> a>b?1:(a<b?-1:0)));
        //使用指定元素替换集合里面的所有值
//        Collections.fill(list, 100);
//        System.out.println(list);
        //指定元素在集合当中出现的次数
//        System.out.println(Collections.frequency(list, 5));
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(5);
//        list2.add(3);
//        //查找list中第一次出现list2的索引
//        System.out.println(Collections.indexOfSubList(list, list2));
//        //查找list中最后一次出现list2的索引
//        System.out.println(Collections.lastIndexOfSubList(list, list2));
        //list中用旧值替换新值
//        Collections.replaceAll(list, 5, 100);
//        System.out.println("replaceAll="+list);

        //=========同步控制===========
//        List<Integer> syncList = Collections.synchronizedList(list);

        //=========设置不可变集合=====
        //(1)======设置一个不可变空集合=====
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add("123");
        //(2)======设置一个单个元素空集合=====
//        List<String> singletonList = Collections.singletonList("123");
//        System.out.println(singletonList.get(0));

        //=====java9新加功能， 通过 集合接口.of()创建不可变集合
//        List<Integer> listOf = List.of(5, 3, 4, 1, 2);
        Map<String, String> mapOfEntries = Map.ofEntries(Map.entry("1", "2"));
        System.out.println(mapOfEntries);
    }
}
