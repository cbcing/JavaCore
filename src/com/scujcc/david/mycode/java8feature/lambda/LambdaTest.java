package com.scujcc.david.mycode.java8feature.lambda;

/**
 * Created by David on 5/11/17.
 */

/*
 * lambda表达式带来的好处：1、代码更简洁； 2、代码等价灵活（eg：可以有效应对不同的需求）。
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

    /*
     * 函数式借口：借口里面只定义一个抽象方法的借口。
     * 如果一个接口定义了多个方法，但是只有一个方法是抽象方法，此接口也是函数是接口。
     * 默认实现和静态不会影响函数式接口出错。
     */
    interface MathOperation {
        int operation(int a, int b);    //operation 是 谓词。
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}
