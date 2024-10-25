package com.practice;

import java.util.Scanner;

public class chp_23_Scanner_ForLoop {
    public static void main(String[] args) {
  /*      int n = 10;
        System.out.println("first n natural numbers are: ");
        for(int i=0; i<n; i++){                                     // 0 to 9
            System.out.println(i);                                 // n natural numbers
        }
        System.out.println("The reverse order are: ");
        for(int i=n-1; i>=0; i--){                                  // 9 to 0
            System.out.println(i);
    }*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>0; i--){                                  // 9 to 0
            System.out.println(i);
}
}}

