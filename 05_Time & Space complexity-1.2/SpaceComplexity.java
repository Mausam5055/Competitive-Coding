package complexity_2;

public class SpaceComplexity {

    // Iterative Factorial
    // Space: O(1) - Only uses a variables 'res', 'i'
    public static long iterativeFact(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Recursive Factorial
    // Space: O(N) - Uses Stack memory for N function calls
    public static long recursiveFact(int n) {
        if (n == 0) return 1;
        return n * recursiveFact(n - 1);
    }

    // Space Demo: O(N) Array
    public static void arraySpace(int n) {
        // Allocating array of size N takes O(N) space
        int[] arr = new int[n]; 
        System.out.println("Allocated array of size " + n);
    }

    public static void main(String[] args) {
        int N = 10;
        
        System.out.println("Calculating Factorial of " + N);
        
        // Efficient Space
        System.out.println("Iterative: " + iterativeFact(N));
        
        // Uses Stack Space
        System.out.println("Recursive: " + recursiveFact(N));
        
        // Space Visualization
        // If N was 1,000,000, recursiveFact might throw StackOverflowError
        // whereas iterativeFact would run fine.
        
        try {
            // Un-commenting this with large N will crash
            // recursiveFact(100000); 
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow due to O(N) space in recursion!");
        }
    }
}
