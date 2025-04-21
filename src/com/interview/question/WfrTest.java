package com.interview.question;

import java.text.NumberFormat;
import java.util.Locale;

public class WfrTest {
    public static void main(String[] args) {
     String s1 = "9,999";
     String s2 = "999";
        System.out.println(add(s1,s2));

    }

    public static String add(String num1, String num2){
        StringBuffer result = new StringBuffer();
        int num1Length = num1.length();
        int num2Length = num2.length();
        int cary = 0;

        int i = num1Length - 1;
        int j = num2Length - 1;

        while(i >= 0 || j >= 0  || cary != 0){

            int dig1 = (i >= 0) ?num1.charAt(i) -'0':0;
            int dig2 = (j >= 0) ? num2.charAt(j) -'0':0;
            int  sum = dig1 + dig2 + cary;
            result.append(sum % 10) ;// taking last digit of sum
             cary = sum/10; // update
             i--;
             j--;
        }
       String out = result.reverse().toString();
        System.out.println("out = "+out);
        if(num1.contains(",") || num2.contains(",")){
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
            int formatednum = Integer.parseInt(numberFormat.format(Long.parseLong(out)));
            System.out.println("formatednum = "+ formatednum);
        }
        return result.reverse().toString();
    }
}
