
public class ArrayHelper {
    public static void main(String[] args) {
        int[] testList = { 34, 123, 23, 51, 87, 90, 35, 10, 401, 25, 
                            56, 103, 21, 59, 78, 92, 33, 7, 4, 320};

        show(testList);
        selectionSort(testList);
        show(testList);

        if (binarySearch(testList, 56) > -1) {
            System.out.println("Found 56!");
        }
        else {
            System.out.println("Did not find 56!");
        }

    } // end main

    public static int binarySearch(int[] arr, int key) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while(highIndex >= lowIndex) {
            System.out.print(".");
            int midIndex = (lowIndex + highIndex) / 2;
            if (arr[midIndex] == key) {
                return midIndex; //key was found at midIndex
            }
            else if (key < arr[midIndex]) {
                highIndex = midIndex - 1;
            }
            else { //key > arr[midIndex]
                lowIndex = midIndex + 1;
            }
        }
        return -1; //key was not found
    }

    public static void selectionSort( int[] arr ) {
        for (int i=0; i < arr.length-1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for (int j=i; j < arr.length; j++) {
                if (arr[j] < currentMin) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }

            if (i != currentMinIndex) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        } 
    } 

    /**
     * Displays contents of an integer array to standard output
     * @param arr a reference to the array you want to show
     */
    public static void show( int[] arr ) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + (((i+1) % 10 == 0) ? "\n" : " "));
        }
        System.out.println();
    }




    
} // end class