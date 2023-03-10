package com.chaojun.basic.Annotation;

import java.awt.event.ActionListener;
import java.lang.annotation.*;

//自定义重复注解
public class JavaAnnotationTest3 {
    public static void main(String[] args) {

    }
}

@Repeatable(MyTags.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyTag{
    int number();
    String name();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyTags{
    MyTag[] value();
}


@MyTag(number=123, name="cj")
@MyTag(number=456, name="qc")
class TestRepeatTag{

}
