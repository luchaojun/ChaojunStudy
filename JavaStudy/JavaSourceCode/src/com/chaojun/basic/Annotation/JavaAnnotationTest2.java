package com.chaojun.basic.Annotation;

import java.lang.annotation.*;

public class JavaAnnotationTest2 {
    public static void main(String[] args) {

    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @Inherited
    @interface MyAnno{
        int age() default 12;
        String name() default "qc";
    }

    @MyAnno(name="cj", age=11)
    class TestAnno{

    }
}
