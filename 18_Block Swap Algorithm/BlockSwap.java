package array_algos;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Block Swap Algorithm for Array Rotation
 * Efficiently rotates an array by d elements.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class BlockSwap {

    public static void rotate(int[] arr, int d, int n) {
        if (d == 0 || d == n) return;
        
        // If d is more than n, take modulo
        d = d % n;

        int i = d;
        int j = n - d;
        while (i != j) {
            if (i < j) { // Ad is smaller
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else { // Bd is smaller
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
        swap(arr, d - i, d, i);
    }

    // Helper function to swap bits
    public static void swap(int[] arr, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter number of rotations (d): ");
        int d = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr, d, n);
        System.out.println("Rotated array:  " + Arrays.toString(arr));

        sc.close();
    }
}
