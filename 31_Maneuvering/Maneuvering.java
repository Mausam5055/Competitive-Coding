package recursion_algos;

import java.util.Scanner;

/**
 * Maneuvering (Count Paths in a Grid)
 * Given a grid of size M x N, count all possible paths from 
 * top-left (0,0) to bottom-right (M-1, N-1).
 * Constraint: You can only move Right or Down.
 */
public class Maneuvering {

    /**
     * Recursive approach to count paths.
     * Number of paths to (m, n) = paths to (m-1, n) + paths to (m, n-1)
     */
    public static int countPaths(int m, int n) {
        // Base case: If we are in the first row or first column,
        // there is only one way to reach any cell (straight line)
        if (m == 1 || n == 1) {
            return 1;
        }

        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }

    /**
     * Efficient approach using Dynamic Programming.
     */
    public static int countPathsDP(int m, int n) {
        int[][] dp = new int[m][n];

        // Fill first row and first column with 1
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows M: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns N: ");
        int n = sc.nextInt();

        int result = countPathsDP(m, n);
        System.out.println("Total possible paths from top-left to bottom-right: " + result);

        sc.close();
    }
}
