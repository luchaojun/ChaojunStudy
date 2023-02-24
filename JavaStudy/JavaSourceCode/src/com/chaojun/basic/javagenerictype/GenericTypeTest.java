package com.chaojun.basic.javagenerictype;

import java.util.ArrayList;

public class GenericTypeTest {
    public static void main(String[] args) {
        //Java9 匿名内部类可以推测出实现方法的类型
//        Test<String> test = new Test<>(){
//            @Override
//            public void test1(String s) {
//
//            }
//        };

        Person person = new Person();
        person.info(123);
    }
}

class Person<T> {
    public void info(T t){

    }
}


interface Test<T>{
    void test1(T t);
}

//使用Apple类的时候这不写<>
class T1 implements Test{
    @Override
    public void test1(Object o) {

    }
}



//使用Apple类的时候传入实际类型
class A1 extends Apple<String>{

    @Override
    public void eat(String s) {

    }
}

abstract class Apple<T>{
    public abstract void eat(T t);
}
