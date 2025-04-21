package com.arrys;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,888,88,88};
        //reversing array
        int temp = 0;
        int lenghtOaary = arr.length;

        for(int i = 0; i < lenghtOaary /2 ; i++){
             temp = arr[i];
            arr[i] = arr[lenghtOaary  -1 - i];
            arr[lenghtOaary  -1 - i] = temp;
        }

       for(int ar : arr){
           System.out.print(ar +" ");
       }
    }
}
