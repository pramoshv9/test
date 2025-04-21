package com.arrys;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0;
  int n = arr.length;
        for(int i =0; i< n/2;i++){
            temp = arr[i];
            arr[i] = arr[n - i -1];
            arr[n - i -1] = temp;
        }
        for(int ar : arr){
            System.out.println(ar);
        }
    }
}
