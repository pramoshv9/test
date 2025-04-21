package com.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,5,6,};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("-----");
        Integer[] arr2 = {1,2,3,4,5,3,5,6,};
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
