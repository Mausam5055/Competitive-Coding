package string_algos;

import java.util.Scanner;

/**
 * Move Hyphens to Beginning
 * Given a string with some hyphens (-), move all hyphens 
 * to the front of the string while keeping the order 
 * of characters the same.
 */
public class MoveHyphens {

    public static String moveHyphensToFront(String str) {
        if (str == null) return null;

        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphens.append(c);
            } else {
                others.append(c);
            }
        }

        return hyphens.toString() + others.toString();
    }

    // Alternative in-place-like approach with single traversal
    public static String moveHyphensOptimal(String str) {
        if (str == null) return null;
        char[] arr = str.toCharArray();
        int n = arr.length;
        int lastNonHyphen = n - 1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != '-') {
                arr[lastNonHyphen--] = arr[i];
            }
        }

        // Fill the remaining front positions with hyphens
        while (lastNonHyphen >= 0) {
            arr[lastNonHyphen--] = '-';
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with hyphens: ");
        String str = sc.nextLine();

        String result = moveHyphensOptimal(str);
        System.out.println("Result: " + result);

        sc.close();
    }
}
