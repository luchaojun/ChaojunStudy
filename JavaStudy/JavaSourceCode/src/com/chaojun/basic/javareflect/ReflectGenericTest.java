package com.chaojun.basic.javareflect;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;


//获取范型的类型
public class ReflectGenericTest {
    private HashMap<Integer, String> map;
    public static void main(String[] args) throws Exception {
        Class<ReflectGenericTest> reflectGenericTestClass = ReflectGenericTest.class;
        Field mapField = reflectGenericTestClass.getDeclaredField("map");
        Type genericType = mapField.getGenericType();
        if(genericType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
            for(Type t : actualTypeArguments){
                System.out.println("t="+t);
            }
        }
    }
}
