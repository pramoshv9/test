package com.arrys;

import java.util.Arrays;
import java.util.Collections;

public class SortIntArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        Arrays.sort(arr);
        System.out.println(arr[arr.length -2]);

        Integer[] arr2 = {3, 5, 7, 2, 8};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        int[] arr3= {3, 5, 7, 2, 8};

        int temp = 0;
        for(int i = 0 ; i < arr3.length - 1; i++){
            for(int j = i +1; j < arr3.length; j++){
                if(arr3[i] > arr3[j]){
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println("arr3");
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {3, 5, 7, 2, 8};

        int temp4 = 0;
        // Sorting using Bubble Sort (Ascending Order)
        for (int i = 0; i < arr4.length - 1; i++) {
            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[i] > arr4[j]) { // Corrected 'arr' to 'arr3'
                    temp4 = arr4[i];
                    arr4[i] = arr4[j];
                    arr4[j] = temp4;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr4));
    }
}
