package math_algos;

import java.util.Scanner;

/**
 * Euclid's Algorithm (GCD)
 * Find the Greatest Common Divisor (GCD) of two numbers.
 * Time Complexity: O(log(min(a, b)))
 * Space Complexity: O(log(min(a, b))) for recursive, O(1) for iterative.
 */
public class EuclidsAlgorithm {

    // Iterative approach
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursive approach
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    // Extended Euclid Algorithm
    // Finds x and y such that ax + by = gcd(a, b)
    public static int extendedGCD(int a, int b, int[] xy) {
        if (a == 0) {
            xy[0] = 0;
            xy[1] = 1;
            return b;
        }
        int[] tempXY = new int[2];
        int gcd = extendedGCD(b % a, a, tempXY);
        xy[0] = tempXY[1] - (b / a) * tempXY[0];
        xy[1] = tempXY[0];
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD (Iterative): " + gcdIterative(a, b));
        System.out.println("GCD (Recursive): " + gcdRecursive(a, b));

        int[] xy = new int[2];
        int g = extendedGCD(a, b, xy);
        System.out.println("Extended GCD: " + g + " (Equation: " + a + "*" + xy[0] + " + " + b + "*" + xy[1] + " = " + g + ")");

        sc.close();
    }
}
