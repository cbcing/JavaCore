package com.scujcc.david.mycodeofwork;

import java.util.Scanner;

/**
 * Created by David on 3/29/17.
 */
/*
 * 递归求n!
 */
public class Recursive {
    public static int factorial(int n){
        if (n < 0){
            System.out.println("请输出大于0的整数");
        } else if (n == 0 || n == 1){
            return 1;
        } else
            return n * factorial(n - 1);
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(factorial(x));
    }

}
