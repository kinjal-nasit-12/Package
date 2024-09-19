/* Write a program that creates three different classes in three different packages
and access them from default package. All the three packages should be at the
same level. */
import Package1.*;
import Package2.*;
import Package3.*;

class U3P2 {

    public static void main(String args[]) {
        ClassOne objectOne = new ClassOne();
        ClassTwo objectTwo = new ClassTwo();
        ClassThree objectThree = new ClassThree();
        objectOne.display();
        objectTwo.display();
        objectThree.display();
    }
}
