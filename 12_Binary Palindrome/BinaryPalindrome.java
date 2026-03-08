package bit_manipulation;

import java.util.Scanner;

/**
 * Binary Palindrome
 * Check if the binary representation of a number is a palindrome.
 * Example: 9 is "1001" in binary, which is a palindrome.
 */
public class BinaryPalindrome {

    public static boolean isBinaryPalindrome(int n) {
        String binary = Integer.toBinaryString(n);
        int left = 0, right = binary.length() - 1;

        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Mathematical way (without string conversion)
    public static boolean isBinaryPalindromeMath(int n) {
        int rev = 0;
        int copy = n;
        while (copy > 0) {
            rev <<= 1;          // Shift rev left
            rev |= (copy & 1);  // Add the last bit of copy to rev
            copy >>= 1;         // Shift copy right
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        
        if (isBinaryPalindrome(n)) {
            System.out.println("Result (String method): Palindrome");
        } else {
            System.out.println("Result (String method): Not a Palindrome");
        }

        if (isBinaryPalindromeMath(n)) {
            System.out.println("Result (Math method): Palindrome");
        } else {
            System.out.println("Result (Math method): Not a Palindrome");
        }

        sc.close();
    }
}
