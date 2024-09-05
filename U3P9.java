/* Write a java program to accept a string from user and perform the following
menu driven operations(using methods of String class)
1.Display string in uppercase
2.Display string in lowercase
3.Check for equality with another string
4.Display substring from a given string */
import java.util.Scanner;
class U3P9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter string: ");
        String string = scanner.nextLine();
        int choice;
        do {
            printMessage("1.Display string in uppercase.");
            printMessage("2.Display string in lowercase.");
            printMessage("3.Check for equality with another string.");
            printMessage("4.Display substring from a given string.");
            printMessage("5.Exit.");
            printMessage("Enter your choice: ");
            choice = scanner.hasNextInt() ? scanner.nextInt() : 0;

            switch (choice) {
                case 1: {
                    printMessage("String in uppercase: " + string.toUpperCase());
                    break;
                }
                case 2: {
                    printMessage("String in lowercase: " + string.toLowerCase());
                    break;
                }
                case 3: {
                    printMessage("Enter another string to compare: ");
                    String newString = scanner.next();
                    if (string.equals(newString))
                        printMessage("String are equal.");
                    else
                        printMessage("String are not equal.");
                    break;
                }
                case 4: {
                    printMessage("Enter starting index of the substring: ");
                    int startIndex = scanner.hasNextInt() ? scanner.nextInt() : 0;
                    printMessage("Enter ending index of the substring: ");
                    int endIndex = scanner.hasNextInt() ? scanner.nextInt() : 0;
                    if (startIndex >= 0 && endIndex < string.length() && startIndex < endIndex) {
                        String substring = string.substring(startIndex, endIndex);
                        printMessage("Substring: " + substring);
                    } else
                        printMessage("Invalid starting or ending index.");
                    break;
                }
                case 5: {
                    printMessage("Exiting the program.");
                    break;
                }
                default:
                    printMessage("Invalid choice: please enter right choice.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}