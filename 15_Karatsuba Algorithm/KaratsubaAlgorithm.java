package math_algos;

import java.util.Scanner;

/**
 * Karatsuba Algorithm
 * A fast multiplication algorithm for large numbers.
 * Time Complexity: O(n^1.585)
 * Space Complexity: O(n)
 */
public class KaratsubaAlgorithm {

    public static long multiply(long x, long y) {
        // Base case: for small numbers, use standard multiplication
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Get the number of digits in the larger of the two numbers
        int n = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        int m = n / 2;

        // Split x and y into high and low parts
        long powerOf10 = (long) Math.pow(10, m);
        long high1 = x / powerOf10;
        long low1 = x % powerOf10;
        long high2 = y / powerOf10;
        long low2 = y % powerOf10;

        // Recursive steps
        long z0 = multiply(low1, low2);
        long z1 = multiply((low1 + high1), (low2 + high2));
        long z2 = multiply(high1, high2);

        // Formula: z2 * 10^(2*m) + (z1 - z2 - z0) * 10^m + z0
        return (z2 * (long) Math.pow(10, 2 * m)) + ((z1 - z2 - z0) * powerOf10) + z0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two large numbers: ");
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println("Product (Karatsuba): " + multiply(a, b));
        System.out.println("Verification (Standard): " + (a * b));

        sc.close();
    }
}
