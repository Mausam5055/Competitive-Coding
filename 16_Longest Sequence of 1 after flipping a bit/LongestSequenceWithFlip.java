package bit_manipulation;

import java.util.Scanner;

/**
 * Longest Sequence of 1 after flipping exactly one 0 bit.
 * Problem: Given an integer, you can flip exactly one 0 bit to 1. 
 * Find the length of the longest sequence of 1s you could create.
 * Example: 1775 (11011101111 in binary) -> 8
 */
public class LongestSequenceWithFlip {

    public static int longestSequence(int n) {
        // If all bits are 1, the longest sequence is the number of bits in integer
        if (~n == 0) return Integer.SIZE;

        int currentLen = 0;
        int prevLen = 0;
        int maxLen = 0;

        while (n > 0) {
            // If current bit is 1, increment currentLen
            if ((n & 1) == 1) {
                currentLen++;
            } 
            // If current bit is 0
            else {
                // Update prevLen: if next bit is 0, prevLen becomes 0, 
                // else it becomes currentLen
                prevLen = ((n & 2) == 0) ? 0 : currentLen;
                currentLen = 0;
            }
            maxLen = Math.max(prevLen + currentLen + 1, maxLen);
            n >>= 1;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Longest sequence of 1s after flipping one bit: " + longestSequence(n));

        sc.close();
    }
}
