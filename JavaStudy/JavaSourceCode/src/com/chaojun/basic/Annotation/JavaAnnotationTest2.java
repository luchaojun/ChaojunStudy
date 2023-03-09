package com.chaojun.basic.Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;

public class JavaAnnotationTest2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Annotation[] annotations = TestAnno.class.getMethod("test").getAnnotations();
        for (Annotation a: annotations) {
            if(a instanceof MyAnno){
                int age = ((MyAnno) a).age();
                String name = ((MyAnno) a).name();
                System.out.println("age="+age+",name="+name);
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @Inherited
    @interface MyAnno{
        int age() default 12;
        String name() default "qc";
    }


    class TestAnno{
        @MyAnno(name="cj", age=11)
        public void test(){

        }
    }
}
