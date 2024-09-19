/*(U3P3) Create package pack1 within this package create class A which contains one
instance variable and one instance method. Create another package pack2 within
this package create class B. where class B is calling the method and variable of
class A. */
package Pack2;

import Pack1.*;

public class B {

    public static void main(String args[]) {
        A a = new A();
        printMessage("Accessing variable: Value of x: " + a.x);
        a.show();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
