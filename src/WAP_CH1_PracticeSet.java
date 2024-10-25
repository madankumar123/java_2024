import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WAP_CH1_PracticeSet {
    public static void main(String[] args) {
        //Write a program to sum three number in java
//        int a = 3;
//        int b= 4;
//        int c = 6;
//        int sum= a+b+c;
//        System.out.println(sum);
//    }
//    }

//         Write a program to cal (GPA using marks of three subject (out of 100)
//         45+95+48= 188/30= 6.266667
//
//        float subject1 = 45;
//        float subject2 = 95;
//        float subject3 = 48;
//        float cgpa = (subject1 + subject2 + subject3) / 30;
//        System.out.println(cgpa);
//    }
//}
//        // write
//
//        System.out.println("what is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello "+ name+" have a good day!");
//    }
//}

//        write a prgrm to convert kilometer to miles

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Distance in kilometer");        // 1
//        km = input.nextDouble();                                   // storing in km varable
//        input.close();                                               //optional we can use
//
//        miles = (km * 0.6213710);                                    // formula = 1km= 0.621 miles
//
//        System.out.print("miles is : ");
//        System.out.println(miles);
//        System.out.printf("%f kilometers = %f miles ", km,miles);
//        System.out.printf("%.3f kilometers = %.3f miles", km,miles);
//    }
//}
//
// write a prgm to Detect whether a number entered by the user is Integer or not??

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}