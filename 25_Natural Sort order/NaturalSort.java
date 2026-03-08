package sorting_algos;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Natural Sort Order
 * Standard lexicographical sort: "img1.png", "img10.png", "img2.png"
 * Natural sort: "img1.png", "img2.png", "img10.png"
 * This program implements a custom Comparator for Natural Sort.
 */
public class NaturalSort {

    public static Comparator<String> naturalOrderComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return compareNatural(s1, s2);
            }
        };
    }

    private static int compareNatural(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);

            if (Character.isDigit(c1) && Character.isDigit(c2)) {
                // Extract full numbers from both strings
                String num1 = getNumber(s1, i);
                String num2 = getNumber(s2, j);
                
                // Compare as integers
                int val1 = Integer.parseInt(num1);
                int val2 = Integer.parseInt(num2);
                
                if (val1 != val2) return val1 - val2;
                
                i += num1.length();
                j += num2.length();
            } else {
                if (c1 != c2) return c1 - c2;
                i++;
                j++;
            }
        }
        return s1.length() - s2.length();
    }

    private static String getNumber(String s, int start) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings to sort (separated by spaces, e.g., img1.png img10.png img2.png):");
        String input = sc.nextLine();
        String[] arr = input.split("\\s+");

        System.out.println("Original: " + Arrays.toString(arr));
        
        // Standard Sort
        String[] standard = arr.clone();
        Arrays.sort(standard);
        System.out.println("Standard Sort: " + Arrays.toString(standard));

        // Natural Sort
        Arrays.sort(arr, naturalOrderComparator());
        System.out.println("Natural Sort:  " + Arrays.toString(arr));

        sc.close();
    }
}
