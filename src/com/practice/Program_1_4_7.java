package com.practice;

import java.util.Scanner;

public class Program_1_4_7 {

    public static void main(String[] args) {
        double km,miles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Distance in kilometer");        // 1
       km = input.nextDouble();                                   // storing in km varable
             input.close();             //optional we can use

      miles = (km * 0.6213710);

        System.out.print("miles is : ");
        System.out.println(miles);
         System.out.printf("%f kilometers = %f miles ", km,miles);
        System.out.printf("%.3f kilometers = %.3f miles", km,miles);

    }
}
