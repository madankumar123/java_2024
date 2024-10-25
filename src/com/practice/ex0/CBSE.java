package com.practice.ex0;

import java.util.Scanner;

public class CBSE {
    public static void main(String[] args) {
        // WAP to calculate percentage of an given subject in CBSE board exam, His marks from 5 subject
// must be taken as input from keyboard (marks out of 100)
        System.out.println("Enter marks in subjects");         // print
        Scanner sc = new Scanner(System.in);                  // object
        System.out.println("Enter maths subject marks");       // print
        float maths = sc.nextFloat();                         // ask for marks
        System.out.println("enter science marks" );
        float science = sc.nextFloat();
        System.out.println("enter social marks");
        float social = sc.nextFloat();
        System.out.println("enter kannada marks");
        float kannada = sc.nextFloat();

        float percentage = ((maths+science+social+kannada)/ 400.0f) *100;
        System.out.println(percentage);


    }
}
