public class Array {

    // LINEAR SEAERCH
    public static int linearSearch(int arr[], int num) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }

        return -1;

    }
    // LARGEST NUMBER
    public static int largestNumber(int arr[]) {
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    // BINARY SEARCH
    public static int binarySearch(int arr[], int num) {

        int start = 0;
        int end = arr.length - 1;
        
        for(int i= start; i <= end; i++) {

            int mid = (start+end)/2;

            if(num == arr[mid]) {
                return mid;
            } else if(num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // REVERSED ARRAY

    public static void reversedArray(int arr[]) {
        
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // PAIRS IN THE ARRAY

    public static void printPairs(int arr[]) {
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("("+ arr[i] +","+ arr[j]+")");
            }
            System.out.println();
        }
    }

    // SUB ARRAYS

    public static void printSubArray(int arr[]) {
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // MAX SUB ARRAY SUM APPROACH 1 BRUTE FORCE

    public static int maxSubArraySum(int arr[]) {
        
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    // MAX SUB ARRAY SUM APPROACH 2 PREFIX SUM

    public static int prefixSum(int arr[]) {
        
        // NEED TO CREATE A PREFIX ARRAY

        int prefixArr [] = new int [arr.length];

        prefixArr[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixArr[i] = arr[i] + prefixArr[i-1];
        }

        // NOW USING pREFIX ARRAY CALCULATING MAXIMUM SUBARRAY SUM

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for(int j = 0; j < arr.length; j++) {
                currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    // MAX SUBARRAY SUM APPROACH 3 KADANE'S ALGORITHM

    //int arr[] = {-2,-3,4,-1,-2,1,5,-3};

    public static int kadaneS(int arr[]) {
        
        int ms = Integer.MIN_VALUE;

        int cs = 0;

        for(int i = 0; i < arr.length; i++) {
            
            cs += arr[i];

            if(cs < 0) {
                cs = 0;
            }
            
            ms = Math.max(cs, ms);
        }

        return ms;
    }

    // TRAPPING RAIN WATER

    public static int trappingRainWater(int arr[]) {
        
        // LEFT MAX BOUNDARY

        int leftmax[] = new int[arr.length];

        leftmax[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }

        // RIGHT MAX BOUNDARY

        int rightmax[] = new int[arr.length];

        rightmax[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }


        // CALCULATING TRAPPED WATER

        int totalWater = 0;

        for(int i = 0 ; i < arr.length; i++) {

            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            totalWater += (waterLevel - arr[i]);
        }

        return totalWater;
    }

    // BUY AND SELL STOCKS

    public static int buyAndSellStocks(int arr[]) {
    
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++) {
            
            if(buyPrice < arr[i]) {
               int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        
        //int numbers[] = {2,4,6,8,10,12,14,16};

        //int pairs[] = {2,4,6,8,10};

        //int arr[] = {1,3,6,2,5};

        //int key = 16;

        // int sum [] = {1,-2,6,-1,3};

        // int height [] = {4,2,0,6,3,2,5};

         int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        // int prices[] = {7,1,5,3,6,4};

        //System.out.println("The number is at index no "+ binarySearch(numbers, key));

        //System.out.println("The Largest number in the array is "+ largestNumber(arr));

        // reversedArray(numbers);

        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }

        // printPairs(pairs);

        // printSubArray(pairs);

        // System.out.println("The maximum sum of a sub array is "+ maxSubArraySum(sum));

        // System.out.println("The maximum sum of a sub array is "+ prefixSum(sum));

        System.out.println("The maximum sub array sum is "+ kadaneS(arr));

        // System.out.println("The amount of total trapped water is "+ trappingRainWater(height));

        // System.out.println("The maximum profit is "+ buyAndSellStocks(prices));
    }
}