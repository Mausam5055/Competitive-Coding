package array_algos;

import java.util.Scanner;

/**
 * Maximum Product Subarray
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest product.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MaxProductSubarray {

    public static long maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        long maxSoFar = nums[0];
        long minSoFar = nums[0];
        long result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // If current number is negative, max and min will swap
            if (curr < 0) {
                long temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Maximum Product of a Subarray: " + maxProduct(arr));

        sc.close();
    }
}
