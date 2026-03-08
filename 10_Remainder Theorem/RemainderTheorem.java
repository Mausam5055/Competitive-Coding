package math_algos;

import java.util.Scanner;

/**
 * Chinese Remainder Theorem (CRT)
 * Find the smallest number x such that:
 * x % num[0] = rem[0]
 * x % num[1] = rem[1]
 * ...
 * x % num[k-1] = rem[k-1]
 */
public class RemainderTheorem {

    // Returns modular inverse of 'a' with respect to 'm' using extended Euclid Algorithm
    // Assumption: a and m are coprimes
    static long modInverse(long a, long m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;

        if (m == 1) return 0;

        while (a > 1) {
            // q is quotient
            q = a / m;
            t = m;

            // m is remainder now, process same as Euclid's algo
            m = a % m;
            a = t;
            t = x0;

            x0 = x1 - q * x0;
            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0) x1 += m0;

        return x1;
    }

    // k is size of num[] and rem[]. Returns the smallest number x
    // that satisfies given congruences.
    static long findMinX(long[] num, long[] rem, int k) {
        // Compute product of all numbers
        long prod = 1;
        for (int i = 0; i < k; i++)
            prod *= num[i];

        // Initialize result
        long result = 0;

        // Apply formula
        for (int i = 0; i < k; i++) {
            long pp = prod / num[i];
            result += rem[i] * modInverse(pp, num[i]) * pp;
        }

        return result % prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of equations: ");
        int k = sc.nextInt();

        long[] num = new long[k];
        long[] rem = new long[k];

        for (int i = 0; i < k; i++) {
            System.out.print("Enter num[" + i + "] and rem[" + i + "]: ");
            num[i] = sc.nextLong();
            rem[i] = sc.nextLong();
        }

        System.out.println("x is " + findMinX(num, rem, k));
        sc.close();
    }
}
