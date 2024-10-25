package com.practice;

import java.util.Scanner;

public class Program_1_5_7 {
    public static void main(String[] args) {
        System.out.println("Enter integer");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();   // to check integer or not
        System.out.println(b1);   // if enter 1 gives true, if enter madan gives false
    }

}
