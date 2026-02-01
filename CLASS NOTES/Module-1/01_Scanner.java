/*
====================================================
SCANNER CLASS – BASICS
====================================================

• Scanner is used to take input from user or other sources
• It belongs to java.util package
• It can take input from:
  1. Keyboard (System.in)
  2. String
  3. File

----------------------------------------------------
IMPORT STATEMENTS
----------------------------------------------------
*/

// Import Scanner class
import java.util.Scanner;

class ScannerBasics {

    public static void main(String[] args) {

        /*
        ------------------------------------------------
        CREATING SCANNER OBJECT
        ------------------------------------------------
        Syntax:
        Scanner objectName = new Scanner(inputSource);

        • new Scanner(System.in) → keyboard input
        • new Scanner("Hello 123 45.6") → string input
        */

        Scanner s = new Scanner(System.in); // memory allocated + object created

        /*
        ------------------------------------------------
        COMMON SCANNER METHODS
        ------------------------------------------------
        */

        int a = s.nextInt();        // reads integer
        float f = s.nextFloat();    // reads float
        double d = s.nextDouble();  // reads double
        long l = s.nextLong();      // reads long

        String word = s.next();     // reads ONE word
        String line = s.nextLine(); // reads ENTIRE line

        boolean b = s.nextBoolean();// reads true / false

        /*
        ------------------------------------------------
        CHAR INPUT (Scanner has no direct nextChar)
        ------------------------------------------------
        */

        char c = s.next().charAt(0); // first character of word

        s.close(); // good practice
    }
}
