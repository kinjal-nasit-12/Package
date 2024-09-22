//U3P4(Package)
package MulPackage;

public class MultiplicationClass {

    int a, b;

    public MultiplicationClass(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setData(int x, int y) {
        a = x;
        b = y;
    }

    public void calcData() {
        int mul = a * b;
        printMessage("Multiplication of two number is: " + mul);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
