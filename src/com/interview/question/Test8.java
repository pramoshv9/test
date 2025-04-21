package com.interview.question;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Test8 {

    public static void main(String[] args) {
        int[] arr = {1,5,7,-1};
        AtomicInteger count = new AtomicInteger();
        Arrays.stream(arr).sorted().boxed().forEach( obj ->{

         //   System.out.println(obj);
            if(count.get() == arr.length -2){
                System.out.println(obj);
            }

            count.getAndIncrement();
        });

    }
}
