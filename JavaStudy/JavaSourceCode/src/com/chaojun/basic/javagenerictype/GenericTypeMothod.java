package com.chaojun.basic.javagenerictype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author: Chaojun_Lu
 * @Date: 2023/2/26
 * @Function:
 */
public class GenericTypeMothod {
    public static void main(String[] args) {
        Object[] o = {"1", "2"};
        ArrayList<String> list = new ArrayList<>();
//        test(o, list);

        //测试范型型参的匹配
//        Collections.copy(o, list);
//       GenericTypeMothod.<Integer>test2();
    }

    public static <T extends String> void test2(){

    }
}
