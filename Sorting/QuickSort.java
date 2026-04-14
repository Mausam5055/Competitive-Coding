/*
 * ============================================================
 *  QUICK SORT — Java Implementation
 * ============================================================
 *  Algorithm:
 *   - Pick a pivot (last element — Lomuto scheme).
 *   - Partition: elements <= pivot go LEFT, rest go RIGHT.
 *   - Recursively sort both halves.
 *
 *  Time Complexity : O(n log n) average | O(n^2) worst case
 *  Space Complexity: O(log n) — recursive call stack
 * ============================================================
 */

public class QuickSort {

    // Partition the array around the pivot (last element)
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;        // i tracks position of last element <= pivot

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return pivot's final index
    }

    // Recursive Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // Partition index

            quickSort(arr, low, pi - 1);   // Sort left sub-array
            quickSort(arr, pi + 1, high);  // Sort right sub-array
        }
    }

    // Utility method to print array
    static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.print("Before Sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("After  Sorting: ");
        printArray(arr);
    }
}
