import java.util.*;

import javax.xml.transform.stream.StreamSource;

public class Practice {


    public static void HollowRectangle(int n, int m) {
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void InvRotHalfPyramid(int n) {
        
        for(int i = 1; i <= n; i++) {
            // printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void InvHalfPyrNum(int n) {
        
        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        } 
    }

    public static void FloydTriangle(int n) {

        int printNum = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(printNum+" ");
                printNum++;
            }
            System.out.println();
        }
    }

    public static void ZeroOne(int n) {
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void Butterfly(int n) {
        // UPPER HALF
        for(int i = 1; i <= n; i++) {
            // printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // printing spaces
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF
        for(int i = n; i >= 1; i--) {
            // printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // printing spaces
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void SolidRhombus(int n) {
        
        for(int i = 1; i <= n; i++) {
            // printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void HollowRhombus(int n) {
        
        for(int i = 1; i <= n; i++) {
            // printing spaces
            for(int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // printing hollow rhombus
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int n) {

        // UPPER HALF
        
        for(int i = 1; i <= n; i++) {
            // printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF

        for(int i = n-1; i >= 1; i--) {
             // printing spaces
             for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }






    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //int m = sc.nextInt();

        //HollowRectangle(n, m);
        //InvRotHalfPyramid(n);
        //InvHalfPyrNum(n);
        //FloydTriangle(n);
        //ZeroOne(n);
        //Butterfly(n);
        //SolidRhombus(n);
        //HollowRhombus(n);
        Diamond(n);
        
    }
}