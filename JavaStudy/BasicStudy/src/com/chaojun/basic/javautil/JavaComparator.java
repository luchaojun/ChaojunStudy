package com.chaojun.basic.javautil;

import java.util.ArrayList;

public class JavaComparator {
    public static void main(String[] args) {
        //比较数字
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(1);
        num.add(2);
        num.sort((a, b) -> {
            System.out.println("a="+a+",b="+b);
            // a,b是升序  b,a是降序
            return b.compareTo(a);
        });
        System.out.println("num=" + num);

        //比较字符串
        ArrayList<String> str = new ArrayList<>();
        str.add("b");
        str.add("A");
        str.add("a");
        str.sort((a, b) -> {
            System.out.println("a="+a+",b="+b);
            // a,b是升序  b,a是降序
            return b.compareTo(a);
        });
        System.out.println("str=" + str);
    }
}
