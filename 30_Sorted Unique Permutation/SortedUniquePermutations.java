package string_algos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sorted Unique Permutations of a String
 * Given a string that may contain duplicate characters, 
 * find all unique permutations in lexicographically sorted order.
 */
public class SortedUniquePermutations {

    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort to ensure lexicographical order and handle duplicates
        boolean[] used = new boolean[chars.length];
        backtrack(chars, used, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // Skip if already used or if it's a duplicate and previous same char wasn't used
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);
            backtrack(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        List<String> result = getPermutations(str);
        System.out.println("Sorted Unique Permutations:");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("Total count: " + result.size());

        sc.close();
    }
}
