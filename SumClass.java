//U3P4(Package)
package SumPackage;

public class SumClass {

    int a, b;

    public SumClass(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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

