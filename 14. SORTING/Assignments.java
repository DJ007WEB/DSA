public class Assignments{

    public static void BubbleSort(int arr[]) {
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]) {
        
        for(int i = 0; i < arr.length; i++) {
            int minPos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            if(minPos != i) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
            
        }
        
    }


    public static void InsertionSort(int arr[]) {
        
        for(int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];

            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        
    }


    public static void countingSort(int arr[]) {
        // FINDING THE LARGEST

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // creating array

        int count[] = new int[largest+1];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting

        int j = 0;

        for(int i = 0; i < count.length; i++) {
            
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }





    public static void main(String args[]) {
        
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        countingSort(arr);


        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}