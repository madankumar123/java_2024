package com.practice.ex3;

import java.util.Scanner;

public class Program_3_2_19 {
  /*  public static void main(String[] args) {
        int m1=32,m2=33,m3=33;
        if(m1>=33){
            System.out.println("your passed in m1");
        }else{
            System.out.println("your failed in m1 sub ");
        }
        if(m2>=33) {
            System.out.println("your passedin m2");
        }  else{
                System.out.println("your failed in m3 sub ");
        }if(m2>=33) {
            System.out.println("your passedin m3");
        }else{
            System.out.println("your failed in m3 sub ");
        }
        int sum = (m1+m2+m3)/3;
        System.out.println("your total avg"+sum);  */
  public static void main(String[] args) {
      byte m1, m2, m3;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter marks in physics");
    m1=  sc.nextByte();
      System.out.println("enter marks in maths");
    m2=  sc.nextByte();
      System.out.println("enter marks in science");
    m3=  sc.nextByte();
      float avg = (m1+m2+m3)/3.0f;
      System.out.println("overall marks"+avg);
      if(avg>=40 && m1>=33 && m2>=33 && m3>=33){          // 40 is passing marks
          System.out.println("congrasts you are passed");  // if 41 congrats, 33 failed
      }else{
          System.out.println("you are Fialed");
      }
  }

    }
