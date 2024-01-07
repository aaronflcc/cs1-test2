import java.util.Scanner;

/**
 * InputTest
 */
public class InputTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number == -1) {
            try {
                number = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("not a number");
                number = -1;
                continue;
            }
        }
         
        String name = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(number + " " + name + " " + number2 + " " + (number + number2));

        scanner.close();
    }
}