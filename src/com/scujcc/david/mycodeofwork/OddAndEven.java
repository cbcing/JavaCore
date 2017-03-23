package com.scujcc.david.mycodeofwork;

/**
 * Created by David on 3/22/17.
 */

/*
 * 编写程序计算100以内所有奇数和偶数的和各是多少？
 */
public class OddAndEven {
    public static void main(String [] args){
        int odd = 0, even = 0;
        for(int i = 1; i < 100; i++){
            if( i % 2 != 0)
                odd += i;
            else
                even += i;
        }
        System.out.println("100以内的奇数和是: " + odd);
        System.out.println("100以内的偶数和是: " + even);
    }
}
