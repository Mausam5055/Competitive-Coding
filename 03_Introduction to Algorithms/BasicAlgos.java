package intro_algos;

import java.util.Scanner;

public class BasicAlgos {

    // Algorithm 1: Find Maximum of 3 numbers
    // Demonstrates: Decision Logic
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    // Algorithm 2: Check Prime (Brute Force Optimization)
    // Demonstrates: Efficiency improvement
    // Naive: Check 2 to N-1
    // Improved: Check 2 to sqrt(N)
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        
        // Loop runs significantly fewer times than N
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Algorithm Demo ---");
        
        // Test Algo 1
        System.out.println("Enter 3 numbers to find Max:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Max is: " + findMax(x, y, z));
        
        // Test Algo 2
        System.out.println("\nEnter a number to check Prime:");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is Prime.");
        } else {
            System.out.println(num + " is NOT Prime.");
        }
        
        sc.close();
    }
}
