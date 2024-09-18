/* Write a java program to store a string STR = “Hello, Good Morning”.Find and
display the length of the string. Replace the word “Morning” by “Evening” and
display the new string (use StringBuffer class). */
public class U3P7 {
    public static void main(String args[]) {
        String STR = "Hello, Good Morning";
        printMessage("Original string: " + STR);
        printMessage("Length of string: " + STR.length());
        printMessage("New string: " + STR.replace("Morning", "Evening"));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
