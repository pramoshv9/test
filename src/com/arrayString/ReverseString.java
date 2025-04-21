package com.arrayString;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefghijklmnop";
        char[] strArr = str.toCharArray();
        String revstring = "";
        for(int i = 0 ; i < strArr.length ; i++){
            revstring =  strArr[i]+ revstring;
        }
        System.out.println(revstring);

        // next way
        int len = strArr.length;
        char temp ;
        for(int i = 0; i < len /2 ;i++){
       temp = strArr[i];
       strArr[i] = strArr[len - 1 - i];
            strArr[len - 1 - i] = temp;
        }
        System.out.println(" -----");
        System.out.println(strArr);
    }
}
