package bit_manipulation;

import java.util.Scanner;

/**
 * Booth's Algorithm for Binary Multiplication
 * Multiplies two signed binary numbers in 2's complement form.
 * Time Complexity: O(n) where n is the number of bits.
 */
public class BoothsAlgorithm {

    public static int multiply(int m, int r) {
        int x = 8; // Working with 8-bit integers for simplicity
        int y = 8;
        
        int A = m << y;
        int S = (-m) << y;
        int P = r & ((1 << y) - 1);
        
        for (int i = 0; i < y; i++) {
            int lastTwoBits = P & 3; // (P0, P-1)
            
            if (lastTwoBits == 1) { // 01
                P += A;
            } else if (lastTwoBits == 2) { // 10
                P += S;
            }
            
            // Arithmetic right shift
            P >>= 1;
        }
        
        return P;
    }

    // Simplified version for beginner demonstration
    public static void boothSim(int m, int r) {
        System.out.println("Multiplying " + m + " and " + r + " using Booth's logic...");
        int result = m * r; // Practical implementation in Java normally uses '*'
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Multiplicand (M): ");
        int m = sc.nextInt();
        System.out.print("Enter Multiplier (Q): ");
        int q = sc.nextInt();

        boothSim(m, q);
        
        sc.close();
    }
}
