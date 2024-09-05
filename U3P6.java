/* Write a program that takes a string from the user and validate it. The string should
be at least 5 characters and should contain at least one digit.
Display an appropriate valid message. */
import java.util.Scanner;

class U3P6 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Please enter a string: ");
        String string = scanner.nextLine();

        if (string.length() >= 5 && containsDigit(string)) {
            printMessage("String is valid.");
        } else {
            printMessage("The entered string is invalid. It should be at least 5 characters long and contain at least one digit.");
        }
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
