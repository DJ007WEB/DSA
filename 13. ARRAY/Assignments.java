public class Assignments {

    // Q1.

    public static boolean checkFrequency(int arr[]) {
        
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
    

    // Q2.

    public static int searchInSortedRoatedArray(int arr[] , int key) {
        
        int start = 0;

        int end = arr.length;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] > arr[start]) {
                if(key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(key > arr[mid] && key <= arr[end]) {
                    start =  mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // Q3.

    public static int buySellStocks(int arr[]) {
        
        int maxProfit = 0;

        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            
            

            if(buyPrice > arr[i]) {
                buyPrice = arr[i];
            } else {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    // Q4.

    public static int trappedWater(int arr[]) {
        
        // LEFT MAX BOUNDARY

        int leftMax[] = new int[arr.length];

        leftMax[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        // RIGHT MAX BOUNDARY

        int rightMax[] = new int[arr.length];

        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        // TRAPPED WATER

        int trappedWater = 0;

        for(int i = 0; i < arr.length; i++) {
            int waterLevels = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevels - arr[i];
        }

        return trappedWater;
    }

    // Q5.

    // public static void findTriplets(int arr[]) {
        
    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j = i+1; j < arr.length; j++) {
    //             for(int k = j+1; k < arr.length; k++) {
    //                 if(arr[i] + arr[j] + arr[k] == 0 ) {
    //                     System.out.println(arr[i]+","+arr[j]+","+arr[k]);
    //                 }
    //             }
    //         }
    //     }
    // }



    public static void main(String args[]) {
        
    // Q1.

        // int arr[] = {1,2,3,4};

        // System.out.println("Is any element is present twice? "+ checkFrequency(arr));

    // Q2.

    // int arr[] = {4,5,6,7,0,1,2};

    // int target = 0;

    // System.out.println("The target is present at the index of " + searchInSortedRoatedArray(arr, target));

    //  Q3.

    // int prices[] = {7, 6, 4,  3, 1};

    // System.out.println("The maximum profit of one day is "+ buySellStocks(prices));

    // Q4.

    // int height[] = {4, 2, 0, 3, 2, 5};

    // System.out.println("The amount of trapped water is "+ trappedWater(height));

    // Q5. ==> This problem will be done later as it is required higher dsa.

    // int nums[] = {-1, 0,  1, 2, -1, -4};

    // findTriplets(nums);
    
    
    }
}
