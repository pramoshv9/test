
package com;

public class Test7 {
   // Given an array of integers and a sum , find the number of pairs whose sum is
   // equal to sum Example : Input : array = {1,5,7,-1} and sum = 6

    public static void main(String[] args) {
        int[] arr = {1,5,7,-1};
        int sum  = 6 ;

        for(int i = 0 ; i < arr.length ; i++){
            int add = 0;
            for (int j  = i + 1 ; j <arr.length ; j++){
                add = arr[i] + arr[j];

                if( add == sum){
                    System.out.println(arr[i] + " + "+ arr[j] + " ="+ add);
                    add = 0;
                }else{
                   // System.out.println("else == > "+arr[i] + " + "+ arr[j] + " ="+ add);
                }
            }
        }
    }


}
