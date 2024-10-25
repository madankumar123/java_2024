package com.practice.ex3;

import java.util.Scanner;

public class Program_3_6_19 {
    public static void main(String[] args) {
      //  String Website = ".com";               //* without scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website");
        String Website = sc.next();
        if(Website.endsWith(".org")){
            System.out.println("organization website");
        }else if(Website.endsWith(".com")) {
            System.out.println("commercial website");
        }else if(Website.endsWith(".in")) {
            System.out.println("indian website");
        }
    }
}
