/* Write a java program to create two packages namely SUMPACKAGE and MULPACKAGE.
Each of these packages contains these two methods
setdata():-to set values of data members
calc_data():- to calculate and display sum and product of two numbers.
Both the packages should be at same level. */
import MulPackage.MultiplicationClass;
import SumPackage.SumClass;
import java.util.Scanner;

public class U3P4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        printMessage("Enter number 1: ");
        int x = getIntegerValue(scanner);

        printMessage("Enter number 2: ");
        int y = getIntegerValue(scanner);

        SumClass sumObject = new SumClass();
        sumObject.setData(x, y);
        MultiplicationClass MultiplicationObject = new MultiplicationClass();
        MultiplicationObject.setData(x, y);

        sumObject.calcData();
        MultiplicationObject.calcData();
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int getIntegerValue(Scanner scanner) {
        return scanner.hasNextInt() ? scanner.nextInt() : 0;
    }
}

