/* Write a program that accepts a string from command line and perform following
operations:
1. Display each character on separate line in reverse order.
2. Count total number of characters and display each character's position too.
3. Identify that whether the string is palindrome or not.
Count total number of uppercase and lowercase characters in it. */
import java.util.Scanner;

public class U3P5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMessage("Enter a string: ");
        String inputString = scanner.nextLine();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.println(inputString.charAt(i));
        }

        printMessage("Total number of characters: " + inputString.length());

        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            printMessage("The given string is a palindrome.");
        } else {
            printMessage("The given string is not a palindrome.");
        }

        countUppercaseAndLowercase(inputString);

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        StringBuffer stringOne = new StringBuffer(str);
        StringBuffer stringTwo = new StringBuffer(stringOne.reverse());
        String stringThree = new String(stringTwo);
        boolean f = str.equals(stringThree);
        return f;
    }

    public static void countUppercaseAndLowercase(String str) {
        int uppercaseCount = 0, lowercaseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        printMessage("Total number of uppercase characters: " + uppercaseCount);
        printMessage("Total number of lowercase characters: " + lowercaseCount);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
