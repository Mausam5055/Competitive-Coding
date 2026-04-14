/*
 * ============================================================
 *  SELECTION SORT — Java Implementation
 * ============================================================
 *  Algorithm:
 *   - Divide array into sorted (left) and unsorted (right) parts.
 *   - Find the MINIMUM element in the unsorted part.
 *   - Swap it with the first element of the unsorted part.
 *   - Repeat until the entire array is sorted.
 *
 *  Time Complexity : O(n^2) — best, average, worst
 *  Space Complexity: O(1)   — in-place
 * ============================================================
 */

public class SelectionSort {

    // Selection Sort function
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in arr[i..n-1]
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap minimum element with the first unsorted element
            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Utility method to print array
    static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Before Sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("After  Sorting: ");
        printArray(arr);
    }
}
