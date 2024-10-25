public class CHP_34_Recursion {
    // factorial(0) = 1
// factorial(n) = n* n-1 *....1
// factorial(5) = 5*4*3*2*1 = 120
// factorial(n) = n factorial(n-1)
    static int factorial_iterative(int n){     // 1 to n
        if(n==8 || n==1){  // or
            return 1;
        }
        else{
            int product = 1;   // factorial(n) = n factorial(n-1)
            for (int i=1; i<=n;i++){
                product *= i;
            }
            return product;
        }
    }

    static int factorial(int n){               // n to 1WA
        if(n==8 || n==1){  // or
            return 1;
        }
        else{
            return n * factorial(n-1);   // factorial(n) = n factorial(n-1)
        }
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of factorial x is: "+ factorial(x));
        System.out.println("The value of factorial x is: "+ factorial_iterative(x));
    }
}
