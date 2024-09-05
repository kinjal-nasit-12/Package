/* Write a program that accepts a string from command line and perform following
operations:
1. Display each character on separate line in reverse order.
2. Count total number of characters and display each character's position too.
3. Identify that whether the string is palindrome or not.
Count total number of uppercase and lowercase characters in it. */
class U3P5 {

    public static void main(String args[]) {
        String string = new String(args[0]);
        printMessage(string);
        int length = string.length();
        printMessage("Length of string: " + length);
        char c[] = string.toCharArray();
        int uppercase = 0, lowercase = 0;
        for (int i = 0; i < length; i++) {
            printMessage("Character at position " + i + ": " + c[i]);
            if (Character.isUpperCase(c[i])) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        printMessage("Total uppercase is: " + uppercase);
        printMessage("Total lowercase is: " + lowercase);
        printMessage("Total character is: " + length);
        printMessage("Reverse order: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(c[i]);
        }
        StringBuffer stringOne = new StringBuffer(string);
        StringBuffer stringTwo = new StringBuffer(stringOne.reverse());
        String stringThree = new String(stringTwo);
        boolean f = string.equals(stringThree);
        if (f == true) {
            printMessage("Given string is palindrome.");
        } else {
            printMessage("Given string isn't palindrome.");
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
