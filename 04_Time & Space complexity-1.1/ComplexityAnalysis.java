package complexity_1;

public class ComplexityAnalysis {

    // O(1) - Constant Time
    // Number of operations does NOT depend on N
    public static void constantTime(int n) {
        System.out.println("Input is: " + n); // 1 step
        int result = n * n;                   // 1 step
        System.out.println("Square is: " + result);
    }

    // O(N) - Linear Time
    // Runs N times
    public static void linearTime(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++; // Executed N times
        }
        System.out.println("Linear Sum loop finished.");
    }

    // O(N^2) - Quadratic Time
    public static void quadraticTime(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++; // Executed N * N times
            }
        }
        System.out.println("Quadratic count finished (N^2 steps).");
    }

    // O(log N) - Logarithmic Time
    // Grows very slowly. Even for N=1Million, takes only ~20 steps.
    public static void logarithmicTime(int n) {
        int steps = 0;
        while (n > 1) {
            n = n / 2; // Input is halved every time
            steps++;
        }
        System.out.println("Logarithmic steps: " + steps);
    }

    public static void main(String[] args) {
        int N = 1000;
        
        System.out.println("Analyzing for N = " + N);
        constantTime(N);
        linearTime(N);
        quadraticTime(N); // 1,000,000 steps
        logarithmicTime(N); // ~10 steps
    }
}
