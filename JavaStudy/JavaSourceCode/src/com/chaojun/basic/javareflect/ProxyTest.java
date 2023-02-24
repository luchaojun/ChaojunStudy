package com.chaojun.basic.javareflect;

import java.lang.reflect.*;


//测试代理模式
public class ProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Animal dog = new Dog();
        InvocationHandler myInvocation = new MyInvocation(dog);
        Animal a = (Animal)Proxy.newProxyInstance(Dog.class.getClassLoader(), new Class[]{Animal.class}, myInvocation);
        a.info();
        a.shut();
    }
}

class MyInvocation implements InvocationHandler{
    public Object o;
    public MyInvocation(Object o){
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=======1========");
        method.invoke(o, args);
        System.out.println("=======2========");
        return null;
    }
}


interface Animal{
    void info();
    void shut();
}

class Dog implements Animal{
    @Override
    public void info() {
        System.out.println("信息是狗狗");
    }

    @Override
    public void shut() {
        System.out.println("喜欢叫");
    }
}
