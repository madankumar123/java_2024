package com.practice.ex3;

import java.util.Scanner;

public class Program_3_3_19 {
    public static void main(String[] args) {
          float  Tax = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your income in lakhs");
           float income= sc.nextFloat();
           if (income<=2.5f){
               Tax= Tax + 0;

           }else if (income>2.5f && income<=5f){
            Tax = Tax + 0.05f * (income - 2.5f);

        }else if (income>5f && income<=10.0f) {          // 5  0/p 0.125
            Tax = Tax + 0.05f * (5.0f - 2.5f);
            Tax = Tax + 0.2f * (income - 5f);


        }else if (income>10.0f) {
            Tax = Tax + 0.05f * (5.0f - 2.5f);
            Tax = Tax + 0.2f * (10.0f - 5f);
            Tax = Tax + 0.3f * (income - 10.0f);
        }
        System.out.println("the total tax paid by the employee"+Tax);
    }
}
