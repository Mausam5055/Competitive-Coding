/*
 * ============================================================
 *  NATURAL SORT (Natural Merge Sort) — Java Implementation
 * ============================================================
 *  Algorithm:
 *   - Identify already-sorted "runs" (ascending sequences)
 *     that naturally exist in the input array.
 *   - Merge consecutive pairs of natural runs.
 *   - Repeat until only one run remains → fully sorted.
 *
 *  Key Idea : Exploits pre-existing order in data.
 *  Best Case : O(n)       — array already sorted (1 big run)
 *  Worst Case: O(n log n) — reverse sorted (all 1-element runs)
 *  Space     : O(n)
 * ============================================================
 */

import java.util.Arrays;

public class NaturalSort {

    // Merge two adjacent sorted runs: arr[left..mid] and arr[mid+1..right]
    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= mid)  temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy merged result back to original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    // Natural Sort: repeatedly find and merge natural runs
    static void naturalSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;  // Assume done; disprove if we do a merge
            int i = 0;

            while (i < n - 1) {
                // --- Find end of current natural run ---
                int runStart = i;
                while (i < n - 1 && arr[i] <= arr[i + 1])
                    i++;
                int mid = i;  // arr[runStart..mid] is a natural run

                // --- Find start and end of next natural run ---
                int nextStart = mid + 1;
                if (nextStart >= n) break;  // No next run, pass complete

                int j = nextStart;
                while (j < n - 1 && arr[j] <= arr[j + 1])
                    j++;
                int right = j;  // arr[nextStart..right] is the next run

                // --- Merge the two adjacent runs ---
                merge(arr, runStart, mid, right);
                sorted = false;  // At least one merge happened

                i = right + 1;  // Advance past the merged block
            }
        }
    }

    // Utility method to print array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Array with pre-existing natural runs: {3,5,9} | {1,4} | {6,8}
        int[] arr = {3, 5, 9, 1, 4, 6, 8};

        System.out.print("Before Sorting: ");
        printArray(arr);

        naturalSort(arr);

        System.out.print("After  Sorting: ");
        printArray(arr);
    }
}
