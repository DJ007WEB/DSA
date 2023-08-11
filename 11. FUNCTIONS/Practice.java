import java.util.*;

public class Practice {

    public static int AvgOfThreeNum(int a, int b, int c) {
        return (a+b+c)/3;
    }

    public static boolean isEven(int a) {
        boolean isEven = false;

        if(a % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }

    public static boolean checkPalli(int a) {
        int num = a;

        int finalNum = 0;

        while(a > 0) {
            int lastDigit = a % 10;
            finalNum = finalNum*10 + lastDigit;
            a = a /10;
        }

        if(num == finalNum) {
            return true;
        }
        return false;
    }

    public static int SumOfDigits(int a) {
        int sum = 0;

        while(a > 0) {
            int lastDigit = a % 10;
            sum += lastDigit;
            a = a/10;
        }
        return sum;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       // System.out.println("The number is even "+ isEven(n));

       //System.out.println("The number is pallindrome? "+ checkPalli(n));

        System.out.println("The sum of the digits of "+ n+ " is "+ SumOfDigits(n));
    }
    
}
