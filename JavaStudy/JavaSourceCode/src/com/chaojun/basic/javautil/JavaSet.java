package com.chaojun.basic.javautil;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
//        TreeSet<Integer> treeSet = new TreeSet<Integer>((o1,o2)->{return o1>o2 ? 1 : -1;});
//        treeSet.add(6);
//        treeSet.add(4);
//        treeSet.add(7);
//        treeSet.add(3);
//        treeSet.add(2);
        //获取treeSet第一个元素
//        System.out.println(treeSet.first());
        //获取treeSet最后一个元素
//        System.out.println(treeSet.last());
        //获取treeSet指定元素前一个元素
//        System.out.println(treeSet.lower(5));
        //获取treeSet指定元素后一个元素
//        System.out.println(treeSet.higher(5));
        //获取treeSet从3到7的元素，包括3，不包括7
//        SortedSet<Integer> sortedSet = treeSet.subSet(1, 9);
//        System.out.println(sortedSet);
        //获取treeSet小于5的元素
//        System.out.println(treeSet.headSet(5));
        //获取treeSet大于5的元素
//        System.out.println(treeSet.tailSet(5));

        //测试compator接口的compare方法排序
//        TreeSet<Integer> treeSet2 = new TreeSet<Integer>((o1,o2)->{return o1>o2 ? 1 : -1;});
//        treeSet2.add(6);
//        treeSet2.add(4);
//        treeSet2.add(7);
//        treeSet2.add(3);
//        treeSet2.add(2);
//        System.out.println(treeSet2);

        TreeSet<TreeSetTest> treeSet = new TreeSet<>();
        treeSet.add(new TreeSetTest("cj1", 21));
        treeSet.add(new TreeSetTest("cj2", 22));
        treeSet.add(new TreeSetTest("cj3", 23));
        System.out.println(treeSet);
    }
}
class TreeSetTest implements Comparable{
    private String name;
    private int age;

    public TreeSetTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals方法");
       return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compareTo方法呗调用");
        return 0;
    }

    @Override
    public String toString() {
        return "TreeSetTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
