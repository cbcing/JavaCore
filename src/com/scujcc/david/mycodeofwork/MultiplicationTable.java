package com.scujcc.david.mycodeofwork;

/**
 * Created by David on 3/23/17.
 */

/*
 * 编程输出99乘法表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 0; x <= 9; x++){
            for (int y = 1; y <= x; y++){
                System.out.print(y + "*" + x + "=" + (x * y) +"\t");
            }
            System.out.println();
        }
    }
}
