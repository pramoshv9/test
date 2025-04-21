package com.interview.question;


import java.text.NumberFormat;
import java.util.Locale;

public class WfrTest2 {
    public static void main(String[] args) {
        String s1 = "9,999";
        String s2 = "1";
        System.out.println("Sum: " + add(s1, s2));
    }

    public static String add(String num1, String num2){
        num1 = num1.replace(",","");
        num2= num2.replace(",","");
StringBuilder  result = new StringBuilder();
        int num1Length = num1.length();
        int num2Length = num2.length();
        int carry = 0;
        int i = num1Length - 1;
        int j = num2Length - 1;

        while (i >= 0 || j >= 0 || carry !=0){
         int dig1 = (i >= 0) ? num1.charAt(i) -'0' : 0;
         int dig2 = (j >= 0 ) ? num2.charAt(j)-'0':0;
         int sum = dig1 + dig2 + carry;
         result.append(sum % 10);
         carry = sum / 10;
         i--;
         j--;
        }
        String out = result.reverse().toString();
        System.out.println(out);

        NumberFormat format = NumberFormat.getNumberInstance(Locale.US);

 return  format.format(Long.parseLong(out));
    }
}