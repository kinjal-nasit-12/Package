/* (U3P1)Create a package P and within that package create class PackClass which have
method called findmax( ) which find maximum value from three numbers.
Now import the package within another class DemoClass and now display
the maximum number. */
package P2;

import P.*;
import java.util.Scanner;

public class DemoClass {

    public static void main(String args[]) {
        PackClass object = new PackClass();
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter value 1: ");
        int a = getIntegerValue(scanner);
        printMessage("Enter value 2: ");
        int b = getIntegerValue(scanner);
        printMessage("Enter value 3: ");
        int c = getIntegerValue(scanner);
        int max = object.findMax(a, b, c);
        printMessage("Maximum number from above three is: " + max);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int getIntegerValue(Scanner scanner) {
        return scanner.hasNextInt() ? scanner.nextInt() : 0;
    }
}
