public class Practice {
    
    public static boolean checkTwice(int arr[]) {
        
       boolean isTwice = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isTwice = true;
                    return isTwice;
                }
            }
        }
        return isTwice;
    }


    public static int checkIndex(int arr[], int key) {

        int start = 0; int end = arr.length-1;
        
        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] > arr[start]) {
                if(key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int BuySellofStocks(int arr[]) {

        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        
        for(int i  = 0; i < arr.length; i++) {
            
            if(buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }


    public static int TrappedRainWater(int arr[]) {
        
        // LEFT MAX BOUNDARY

        int left_max [] = new int[arr.length];
        
        left_max[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            left_max[i] = Math.max(arr[i], left_max[i-1]);
        }


        // RIGHT MAX BOUNDARY

        int right_max[] = new int[arr.length];

        right_max[arr.length - 1] = arr[arr.length - 1];

        for(int i = arr.length-2; i >= 0; i--) {
            right_max[i] = Math.max(arr[i], right_max[i+1]);
        }

        // CALCULATE TRAPPING WATER

        int trappedWater = 0;

        for(int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(left_max[i], right_max[i]);

            trappedWater += (waterLevel - arr[i]);
        }

        return trappedWater;
    }


    public static int SecondLargest(int a[]) {

        // int prices[] = {7, 6, 4,  3, 1};
        
        int largest = a[0];

        int secLar = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                secLar = largest;
                largest = a[i];
            } else if(a[i] < largest && a[i] > secLar) {
                secLar = a[i];
            }
        }
        return secLar;
    }


    public static int SecondSmallest(int a[]) {
        
        // int prices[] = {1,3,4,6,7,};

        int smallest = a[0];

        int secSma = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < smallest) {
                secSma = smallest;
                smallest = a[i];
            } else if(a[i] > smallest && a[i] < secSma) {
                secSma = a[i];
            }
        }
        return secSma;
    }

















    public static void main(String args[]) {
        
        // Q1.

        // int arr[] = {1, 2, 3, 4};

        // System.out.print("Is there any number present more than once? "+ checkTwice(arr));

        // Q2.

         int arr[] = {4, 5, 6, 7,7, 0, 1, 2};

        // System.err.println("The key is present at index no "+ checkIndex(arr, 0));

        // Q3.

        //  int prices[] = {7, 6, 4,  3, 1};

        // System.out.println("The maximum profit will be "+ BuySellofStocks(prices));

        // Q4.

        // int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

        // System.out.println("The amount of trapped water is "+ TrappedRainWater(height));

        // Second largest element in ARRAY

        // int a[] = {1,2,3,4,5};

        System.out.println("The second largest element in the array is " + SecondLargest(arr));
        System.out.println("The second smallest element in the array is " + SecondSmallest(arr));
    }
}
