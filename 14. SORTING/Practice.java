public class Practice {
    

    public static void main(String args[]) {
        
        int arr[] = {5,2,7,6,8,1,9,4,3};

        // BUUBLE SORT

        // for(int i = 0; i < arr.length-1; i++) {
        //     for(int j = 0; j < arr.length-1-i; j++) {
        //         if(arr[j] > arr[j+1]) {
        //            int temp = arr[j];
        //            arr[j] = arr[j+1];
        //            arr[j+1] = temp; 
        //         }
        //     }
        // }


        // SELECTION SORT

        // for(int i = 0; i < arr.length; i++) {
        //     int minPos = i;

        //     for(int j = i+1; j < arr.length; j++) {
        //         if(arr[j] < arr[minPos]) {
        //             minPos = j;
        //         }
        //     }

        //     int temp = arr[minPos];
        //     arr[minPos] = arr[i];
        //     arr[i] = temp;
        // }

        // INSERTION SORT

        // for(int i = 1; i < arr.length; i++) {
        //     int j = i-1;
        //     int temp = arr[i];
        //     while(j >= 0 && arr[j] > temp) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = temp;
        // }

        // COUNTING SORT

        // find largest

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // creating count arr

        int count[] = new int[largest+1];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // now sort

        int j = 0;

        for(int i = 0; i < count.length; i++) {
            
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }





        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
