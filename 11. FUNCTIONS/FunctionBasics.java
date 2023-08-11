import java.util.*;

public class FunctionBasics {

    public static int Product(int a, int b) {
        return a*b;
    }


    public static int Factorial(int a) {

        int fact = 1;

        for(int i = 1; i <= a; i++) {
            fact *= i;
        }

        return fact;
    
    }


    // public static boolean isPrime(int n) {

    //     boolean isPrime = true;

    //     for(int i = 2; i <= n-1; i++) {
    //         if(n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    public static boolean isPrime(int n) {
        
        if(n == 2) {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void BinaryToDecimal(int n) {

        int bin = n;
        
        int pow = 0;

        int dec = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }

        System.out.println("Decimal of binary number "+ bin + " is "+ dec);
    }

    public static void DecimalToBinary(int n) {
        int num = n;

        int pow = 0;

        int bin = 0;

        while(n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;

        }
        System.out.println("The binary no of "+ num+ " is "+ bin);
    }


    public static void main(String args[]) {

        //System.out.println("The Product of two numbers is "+ Product(5, 6));
        //System.out.println("The Factorial of given number is "+ Factorial(5));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int r = sc.nextInt();

        // System.out.println("The binomial coefficient is "+ (Factorial(n))/(Factorial(r)*(Factorial((n-r)))));

      //System.out.println("The number is Prime. "+ isPrime(11));


        // for(int i = 2; i <= n; i++) {
        //     if(isPrime(i)) {
        //         System.out.println(i +" is a Prime number");
        //     }
        // }

        // BinaryToDecimal(n);

        DecimalToBinary(n);
        
    }
}