/**
 * A class to demonstrate methods that pass and return arrays
 * @author Aaron Sullivan
 * @since 12/7/23
 */
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {

        // first, a reminder about passing by value
        int a = 5;
        changeMaybe(a);
        // a = changeMaybe(a); // you could explicitly set a to the returned value
        System.out.println(a); // Still 5. There is no change. Name of variable doesn't matter.

        // Now we make an array to pass to methods as an example
        int[] sleepList = new int[7]; // an array of 7 elements (all zeroes by default)

        show(sleepList); // outputs: 0 0 0 0 0 0 0
        fill(sleepList, 8); 
        show(sleepList); // outputs: 8 8 8 8 8 8 8

        // Reference a new array created by a method that returns a new one
        Random rand = new Random();
        int[] randomList = createArray(4, rand);
        show(randomList); // outputs something like: 421 385 222 398
    } //end main

    /**
     * Instantiate and return a new integer array full of random values
     * @param size the length to create the new array
     * @param rng a reference to a Random object
     * @return a new integer array with random numbers between 200 and 500
     */
    public static int[] createArray(int size, Random rng) {
        int[] arr = new int[size];
        for (int i=0; i < arr.length; i++) {
            arr[i] = rng.nextInt(301) + 200; // [200..500]
        }
        return arr;
    }

    /**
     * Change the value of each element in an integer array
     * @param arr an integer array that will have its elements changed
     * @param fillValue the value to assign to all the elements of the array
     */
    public static void fill(int[] arr, int fillValue) {
        for (int i=0; i < arr.length; i++) {
            arr[i] = fillValue;
        }
    }

    /**
     * Display the contents of an integer array to standard output (console)
     * @param arr an integer array
     */
    public static void show(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Example method to show how passing by value works
     * @param a copy of an integer (not a reference to another variable)
     */
    public static void changeMaybe(int a) {
        a = -99;
        //return a; // you would also need to change void to int
    }
}