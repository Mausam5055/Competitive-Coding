/*
====================================================
TAKING INPUT AND PRINTING OUTPUT
====================================================
*/

import java.util.Scanner;

class InputOutputDemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Integer input
        System.out.print("Enter integer value: ");
        int a = s.nextInt();

        System.out.println("Integer value is: " + a);

        // String input (single word)
        System.out.print("Enter single word: ");
        String word = s.next();

        // Clear buffer
        s.nextLine();

        // String input (full line)
        System.out.print("Enter full sentence: ");
        String sentence = s.nextLine();

        System.out.println("Word entered: " + word);
        System.out.println("Sentence entered: " + sentence);

        s.close();
    }
}
