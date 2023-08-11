
import java.util.*;

public class learning {

    public static void SpiralPrint(int arr[][]) {

        int startRow = 0; int startCol = 0;
         
         int endRow = arr.length-1; int endCol = arr[0].length-1;

         while(startRow <= endRow && startCol <= endCol) {
            
            // top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j]+" ");
            }

            // right

            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }

            // bottom

            for(int j = endCol-1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            // left

            for(int i = endRow-1; i>startRow; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }


    public static int DiagonalSum(int arr[][]) {
    
        int sum = 0;

        // BRUTE FORCE APPROACH

        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[0].length; j++) {
        //         if(i == j) {
        //             sum += arr[i][j];
        //         }
        //         if(i+j == arr.length-1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // return sum;

        // OPTIMAL SOLUTION

        for(int i = 0; i < arr.length; i++) {
            // pd
            sum += arr[i][i];
            // sd
            
            if(i != (arr.length-i-1)) {
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;
    }








    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = new int[3][3];

        // int rows= matrix.length; int cols = matrix[0].length;


        // for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < cols; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // OUTPUT

        // for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Q1. SPIRAL MATRIX

        int spiral[][] = {
                          {1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };

         
        // SpiralPrint(spiral);

        System.out.println(DiagonalSum(spiral));


    }
}