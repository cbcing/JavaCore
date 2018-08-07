package com.scujcc.david.jvm.classloading.passivereference;

/**
 *
 * 类加载过程：加载 -> 验证 -> 准备 -> 解析 -> 初始化 -> 使用 -> 卸载
 *
 * 被动引用：所有引用类的方式都不会触发初始化
 * 被动引用的类，是没有初始化这个过程的
 *
 */

public class PassiveReferenceDemo {
    public static void main(String[] args) {
        System.out.println("=======================1.");
        /**
         * 情况1：通过子类引用父类的静态字段，不会导致子类的初始化
         *
         * 输出结果：
         * Super class init.
         * 123
         */
        System.out.println(SubClass.value);

        System.out.println("=======================2.");

        /**
         * 情况2：通过数组定义来引用类，不会触发此类的初始化
         *
         * 输出结果：（没有输出，因为没有触发任何类的初始化）
         */
        SuperClass[] superClasses = new SuperClass[10];
        System.out.println("=======================3.");

        /**
         * 情况3：常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的初始化。
         *
         * 输出结果：
         * CONSTCLASS.
         */
        System.out.println(ConstClass.HELLO);

    }
}