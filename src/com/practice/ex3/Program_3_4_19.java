package com.practice.ex3;

import java.util.Scanner;

public class Program_3_4_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day =sc.nextByte();
       // int day = 2                       // without scanner class
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");    // 2 hakiddre ide value barbeku andaga -switch
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("Thus");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");
        }


        }

    }
