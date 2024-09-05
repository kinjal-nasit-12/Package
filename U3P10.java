/* Write a java program that takes a string from user and display its capacity
Append a new string to existing string and display string capacity after appending. */
import java.util.Scanner;

class U3P10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter string: ");
        StringBuffer newString = new StringBuffer(scanner.nextLine());
        printMessage("String capacity: " + newString.capacity());
        printMessage("Enter another string: ");
        newString.append(scanner.nextLine());
        printMessage("After appending new string: " + newString);
        printMessage("Capacity after appending: " + newString.capacity());
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}