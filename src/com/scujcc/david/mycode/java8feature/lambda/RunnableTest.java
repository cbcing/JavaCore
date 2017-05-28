package com.scujcc.david.mycode.java8feature.lambda;

/**
 * @author MikeW
 */
public class RunnableTest {
  public static void main(String[] args) {
    
    System.out.println("=== RunnableTest ===");
    
    // Anonymous Runnable(匿名Runnable)
    Runnable r1 = new Runnable(){
      
      @Override
      public void run(){
        System.out.println("Hello world one!");
      }
    };
    
    // Lambda Runnable
    // 因为Runnable只有一个抽象方法run()。
    Runnable r2 = () -> System.out.println("Hello world two!");
    
    // Run em!
    r1.run();
    r2.run();
    
  }
}
