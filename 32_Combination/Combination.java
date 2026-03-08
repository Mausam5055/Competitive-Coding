package math_algos;

import java.util.Scanner;

/**
 * Combinations (nCr)
 * Calculates the number of ways to choose R items from N items 
 * without regard to order.
 * Formula: nCr = n! / (r! * (n-r)!)
 */
public class Combination {

    /**
     * Efficient approach using Pascal's triangle logic to avoid large factorials.
     * nCr = (n-1)C(r-1) + (n-1)Cr
     */
    public static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r == 0 || r == n) return 1;
        
        // nCr = nC(n-r), use the smaller r for efficiency
        if (r > n / 2) r = n - r;

        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }

    /**
     * Dynamic Programming approach for multiple queries.
     */
    public static long[][] generatePascalTriangle(int n) {
        long[][] tri = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            tri[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }
        }
        return tri;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter R: ");
        int r = sc.nextInt();

        long result = nCr(n, r);
        System.out.println(n + "C" + r + " = " + result);

        sc.close();
    }
}
