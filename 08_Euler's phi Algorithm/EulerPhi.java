package math_algos;

import java.util.Scanner;

/**
 * Euler's Totient Function (Phi)
 * Computes the number of integers up to n that are relatively prime to n.
 * Time Complexity: O(sqrt(N))
 * Space Complexity: O(1)
 */
public class EulerPhi {

    public static long phi(long n) {
        long result = n;
        for (long p = 2; p * p <= n; p++) {
            // Check if p is a prime factor
            if (n % p == 0) {
                // If yes, then update n and result
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }
        // If n has a prime factor greater than sqrt(n)
        if (n > 1)
            result -= result / n;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its Euler's Phi value: ");
        long n = sc.nextLong();
        
        System.out.println("Phi(" + n + ") = " + phi(n));
        
        sc.close();
    }
}
