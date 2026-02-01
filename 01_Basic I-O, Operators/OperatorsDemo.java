package basic_io;

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        // Create Scanner object for Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Basic I/O & Operators Demo ===");
        System.out.println("Enter two integers:");
        
        // Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Arithmetic Operators
        System.out.println("\n--- Arithmetic ---");
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        
        // Handling division by zero
        if(b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else {
            System.out.println("Division by zero not allowed.");
        }
        
        // Bitwise Operators (Next Level Trick)
        System.out.println("\n--- Bitwise Magic ---");
        // Check if 'a' is Odd or Even using AND
        if ((a & 1) == 0) {
            System.out.println(a + " is EVEN (checked using bitwise &)");
        } else {
            System.out.println(a + " is ODD (checked using bitwise &)");
        }
        
        // XOR Swap (Swap without temp variable)
        System.out.println("Swapping logic using XOR:");
        System.out.println("Before: a=" + a + ", b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After:  a=" + a + ", b=" + b);
        
        // Shift Operators
        int result = a << 1; 
        System.out.println(a + " << 1 (Multiplied by 2) = " + result);

        sc.close();
    }
}
