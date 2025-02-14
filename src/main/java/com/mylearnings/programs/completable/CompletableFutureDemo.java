package com.mylearnings.programs.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws  Exception{
        CompletableFutureDemo.supplyAsync();
        runAsync();
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

//✔ supplyAsync() runs asynchronously in a separate thread and returns a result.
//✔ join() blocks until the result is available.
    public static  String supplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread : "+Thread.currentThread().getName());
            return "Hello, supplyAsync!";
        });
        System.out.println(future.join());
        return future.get();
    }

    //Use runAsync() when no result is needed.
    public static void runAsync() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(() -> {
            System.out.println("Thread : "+Thread.currentThread().getName());
            System.out.println("Hello, runAsync!");
        });
    }


}
