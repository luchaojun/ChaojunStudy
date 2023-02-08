package com.chaojun.basic.javautil;
import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) {
        //测试HashMap加入数据比对equals方法和hashcode方法
        Person p1 = new Person(1, "cj1", 22);
        Person p2 = new Person(1, "cj1", 22);
        HashMap<Person, String> map = new HashMap<>();
        map.put(p1, "1");
        map.put(p2, "1");
        System.out.println(map);
        System.out.println(map.containsKey(new Person(2, "cj1", 22)));
        System.out.println(map.containsValue(new Person(2, "cj1", 22)));
    }
}
