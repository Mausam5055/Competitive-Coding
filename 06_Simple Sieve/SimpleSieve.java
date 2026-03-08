package math_algos;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Simple Sieve of Eratosthenes
 * Efficient algorithm to find all prime numbers up to N.
 * Time Complexity: O(N log log N)
 * Space Complexity: O(N)
 */
public class SimpleSieve {

    public static void sieve(int n) {
        // Create a boolean array "isPrime[0..n]" and initialize
        // all entries it as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p starting from p*p
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit (N) to find primes: ");
        int n = sc.nextInt();
        
        sieve(n);
        
        sc.close();
    }
}
