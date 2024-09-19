//U3P4(Package)
package MulPackage;

public class MultiplicationClass {

    int a, b;

    public void setData(int x, int y) {
        a = x;
        b = y;
    }

    public void CalcData() {
        int mul = a * b;
        printMessage("Multiplication of two number is: " + mul);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
