package com.scujcc.david.mycode.java8feature;

/**
 * Created by David on 5/11/17.
 */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        //类型声明。
        MathOperation addition = (int a, int b) -> a + b;

        //不用类型声明。
        MathOperation subtraction = (a, b) -> a - b;

        //大括号中的返回语句。
        MathOperation multiplication = (int a, int b) -> {return (a*b);};

        //没有大括号中及返回语句。
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lambdaTest.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambdaTest.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + lambdaTest.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambdaTest.operate(10, 5, division));

        //不用括号。
        GreetingService greetingService = message -> System.out.println("Hello " + message);

        //用括号。
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        greetingService.sayMessage("Bai Chuan");
        greetingService2.sayMessage("David");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}
