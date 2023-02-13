package com.chaojun.basic.javautil;

import java.io.*;
import java.security.IdentityScope;
import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws FileNotFoundException {
        //测试HashMap加入数据比对equals方法和hashcode方法
//        Person p1 = new Person(1, "cj1", 22);
//        Person p2 = new Person(1, "cj1", 22);
//        HashMap<Person, String> map = new HashMap<>();
//        map.put(p1, "1");
//        map.put(p2, "1");
//        System.out.println(map);
//        System.out.println(map.containsKey(new Person(2, "cj1", 22)));
//        System.out.println(map.containsValue(new Person(2, "cj1", 22)));

//        Person p1 = new Person(1, "cj1", 22);
//        Person p2 = new Person(2, "cj2", 23);
//        Person p3 = new Person(3, "cj3", 24);
//        Person p4 = new Person(4, "cj4", 25);
//        Person p5 = new Person(5, "cj5", 26);
//        HashMap<Person, String> map = new HashMap<>();
//        map.put(p1, "1");
//        map.put(p2, "2");
//        map.put(p3, "3");
//        map.put(p4, "4");
//        map.put(p5, "5");
//        //放入map集合当中的key是对象, 修改此key对象后不能被查询到也不能不删除
//        p3.setName("cjj3");
////        System.out.println(map.get(p3));
////        map.remove(p3);
////        System.out.println(map);
//        System.out.println(map);


        //测试加入Map集合的key是可变对象， 修改此key对象后不能被查询到也不能不删除
//        HashMap<A, String> map = new HashMap<>();
//        map.put(new A(10), "cj1");
//        map.put(new A(20), "cj2");
//        Iterator<A> iterator = map.keySet().iterator();
//        A a = iterator.next();
//        System.out.println("a.count="+a.getCount());
//        a.setCount(10);
//        System.out.println(map.remove(new A(10)));
//        System.out.println(map.get(new A(20)));
//        System.out.println(map.get(new A(10)));

        //测试LinkedHashMap的使用
//        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("x", 13);
//        linkedHashMap.put("Y", 10);
//        linkedHashMap.put("Z", 11);
//        System.out.println(linkedHashMap);


        //测试properties存储数据到文件
//        try {
//            Properties p = new Properties();
//            p.setProperty("number", "1");
//            p.setProperty("name", "cj");
//            p.setProperty("age", "29");
//            p.store(new FileWriter("test.prop"), "test");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //测试properties加载文件到properties
//        Properties p = new Properties();
//        p.setProperty("sex", "male");
//        try {
//            p.load(new FileReader("test.prop"));
//            p.store(new FileOutputStream("test.prop"), "test");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(p);

        //测试TreeMap一些特有的API
//        TreeMap<A, String> treeMap = new TreeMap<>();
//        A a1 = new A(3);
//        A a2 = new A(1);
//        A a3 = new A(2);
//        A a4 = new A(5);
//        A a5 = new A(4);
//        treeMap.put(a1, "3");
//        treeMap.put(a2, "1");
//        treeMap.put(a3, "2");
//        treeMap.put(a4, "5");
//        treeMap.put(a5, "4");
//        System.out.println(treeMap);
//        Map.Entry<A, String> firstEntry = treeMap.firstEntry();
//        System.out.println("firstEntry=" + firstEntry);
//        System.out.println("first key=" + treeMap.firstKey());
//        Map.Entry<A, String> lastEntry = treeMap.lastEntry();
//        System.out.println("lastEntry=" + lastEntry);
//        System.out.println("last key=" + treeMap.lastKey());
//        System.out.println("treeMap.higherEntry=" + treeMap.higherEntry(new A(3)));
//        System.out.println("treeMap.lowerEntry=" + treeMap.lowerEntry(new A(3)));
//        System.out.println("treeMap.higherKey=" + treeMap.higherKey(new A(3)));
//        System.out.println("treeMap.lowerKey=" + treeMap.lowerKey(new A(3)));
//        SortedMap<A, String> subMap2Argue = treeMap.subMap(new A(2), new A(5));
//        System.out.println("subMap=" + subMap2Argue);
//        SortedMap<A, String> subMap4Argue = treeMap.subMap(new A(2), false, new A(5), true);
//        System.out.println("subMap4Argue=" + subMap4Argue);
//        SortedMap<A, String> tailMap1Argue = treeMap.tailMap(new A(3));
//        System.out.println("tailMap1Argue=" + tailMap1Argue);
//        SortedMap<A, String> tailMap2Argue = treeMap.tailMap(new A(3), true);
//        System.out.println("tailMap2Argue=" + tailMap2Argue);
//        SortedMap<A, String> headMap1Argue = treeMap.headMap(new A(3));
//        System.out.println("tailMap1Argue=" + headMap1Argue);
//        SortedMap<A, String> headMap2Argue = treeMap.headMap(new A(3), true);
//        System.out.println("headMap2Argue=" + headMap2Argue);

        //测试WeakHashMap的使用方式
//        String s1 = new String("1");
//        String s2 = new String("2");
//        String s3 = new String("3");
//        String s4 = new String("4");
//        String s5 = new String("5");
//        String s6 = new String("6");
//        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
//        weakHashMap.put(s1, s2);
//        weakHashMap.put(s3, s4);
//        weakHashMap.put(s5, s6);
//        System.out.println(weakHashMap);
//        s1 = null;
//        s2 = null;
//        System.gc();
//        System.out.println(weakHashMap);

          //测试IdentityHashMap
//        IdentityHashMap<String, String> stringStringIdentityHashMap = new IdentityHashMap<>();
//        stringStringIdentityHashMap.put(new String("1"), "1");
//        stringStringIdentityHashMap.put(new String("1"), "2");
//        stringStringIdentityHashMap.put("1", "6");
//        stringStringIdentityHashMap.put("1", "4");
//        stringStringIdentityHashMap.put("1", "3");
//        System.out.println(stringStringIdentityHashMap);
    }
}

class A implements Comparable {
    private int count;

    public A(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "A{" +
                "count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return count == a.count;
    }

    @Override
    public int hashCode() {
        return this.count;
    }

    @Override
    public int compareTo(Object o) {
        A a = (A) o;
        return this.count > a.count ? 1 : (this.count < a.count ? -1 : 0);
    }
}
