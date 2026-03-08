package math_algos;

import java.util.Scanner;
import java.util.HashMap;

/**
 * Strobogrammatic Number
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (upside down).
 * Example: "69", "88", "101"
 */
public class Strobogrammatic {

    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0, right = num.length() - 1;
        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);

            if (!map.containsKey(c1) || map.get(c1) != c2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's Strobogrammatic: ");
        String num = sc.next();

        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a Strobogrammatic number.");
        } else {
            System.out.println(num + " is NOT a Strobogrammatic number.");
        }
        sc.close();
    }
}
