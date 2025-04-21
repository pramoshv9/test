package com.interview.question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int midValue = 5;
        //find duplicate  int
      Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet().stream().filter(obj-> obj.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map);

        int mid = arr.length/2;
        System.out.println("mid ="+mid);
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < mid;i++){
            newArr[i] = arr[i];
        }

        newArr[mid] = midValue;
        for(int i = mid +1; i < newArr.length; i++ ){
            newArr[i] = arr[i - 1];
        }
        System.out.println(arr.length);
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(newArr.length);

        for(int i = 0; i <newArr.length ; i++){
            System.out.print(newArr[i]);
            System.out.print(" ");
        }
    }
}
