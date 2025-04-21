package com.interview.question;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync( () ->{
            return "Hello from "+Thread.currentThread().getName();
        });

        String result = future.join();
        System.out.println("result ="+ result);
    }

}
