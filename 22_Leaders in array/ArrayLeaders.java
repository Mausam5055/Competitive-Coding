package array_algos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Leaders in an Array
 * An element is called a leader if it is greater than all the elements 
 * to its right side. The rightmost element is always a leader.
 * Example: {16, 17, 4, 3, 5, 2}
 * Leaders: 17, 5, 2
 */
public class ArrayLeaders {

    public static ArrayList<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        
        if (n == 0) return leaders;

        // Rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Leaders are found in reverse order, so we reverse them back
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        ArrayList<Integer> result = findLeaders(arr);
        System.out.println("Leaders in the array: " + result);

        sc.close();
    }
}
