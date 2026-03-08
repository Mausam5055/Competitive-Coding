package math_algos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Segmented Sieve of Eratosthenes
 * Efficient for finding primes in a large range [L, R] or when N is very large.
 * Time Complexity: O((R-L+1) log log R + sqrt(R) log log sqrt(R))
 * Space Complexity: O(sqrt(R) + (R-L+1))
 */
public class SegmentedSieve {

    // Helper to find primes up to sqrt(R) using simple sieve
    private static ArrayList<Integer> getPrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        if (limit >= 0) isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p)
                    isPrime[i] = false;
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    public static void segmentedSieve(long L, long R) {
        if (L < 2) L = 2;
        if (L > R) return;

        int limit = (int) Math.sqrt(R);
        ArrayList<Integer> primes = getPrimes(limit);

        boolean[] isPrime = new boolean[(int) (R - L + 1)];
        Arrays.fill(isPrime, true);

        for (int p : primes) {
            // Find the smallest multiple of p in range [L, R]
            long firstMultiple = (L / p) * p;
            if (firstMultiple < L) firstMultiple += p;
            if (firstMultiple == p) firstMultiple += p; // Don't mark p itself

            for (long j = Math.max(firstMultiple, (long) p * p); j <= R; j += p) {
                isPrime[(int) (j - L)] = false;
            }
        }

        // Output primes in range
        System.out.println("Primes in range [" + L + ", " + R + "]:");
        for (long i = L; i <= R; i++) {
            if (isPrime[(int) (i - L)]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower Bound (L): ");
        long L = sc.nextLong();
        System.out.print("Enter Upper Bound (R): ");
        long R = sc.nextLong();

        segmentedSieve(L, R);
        sc.close();
    }
}
