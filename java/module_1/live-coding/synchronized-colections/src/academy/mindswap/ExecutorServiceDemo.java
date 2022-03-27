package academy.mindswap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);();

// SUBMIT 6 TASKS TO BE EXECUTED
        for(int i = 0; i < 60; i++){
            int finalI = i;
            fixedPool.submit(() -> {
                System.out.println("Task " + finalI + " is running on " + Thread.currentThread().getName());
            });
        };



// SHUT DOWN THE EXECUTOR
        fixedPool.shutdown();

    }
}
