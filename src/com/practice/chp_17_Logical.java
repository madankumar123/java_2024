package com.practice;

public class chp_17_Logical {
    public static void main(String[] args) {
        boolean a =true;
        boolean b =true;
        boolean c =true;

     /*   if (a && b && c){
            System.out.println("And");
        }else{
            System.out.println("NotAnd");
        }                                    */

     /*   if (a || b || c){
            System.out.println("OR");
        }else{
            System.out.println("NotOR");
        }                                   */

        if (a != b == c){
            System.out.println("OR");
        }else{
            System.out.println("NotOR");
        }

        boolean a1 =true;
        boolean b1 =true;

        System.out.println("For Logical NOT");
        System.out.print("Not(a1) is ");
        System.out.println(!a1);
        System.out.print("Equal(b1) is ");
        System.out.println(b1);
    }
}
