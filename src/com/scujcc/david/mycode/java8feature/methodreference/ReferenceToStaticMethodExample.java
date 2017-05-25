package com.scujcc.david.mycode.java8feature.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by David on 5/24/17.
 */

//引用静态方法。

public class ReferenceToStaticMethodExample {
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List findPrimeNumbers(List list, Predicate predicate) {
        List sortedNumbers = new ArrayList();
        list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> {sortedNumbers.add(i);});
        return sortedNumbers;
    }

    public static void main(String[] args) {
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16);
        List primeNumbers = ReferenceToStaticMethodExample.findPrimeNumbers(numbers, (number) -> ReferenceToStaticMethodExample.isPrime((int) number));
//        List primeNumbers = ReferenceToStaticMethodExample.findPrimeNumbers(numbers, ReferenceToStaticMethodExample::isPrime);
        System.out.println("Prime Numbers are " + primeNumbers);
    }
}
