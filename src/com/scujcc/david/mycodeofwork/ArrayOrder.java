package com.scujcc.david.mycodeofwork;

import java.util.Arrays;

/**
 * Created by David on 3/24/17.
 */

/*
 * 编程：给定一个字符串（全是字母），按升序排序。
 *
 * 思想：可以充分使用java类库提供的Arrays类。
 */
public class ArrayOrder {

        public static void main(String[] args) {
            String str = "sfsakjkdsgsa";
            char[] arr = str.toCharArray();         //使用String提供的toCharArray()方法将字符串转换成字符数组。
            Arrays.sort(arr);                       //然后直接使用Arrays的sort()方法进行排序。

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

}
