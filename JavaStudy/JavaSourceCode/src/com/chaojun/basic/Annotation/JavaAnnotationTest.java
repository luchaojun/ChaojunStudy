package com.chaojun.basic.Annotation;

import java.util.ArrayList;
import java.util.List;

//SuppressWarning注解的使用
//@SuppressWarnings(value = "unchecked")
public class JavaAnnotationTest {
    public static void main(String[] args) {
        JavaAnnotationTest.test();

        //堆污染
//        List list = new ArrayList<Integer>();
//        list.add(1);
//        List<String> l = list;
//        System.out.println(l.get(0));

        //测试可能有堆污染的方法 使用@SafeVarargs， 消除堆污染
        JavaAnnotationTest.testAnnotation("123", "456");
    }

    //测试堆污染
    @SafeVarargs
    public static <T> void testAnnotation(T ... strs){

    }

    //Deprecated注解的使用
    @Deprecated(since = "3", forRemoval = true)
    public static void test(){

    }
}
