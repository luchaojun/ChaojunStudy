package com.chaojun.basic.javautil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

public class JavaMap {
    public static void main(String[] args) {
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
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("x", 13);
        linkedHashMap.put("Y", 10);
        linkedHashMap.put("Z", 11);
        System.out.println(linkedHashMap);
    }
}

class A{
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
}
