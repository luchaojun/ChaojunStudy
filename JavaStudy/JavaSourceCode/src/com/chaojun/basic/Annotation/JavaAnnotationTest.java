package com.chaojun.basic.Annotation;

import java.util.ArrayList;
import java.util.List;

//SuppressWarning注解的使用
@SuppressWarnings(value = "unchecked")
public class JavaAnnotationTest {
    public static void main(String[] args) {
        JavaAnnotationTest.test();

        List list = new ArrayList<Integer>();
        list.add(1);
        List<String> l = list;
        System.out.println(l.get(0));
    }

    public void testAnnotation(){
        ArrayList<String> list = new ArrayList();
    }

    //Deprecated注解的使用
    @Deprecated(since = "3", forRemoval = true)
    public static void test(){

    }
}
