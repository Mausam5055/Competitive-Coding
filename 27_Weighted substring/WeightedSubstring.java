package string_algos;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 * Weighted Substring
 * Each character 'a'-'z' is given a weight (usually 0 or 1).
 * Find the number of distinct substrings that have a total weight 
 * less than or equal to a given limit K.
 */
public class WeightedSubstring {

    public static int countWeightedSubstrings(String str, String weights, int k) {
        int n = str.length();
        Set<String> distinctSubstrings = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int currentWeight = 0;
            StringBuilder sub = new StringBuilder();
            
            for (int j = i; j < n; j++) {
                char c = str.charAt(j);
                // weights string is "01011..." for a, b, c, d, e...
                // weight is 0 if weights.charAt(c - 'a') == '0'
                // But typically problem means 1 if weights.charAt(...) is '0' (meaning 'bad')
                // Let's assume: charge 1 for 'bad' character, where '0' in weights means 'bad'
                if (weights.charAt(c - 'a') == '0') {
                    currentWeight++;
                }
                
                if (currentWeight <= k) {
                    sub.append(c);
                    distinctSubstrings.add(sub.toString());
                } else {
                    break;
                }
            }
        }

        return distinctSubstrings.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter weights (26 digits, e.g., 0101... where 0 means bad): ");
        String weights = sc.nextLine();
        
        System.out.print("Enter limit K: ");
        int k = sc.nextInt();

        int result = countWeightedSubstrings(str, weights, k);
        System.out.println("Total distinct weighted substrings: " + result);

        sc.close();
    }
}
