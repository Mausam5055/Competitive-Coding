/*
====================================================
ORDER OF INPUT METHODS – VERY IMPORTANT
====================================================

Input String:
"Hello 123 123.5"

Correct Order:
1. next()      → Hello
2. nextInt()   → 123
3. nextFloat() → 123.5

Wrong Order causes InputMismatchException
*/

import java.util.Scanner;

class InputOrderExample {

    public static void main(String[] args) {

        Scanner s = new Scanner("Hello 123 123.5");

        // Correct order
        String str = s.next();       // Hello
        int num = s.nextInt();       // 123
        float val = s.nextFloat();   // 123.5

        System.out.println(str);
        System.out.println(num);
        System.out.println(val);

        s.close();
    }
}
