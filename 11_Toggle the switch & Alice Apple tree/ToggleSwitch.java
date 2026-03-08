package math_algos;

import java.util.Scanner;

public class ToggleSwitch {

    /**
     * Problem 1: Toggle the Switch (The Lock and Key / Bulb toggle problem)
     * There are N switches, initially all off. In each round i, you toggle every i-th switch.
     * After N rounds, which switches are ON?
     * Observation: A switch is toggled for every divisor it has. Perfect squares have an 
     * odd number of divisors, so they remain ON.
     */
    public static void toggleProblem(int n) {
        System.out.println("Switches that are ON after " + n + " rounds:");
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    /**
     * Problem 2: Alice and Apple Tree
     * Alice wants to collect apples from a tree. The tree is in a square grid.
     * If she wants M apples, what is the minimum perimeter of the square boundary needed?
     * Each coordinate (i, j) has |i| + |j| apples.
     */
    public static void aliceAppleTree(long m) {
        long apples = 0;
        long unit = 0;
        while (apples < m) {
            unit++;
            // Formula for apples in a square of side 2*unit
            // apples = 12 * unit * unit * unit
            apples = 12 * unit * unit * unit;
        }
        System.out.println("Minimum unit distance: " + unit);
        System.out.println("Perimeter of the square boundary: " + (8 * unit));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of switches (N): ");
        int n = sc.nextInt();
        toggleProblem(n);

        System.out.print("\nEnter target number of apples (M): ");
        long m = sc.nextLong();
        aliceAppleTree(m);

        sc.close();
    }
}
