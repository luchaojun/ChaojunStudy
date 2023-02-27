package com.chaojun.basic.javagenerictype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericTypeTest {
    public static void main(String[] args) {
        //Java9 匿名内部类可以推测出实现方法的类型
//        Test<String> test = new Test<>(){
//            @Override
//            public void test1(String s) {
//
//            }
//        };

//        List<String>不是List<Object>的子类
//        new GenericTypeTest().genericTest(new ArrayList<String>());

        //下列代码运行时才会报错
//        Integer[] a = {1,2,3};
//        Number[] b = a;
//        b[0] = 0.1;

        //此集合声明方式只能放入null
//        ArrayList<?> list = new ArrayList<>();
//        list.add(null);
//        System.out.println(list.get(0));

        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        new GenericTypeTest().genericTest(dates);
    }




    public void genericTest(List<?> list){
        //List<?> 取出来的内容是Object类型
        Object o = list.get(0);
    }
}

class Car<T>{

    //静态代码块不能使用泛型
//    static{
//        T t;
//    }

//    static T t;  静态变量不能使用泛型

    //静态方法不能使用泛型
//    public static void drive(T t){
//
//    }

    public void test(){
        ArrayList<String> list = new ArrayList<>();
        //instance运算符后面不能使用泛型
//        System.out.println(list instanceof java.util.ArrayList<String>);
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
