package matrix_algos;

import java.util.Scanner;

/**
 * Maximum Sum of Hourglass in Matrix
 * An hourglass in a matrix is a sub-segment shaped like this:
 * a b c
 *   d
 * e f g
 * Time Complexity: O(R * C)
 * Space Complexity: O(1)
 */
public class HourglassSum {

    public static int findMaxHourglass(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        if (R < 3 || C < 3) return -1;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                // Sum of current hourglass
                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2])
                        + (mat[i + 1][j + 1])
                        + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = findMaxHourglass(mat);
        if (result == -1) {
            System.out.println("Not possible to form an hourglass.");
        } else {
            System.out.println("Maximum Hourglass Sum: " + result);
        }

        sc.close();
    }
}
