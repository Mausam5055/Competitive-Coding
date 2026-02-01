/*
====================================================
DIFFERENCE BETWEEN next() AND nextLine()
====================================================

next():
• Reads only ONE word
• Stops at space

nextLine():
• Reads ENTIRE line
• Stops at newline (\n)
*/

import java.util.Scanner;

class NextVsNextLine {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word:");
        String s1 = s.next(); // only one word

        // To consume leftover newline
        s.nextLine();

        System.out.println("Enter a full sentence:");
        String s2 = s.nextLine(); // full line

        System.out.println("next() output: " + s1);
        System.out.println("nextLine() output: " + s2);

        s.close();
    }
}
