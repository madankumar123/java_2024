package com.practice;

import java.util.Scanner;

public class chp_5_ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter a input");
        Scanner sc = new Scanner(System.in);
     /*  System.out.println("Enter number 1");
//        int a = sc.nextInt();
      System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println(sum); */

      /*  float a= sc.nextFloat();
        float b= sc.nextFloat();
        float sum = a*b;
        System.out.println(sum); */

      /*  boolean b1 = sc.hasNextInt();          // 1 true,   1.1 false
        boolean b2 = sc.hasNextBoolean();      // 1 false,  true true
        System.out.println(b1); */

       /* String str= sc.next();
        System.out.println(str);  */       // harry is good  op: harry          12 32 23   OP: 12

        String str1 =sc.nextLine();      // harry is good  op: harry is good
        System.out.println(str1);

    }
}
