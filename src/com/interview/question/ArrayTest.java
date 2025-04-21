package com.interview.question;

import java.util.HashMap;
import java.util.TreeMap;

public class ArrayTest {
    public static void main(String[] args) {
        String[] input = {
                "Alice:Math=80,Science=90,English=70",
                "Bob:Math=85,Science=80,English=88",
                "Charlie:Math=78,Science=82,English=79"
        };
        TreeMap<Integer,String> gradMap = new TreeMap<>();
        for(int i = 0; i <input.length ; i++){
            String str = input[i];
            gradData(str, gradMap);
            //System.out.println(str);
        }
        gradMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println("Toper Student : "+gradMap.lastKey() + " : "+gradMap.get(gradMap.lastKey()));
    }

    public static void gradData(String str, TreeMap gradMap){
        System.out.println(str);
        String[] strArr = str.split(":");
        String name= strArr[0];   // student name
        String subject= strArr[1];  // subject string
        String[] subjectArr = subject.split(",");
        int avg=0;
        int total=0;
        for(int j=0; j < subjectArr.length; j++){
             String[] subGrd = subjectArr[j].split("=");
            total = total +Integer.parseInt(subGrd[1]);
        }
        avg  = total/subjectArr.length;
        gradMap.put(avg,name);
        System.out.println(name +" :" +avg + " : "+total);

    }
}
