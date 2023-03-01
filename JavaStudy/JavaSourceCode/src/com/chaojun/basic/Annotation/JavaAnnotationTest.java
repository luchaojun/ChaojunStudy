package com.chaojun.basic.Annotation;

public class JavaAnnotationTest {
    public static void main(String[] args) {
        JavaAnnotationTest.test();
    }

    @Deprecated(since = "3", forRemoval = true)
    public static void test(){

    }
}
