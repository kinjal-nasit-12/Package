/* Write a java program to convert an integer number into its binary and octal
equivalent. */
import java.util.Scanner;

class U3P8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter an integer number: ");
        int number = scanner.hasNextInt() ? scanner.nextInt() : 0;

        String binary = Integer.toBinaryString(number);
        printMessage("Binary equivalent of " + number + " is: " + binary);

        String octal = Integer.toOctalString(number);
        printMessage("Octal equivalent of " + number + " is: " + octal);
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}