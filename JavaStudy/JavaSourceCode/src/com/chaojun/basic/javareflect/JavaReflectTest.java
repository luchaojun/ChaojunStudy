package com.chaojun.basic.javareflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaReflectTest {
    public static void main(String[] args) throws Exception {
        Class<ClassTest> classTestClazz = ClassTest.class;
        //获取所有的构造器, 与修饰符无关
//        Constructor<?>[] classDeclaredConstructor = classTestClazz.getDeclaredConstructors();
//        for(Constructor c : classDeclaredConstructor){
//            System.out.println("Constructor="+c);
//        }

        //获取所有本类的方法， 与修饰符号无关
//        Method[] methods = classTestClazz.getDeclaredMethods();
//        for(Method m :  methods){
//            System.out.println("Method="+m);
//        }

        //根据参数获取指定方法
        Method paramMethod = classTestClazz.getDeclaredMethod("test1", int.class);
        System.out.println("DefineParaMethod="+paramMethod);
    }
}

class ClassTestFather{
   public void infoFather(){}
   public void infoFather(int i){}
}

@SuppressWarnings()
class ClassTest extends ClassTestFather{
    private ClassTest(){

    }

    public ClassTest(int id, String name){

    }

    public void info(){}
    public void info(int i){}
    protected void test1(int j){}
}
