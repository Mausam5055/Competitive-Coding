package recursion_algos;

import java.util.Scanner;

/**
 * Josephus Problem
 * There are N people standing in a circle. Starting from the first person, 
 * every Kth person is executed until only one person remains.
 * Find the position of the survivor.
 */
public class JosephusProblem {

    /**
     * Recursive solution for Josephus Problem.
     * josephus(n, k) = (josephus(n - 1, k) + k) % n
     * Base case: josephus(1, k) = 0 (using 0-based indexing)
     */
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephus(n - 1, k) + k) % n;
    }

    /**
     * Iterative solution (to avoid recursion depth issues).
     */
    public static int josephusIterative(int n, int k) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + k) % i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people N: ");
        int n = sc.nextInt();
        System.out.print("Enter step count K: ");
        int k = sc.nextInt();

        // Result is in 0-based indexing, convert to 1-based for the user
        int result = josephusIterative(n, k) + 1;
        System.out.println("The survivor is at position: " + result);

        sc.close();
    }
}
