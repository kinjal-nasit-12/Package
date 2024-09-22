//U3P4(Package)
package SumPackage;

public class SumClass {

    int a;
    int b;

    public void setData(int x, int y) {
        a = x;
        b = y;
    }

    public void calcData() {
        int sum = a + b;
        printMessage("Sum of two number is: " + sum);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}


