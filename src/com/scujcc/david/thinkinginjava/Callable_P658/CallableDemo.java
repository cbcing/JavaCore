package com.scujcc.david.thinkinginjava.Callable_P658;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by David on 3/11/17.
 */

class TaskWithResult implements Callable<String>{
    private int id;

    public TaskWithResult(int id){
        this.id = id;
    }

    public String call(){
        return "result of TaskWithResult " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future> results = new ArrayList<Future>();

        for (int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }

        }

    }
}
