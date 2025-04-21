package com.morgstanly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginWithHashMap {
    public static void main(String[] args) {
        Map<String, String> userData = new HashMap<>();
        userData.put("pramod","Pass@123");
        userData.put("Ram","Ram@123");
        userData.put("Ravi","Ravi@123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name");
        String inputUserName = scanner.nextLine();
        System.out.println("Enter user password ");
        String inputpassword = scanner.nextLine();

        if(userData.containsKey(inputUserName)){
            if(userData.containsValue(inputpassword)){
                System.out.println("Login successfully..................");
            }else{
                System.out.println("Incorrect Password !");
            }

        }else{
            System.out.println("User Does not exist!");
        }

    }
}
