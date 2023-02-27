package com.chaojun.basic.javagenerictype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class GenericTypeTest2 {
    public static void main(String[] args) {
//        List<Test1> list = new ArrayList<>();
//        list.add(new Test1());
//        //调用设置通配符上限的方法
//        new GenericTypeTest2().test(list);

//        List<TestFather> list = new ArrayList<>();
//        list.add(new Test1());
//        list.add(new Test1());
//        //调用设置通配符下限的方法
//        new GenericTypeTest2().test2(list);



//        List<Test1> list = new ArrayList<>();
//        List<Test2> list2 = new ArrayList<>();
        //使用通配符下限的方式
//        new GenericTypeTest2().test3(list, list2);

        //测试设置多个上限，  至多一个父类上限多个接口上限
//        new TestMoreGenericType<Test1>();

        //测试范型设置上限和下限的斜变和逆变
//        ArrayList<? super TestFather> test1 = new ArrayList<>();
//        test1.add(new Test2());
//        ArrayList<? extends TestFather> test2 = new ArrayList<>();
//        test2.add(new Test2());
    }

    public void test(List<? extends TestFather> list){
        System.out.println("test List<? extends TestFather> 被调用了");
        //指定了上限的通配符只能取出数据不能增加数据
//        list.add(new Test3());
    }

    public void test2(List<? super TestFather> list){
        System.out.println("test2 List<? super TestFather> list");
    }

    public <T> void test3(Collection<? super T> list1, Collection<T> list2){

    }

    public void test4(TestMoreGenericType t){

    }
}

//为类定义多个范型
class TestMoreGenericType<T extends TestFather & Serializable>{

}

abstract class TestFather{

}

class Test1 extends TestFather implements Serializable{

}

class Test2 extends TestFather{

}

class Test3 extends TestFather{

}
