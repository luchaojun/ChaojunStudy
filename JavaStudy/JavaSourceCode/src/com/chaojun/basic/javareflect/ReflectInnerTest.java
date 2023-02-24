package com.chaojun.basic.javareflect;

import java.lang.reflect.Field;

/**
 * @Author: Chaojun_Lu
 * @Date: 2023/2/21
 * @Function:
 */
public class ReflectInnerTest {
    public class InA{
        private int a = 1;

        private void testInA(){
            System.out.println("testA方法被调用");
        }
    }

    public class InB{
        public void testInB() throws Exception {
            //正常New方法进行调用
//            InA a = new InA();
//            System.out.println(a.a);
//            a.testInA();

            InA inA = new InA();
            Class<InA> inAClass = InA.class;
            Field a = inAClass.getDeclaredField("a");
            a.setAccessible(true);
            a.setInt(inA, 2);
            System.out.println("a="+inA.a);
        }
    }


    public static void main(String[] args) throws Exception {
        //java11 新增方法  判断该类嵌套属主
        Class<ReflectInnerTest> reflectInnerTestClass = ReflectInnerTest.class;
        Class<InA> inAClass = InA.class;
        Class<InB> inBClass = InB.class;
        //获取类的嵌套宿主
        System.out.println("reflectInnerTestClass_nestHost="+reflectInnerTestClass.getNestHost());
        System.out.println("inBClass_nestHost="+inBClass.getNestHost());
        //判断两个类是否是嵌套宿主
        System.out.println(inAClass.isNestmateOf(inBClass));
        System.out.println(inAClass.isNestmateOf(reflectInnerTestClass));
        //获取当下类的嵌套宿主, 包括他自己
        Class<?>[] nestMembers = reflectInnerTestClass.getNestMembers();
        for(Class c : nestMembers){
            System.out.println("c="+c);
        }
    }
}
