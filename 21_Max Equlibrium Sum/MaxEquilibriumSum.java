package array_algos;

import java.util.Scanner;

/**
 * Maximum Equilibrium Sum in an Array
 * Equilibrium sum is a sum of elements such that the sum of elements 
 * at lower indices is equal to the sum of elements at higher indices.
 * Example: {-7, 1, 5, 2, -4, 3, 0}
 * Equilibrium indices: 3 (sum of {-7, 1, 5} = -1, sum of {-4, 3, 0} = -1)
 * This program finds the MAXIMUM such equilibrium sum.
 */
public class MaxEquilibriumSum {

    public static int findMaxEquilibriumSum(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int totalSum = 0;
        for (int x : arr) totalSum += x;

        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            // totalSum - leftSum - arr[i] is the right sum
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                maxSum = Math.max(maxSum, leftSum);
                found = true;
            }

            leftSum += arr[i];
        }

        return found ? maxSum : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = findMaxEquilibriumSum(arr);
        System.out.println("Maximum Equilibrium Sum: " + result);

        sc.close();
    }
}
