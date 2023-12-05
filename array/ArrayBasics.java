import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] sibCounts = new int[10];

        //Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner("3 2 1 2 1 1 2 1 1 2");
        System.out.println("Enter " + sibCounts.length + " numbers: ");
        for (int i=0; i < sibCounts.length; i++) {
            sibCounts[i] = scan.nextInt();
        }

        for (int i=0; i < sibCounts.length; i++) {
            System.out.print(sibCounts[i] 
                + ( i == sibCounts.length - 1  ? ".\n" : ", ") );
        }

        System.out.println("The end");

    }
}