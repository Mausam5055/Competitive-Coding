package array_algos;

import java.util.Scanner;

/**
 * Majority Element in an Array
 * A majority element is an element that appears more than n/2 times 
 * in an array of size n.
 * Algorithm: Boyer-Moore Voting Algorithm
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MajorityElement {

    public static int findMajority(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = findMajority(arr);
        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element (appearing > n/2) found.");
        }

        sc.close();
    }
}
