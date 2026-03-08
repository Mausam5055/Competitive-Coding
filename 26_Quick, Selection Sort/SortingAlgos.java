package sorting_algos;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Implementation of Quick Sort and Selection Sort.
 * Quick Sort is a Divide and Conquer algorithm.
 * Selection Sort is an In-place comparison sort.
 */
public class SortingAlgos {

    // --- Selection Sort ---
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap min with current
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // --- Quick Sort ---
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Picking the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int[] arr2 = arr1.clone();

        System.out.println("Original Array: " + Arrays.toString(arr1));

        selectionSort(arr1);
        System.out.println("Selection Sorted: " + Arrays.toString(arr1));

        quickSort(arr2, 0, n - 1);
        System.out.println("Quick Sorted: " + Arrays.toString(arr2));

        sc.close();
    }
}
