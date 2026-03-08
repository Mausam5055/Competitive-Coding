package string_algos;

import java.util.Scanner;

/**
 * Manacher's Algorithm
 * Finds the Longest Palindromic Substring in O(N) time.
 */
public class ManachersAlgorithm {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Preprocess string: "aba" -> "#a#b#a#"
        StringBuilder sb = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sb.append(c).append("#");
        }
        String t = sb.toString();
        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Attempt to expand palindrome centered at i
            int hi = i + (1 + p[i]);
            int lo = i - (1 + p[i]);
            while (hi < n && lo >= 0 && t.charAt(hi) == t.charAt(lo)) {
                p[i]++;
                hi++;
                lo--;
            }

            // Update center and right boundary if palindrome expands past right
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Track longest palindrome
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Extract the original palindrome from the preprocessed string
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = longestPalindrome(str);
        System.out.println("Longest Palindromic Substring: " + result);

        sc.close();
    }
}
