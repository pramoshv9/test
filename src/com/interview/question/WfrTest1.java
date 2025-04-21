package com.interview.question;



import java.text.NumberFormat;
import java.util.Locale;

public class WfrTest1 {
    public static void main(String[] args) {
        String s1 = "9,999";
        String s2 = "999";
        System.out.println("Sum: " + add(s1, s2));
    }

    public static String add(String num1, String num2) {
        // Remove commas
        num1 = num1.replace(",", "");
        num2 = num2.replace(",", "");

        StringBuilder result = new StringBuilder();
        int num1Length = num1.length();
        int num2Length = num2.length();
        int carry = 0;

        int i = num1Length - 1;
        int j = num2Length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int dig1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int dig2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = dig1 + dig2 + carry;
            result.append(sum % 10); // Taking the last digit of sum
            carry = sum / 10; // Update carry
            i--;
            j--;
        }

        String out = result.reverse().toString();
        System.out.println("out : "+out);
        // Format output with commas
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return numberFormat.format(Long.parseLong(out));
    }
}
