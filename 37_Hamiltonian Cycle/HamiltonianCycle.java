package backtracking_algos;

import java.util.Scanner;

/**
 * Hamiltonian Cycle
 * A Hamiltonian Cycle is a path in an undirected graph that 
 * visits each vertex exactly once and returns to the starting vertex.
 */
public class HamiltonianCycle {

    public static void findHamCycle(int[][] graph, int v) {
        int[] path = new int[v];
        for (int i = 0; i < v; i++) path[i] = -1;

        // Start from vertex 0
        path[0] = 0;
        if (hamCycleUtil(graph, path, 1, v)) {
            printSolution(path, v);
        } else {
            System.out.println("No Hamiltonian Cycle exists");
        }
    }

    private static boolean hamCycleUtil(int[][] graph, int[] path, int pos, int v) {
        // Base case: If all vertices are included in the path
        if (pos == v) {
            // Check if there is an edge from the last vertex to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as candidates for the next vertex in the cycle
        for (int i = 1; i < v; i++) {
            if (isSafe(i, graph, path, pos)) {
                path[pos] = i;

                if (hamCycleUtil(graph, path, pos + 1, v)) return true;

                // Backtrack
                path[pos] = -1;
            }
        }
        return false;
    }

    private static boolean isSafe(int vertex, int[][] graph, int[] path, int pos) {
        // Check if this vertex is an adjacent vertex of the previously added vertex
        if (graph[path[pos - 1]][vertex] == 0) return false;

        // Check if the vertex has already been included
        for (int i = 0; i < pos; i++) {
            if (path[i] == vertex) return false;
        }

        return true;
    }

    private static void printSolution(int[] path, int v) {
        System.out.println("Hamiltonian Cycle exists:");
        for (int i = 0; i < v; i++) {
            System.out.print(path[i] + " -> ");
        }
        System.out.println(path[0]); // Return to start
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        int[][] graph = new int[v][v];
        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        findHamCycle(graph, v);
        sc.close();
    }
}
