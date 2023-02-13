package com.chaojun.basic.javautil;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
          //list集合元素倒置
//        Collections.reverse(list);
//        System.out.println("reverse="+list);
          //list洗牌
//        Collections.shuffle(list);
//        System.out.println("shuffle="+list);
          //list集合排序
//        Collections.sort(list);
//        System.out.println("sort="+list);
          //list集合自定义排序
//        Collections.sort(list, (a, b)-> a>b?-1:(a<b?1:0));
//        System.out.println("sortComparator="+list);
        //list集合指定位置倒置
//        Collections.swap(list, 1, 2);
//        System.out.println("swap="+list);
        //distance索引后的元素往前移动
        Collections.rotate(list, -3);
        System.out.println("rotate="+list);
    }
}
