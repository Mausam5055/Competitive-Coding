package string_algos;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

/**
 * Lexicographically First Palindromic String
 * Given a string, rearrange the characters to form the 
 * lexicographically smallest palindrome.
 * If no palindrome can be formed, return "No Palindrome".
 */
public class FirstPalindrome {

    public static String findFirstPalindrome(String str) {
        // Use TreeMap to keep characters sorted automatically
        Map<Character, Integer> counts = new TreeMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char oddChar = 0;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }

        // A palindrome can have at most one character with an odd frequency
        if (oddCount > 1) {
            return "No Palindrome";
        }

        StringBuilder firstHalf = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            // Append half of the occurrences to the first half
            for (int i = 0; i < count / 2; i++) {
                firstHalf.append(c);
            }
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        
        if (oddCount == 1) {
            return firstHalf.toString() + oddChar + secondHalf;
        } else {
            return firstHalf.toString() + secondHalf;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = findFirstPalindrome(str);
        System.out.println("Lexicographically first palindrome: " + result);

        sc.close();
    }
}
