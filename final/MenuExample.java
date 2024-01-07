/**
 * MenuExample is an example of a menu-driven program that presents a menu 
 * of choices in a loop, allowing the user to choose what to do in any order and 
 * return to the same menu to do something else.
 * @author Aaron Sullivan
 * @since 12/12/2023 
 */

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Some data we want to keep track of while running our program
        boolean didFirstThing = false;
        double[] rainCounts = new double[3];

        // The main loop that keeps the user making choices from the menu
        int choice = 0;
        while (choice != 5) {
            
            displayChoices(rainCounts);
            
            //we pass the Scanner object here, which could also be passed to other methods 
            choice = getChoice(scan);
            
            switch(choice) {
                case 1:
                didFirstThing = doFirstThing();
                    break;
                case 2:
                    doSecondThing(didFirstThing);
                    break;
                case 3:
                    updateRain(rainCounts);
                    break;
                case 5:
                    System.out.println("I guess we're done");
                    break;
            } // end switch
        } // end while

        scan.close();
    } // end main

    /**
     * updateRain changes the first 3 elements of an array of values representing the inches of rainfall
     * @param rainCounts is a reference to the memory for an array of values for inches of rainfall
     */
    public static void updateRain(double[] rainCounts) {
        rainCounts[0] = 0.5;
        rainCounts[1] = 1.2;
        rainCounts[2] = 0.1;
    }

    /**
     * doSecondThing outputs a different phrase suggesting it can only do its thing if
     * some other thing was done first
     * @param didOtherThing determines whether the other thing was done or not
     */
    public static void doSecondThing(boolean didOtherThing) {
        if (didOtherThing) {
            System.out.println("Since you did the other thing, now I can do this thing.");
            System.out.println("This thing has now been done. Congrats.");
        }
        else {
            System.out.println("Can't do this because you didn't do that other thing, yet.");
        }
    }

    /**
     * doFirstThing could be a method that gives a user an option to do a thing or not
     * @return true if thing was done, false if it was not (currently only returns true)
     */
    public static boolean doFirstThing() {
        // a more complete version of this method would...
        // give an option to do first thing
        // if user does first thing...
        System.out.println("First thing has been done. Congrats.");
        return true;

        // if we didn't do first thing we could...
        // return false;
    }
        
    /**
     * getChoice is used to get a number corresponding to the choices presented to the user
     * potential improvements include a parameter to control the range of valid numbers
     * @param scanner is used to get the next integer input
     * @return the integer value that was input by the user
     */
    public static int getChoice(Scanner scanner) {
        System.out.println("What is your choice?");
        return scanner.nextInt();
    }

    /**
     * DisplayChoices shows the options for the user in the menu
     * potential improvements include a parameter to determine if "Do the second thing" should show.
     * @param rainCounts is an array of doubles that references the same memory of an array in the calling method (main)
     */
    public static void displayChoices(double[] rainCounts) {
        // keep the user updated on the amount of rain on day 1
        //   using the rainCounts array (referenced from)
        System.out.println("\nrain on day 1: " + rainCounts[1] + " inches.");
        System.out.println("\nChoices:");
        System.out.println("========");
        System.out.println("1. Do a thing");
        System.out.println("2. Do the second thing");
        System.out.println("3. Update rain measurements");
        System.out.println("5. Stop doing things");
    }
}