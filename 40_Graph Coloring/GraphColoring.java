package backtracking_algos;

import java.util.Scanner;

/**
 * m-Coloring Problem
 * Given an undirected graph and a number m, determine if the graph can be 
 * colored with at most m colors such that no two adjacent vertices of the 
 * graph are colored with the same color.
 */
public class GraphColoring {

    public static void solveGraphColoring(int[][] graph, int m, int v) {
        int[] color = new int[v];
        if (graphColoringUtil(graph, m, color, 0, v)) {
            printSolution(color, v);
        } else {
            System.out.println("No solution exists with " + m + " colors");
        }
    }

    private static boolean graphColoringUtil(int[][] graph, int m, int[] color, int vertex, int v) {
        // Base case: If all vertices are assigned a color, return true
        if (vertex == v) return true;

        // Try different colors for the current vertex
        for (int c = 1; c <= m; c++) {
            if (isSafe(vertex, graph, color, c, v)) {
                color[vertex] = c;

                // Recur to assign colors to the rest of the vertices
                if (graphColoringUtil(graph, m, color, vertex + 1, v)) return true;

                // If assigning color c doesn't lead to a solution, BACKTRACK
                color[vertex] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int vertex, int[][] graph, int[] color, int c, int v) {
        for (int i = 0; i < v; i++) {
            if (graph[vertex][i] == 1 && c == color[i])
                return false;
        }
        return true;
    }

    private static void printSolution(int[] color, int v) {
        System.out.println("Solution exists. Assigned colors are:");
        for (int i = 0; i < v; i++) {
            System.out.println("Vertex " + i + " -> Color " + color[i]);
        }
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
        System.out.print("Enter number of colors m: ");
        int m = sc.nextInt();

        solveGraphColoring(graph, m, v);
        sc.close();
    }
}
