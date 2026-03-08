package bit_manipulation;

import java.util.Scanner;

/**
 * Swap Two Nibbles in a Byte
 * A nibble is a four-bit aggregation, or half an octet (byte).
 * Example: 100 (01100100 in binary)
 * Nibbles: 0110 (6) and 0100 (4)
 * Swapped: 01000110 (70 in decimal)
 */
public class SwapNibbles {

    public static int swapNibbles(int n) {
        // (n & 0x0F) extracts the last 4 bits, then shifts them left by 4
        // (n & 0xF0) extracts the first 4 bits, then shifts them right by 4
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-255): ");
        int n = sc.nextInt();

        // Ensure the number is within a byte range (0-255)
        n = n & 0xFF;

        System.out.println("Original: " + n + " (Binary: " + String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0') + ")");
        
        int swapped = swapNibbles(n);
        
        System.out.println("Swapped:  " + swapped + " (Binary: " + String.format("%8s", Integer.toBinaryString(swapped)).replace(' ', '0') + ")");

        sc.close();
    }
}
