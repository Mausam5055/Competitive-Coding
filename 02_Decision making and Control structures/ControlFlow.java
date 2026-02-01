package control_structures;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Control Flow Master ===");
        System.out.print("Enter a number (N): ");
        int n = sc.nextInt();
        
        // 1. Decision Making (Even/Odd)
        if (n % 2 == 0) {
            System.out.println("Step 1: " + n + " is Even.");
        } else {
            System.out.println("Step 1: " + n + " is Odd.");
        }
        
        // 2. Loop Demonstration: Factorial
        System.out.print("\nStep 2: Calculating Factorial of " + n + " (using for-loop)...\n");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        
        // 3. Nested Loops - Pattern Printing (Next Level Visuals)
        /*
           For N=4:
           *
           * *
           * * *
           * * * *
        */
        System.out.println("\nStep 3: Pattern Printing");
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }
        
        // 4. While Loop - Digit Sum
        System.out.println("\nStep 4: Sum of Digits (using while-loop)");
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + n + " is: " + sum);
        
        sc.close();
    }
}
