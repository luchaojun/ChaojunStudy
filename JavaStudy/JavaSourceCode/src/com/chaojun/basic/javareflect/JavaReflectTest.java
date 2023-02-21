package com.chaojun.basic.javareflect;

import java.lang.reflect.*;
import java.util.List;

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
//        Method paramMethod = classTestClazz.getDeclaredMethod("test1", int.class);
//        System.out.println("DefineParaMethod="+paramMethod);

        //获取形参的名字 类型 范型
//        Constructor<ClassTest> constructor = classTestClazz.getConstructor(String.class, List.class);
//        int parameterCount = constructor.getParameterCount();
//        System.out.println("parameterCount="+parameterCount);
//        Parameter[] parameters = constructor.getParameters();
//        System.out.println("isNamePresent="+parameters[0].isNamePresent());
//        System.out.println("name="+parameters[0].getName());
//        System.out.println("type="+parameters[0].getType());
//        System.out.println("范型="+parameters[0].getParameterizedType());

        //反射调用方法
//        Constructor<ClassTest> constructor = classTestClazz.getConstructor();
//        ClassTest classTest = constructor.newInstance();
//        Method paramMethod = classTestClazz.getDeclaredMethod("test1", int.class);
//        paramMethod.setAccessible(true);
//        Object invoke = paramMethod.invoke(null, 16);
//        System.out.println("invoke="+invoke);

        ClassTest classTest = new ClassTest();
        Field name = classTestClazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(classTest, "cj");
        Field age = classTestClazz.getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(classTest, 456);
        System.out.println(classTest.getName()+"...."+classTest.getAge());

        Method paramMethod = classTestClazz.getDeclaredMethod("test1", int.class);
        System.out.println("DefineParaMethod="+paramMethod);
    }
}

class ClassTestFather{
   public void infoFather(){}
   public void infoFather(int i){}
}

class ClassTest extends ClassTestFather{
    private String name;
    private int age;

    public ClassTest(){}

    public ClassTest(String id, List<Integer> name){}

    public void info(){}
    public void info(int i){}
    private static void test1(int j){
        System.out.println("j="+j);
    }

    public String getName() {
        System.out.println("getName方法");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
