package com.chaojun.basic.javagenerictype;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Chaojun_Lu
 * @Date: 2023/2/26
 * @Function:
 */
public class GenericTypeMothod {
    public static void main(String[] args) {
        Object[] o = {"1", "2"};
        ArrayList<String> list = new ArrayList<>();
        test(o, list);
    }

    public static void test(Object[] a, Collection<? extends Object> b){
        b.add("123");
    }
}
