package com.practice;

public class chp_10_increment_decrement {
    public static void main(String[] args) {
        // increment

//        int i = 52;
//        System.out.println(i);    // 52
//        System.out.println(i++);  // 52
//        System.out.println(i);    // 53
//        System.out.println(i);    // 53
//        System.out.println(i++);  // 53
//        System.out.println(i);    // 54
//        System.out.println();
//
//        int j = 52;
//        System.out.println(++j);  // 53
//        System.out.println(j);    // 53
//        System.out.println(j++);   //53
//        System.out.println(j);     //54
//        System.out.println(j++);   // 54
//        System.out.println(j++);  // 55
//        System.out.println(j);    // 56

        int a= 52;                //52
        int k = ++a;              //53
        System.out.println(++k);  // 54
        System.out.println(k);    // 54
        System.out.println(k++);   //54
        System.out.println(k);     //55
        System.out.println(k++);   // 55
        System.out.println(k++);  // 56
        System.out.println(k);    // 57

 char ch = 'a';
        char ch1 = ++ch;              //b
        System.out.println(++ch);  // c

        //////////////////////////////////////////////////////

        int y=7;                 // 7
        int x = ++y *8;          // 8 * 8
        System.out.println(x);   // 64

    }
}
