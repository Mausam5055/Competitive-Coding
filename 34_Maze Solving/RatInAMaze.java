package backtracking_algos;

import java.util.Scanner;

/**
 * Rat in a Maze
 * A rat starts at (0, 0) and has to reach (N-1, N-1). 
 * The maze is represented as an N x N binary matrix where 0 means 
 * wall and 1 means path.
 */
public class RatInAMaze {

    public static boolean solveMaze(int[][] maze, int n) {
        int[][] sol = new int[n][n];
        if (solveMazeUtil(maze, 0, 0, sol, n)) {
            printSolution(sol, n);
            return true;
        }
        System.out.println("No path exists");
        return false;
    }

    private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int n) {
        // Base case: If (x, y) is destination, return true
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if (x, y) is valid
        if (isSafe(maze, x, y, n)) {
            // Check if already part of current path
            if (sol[x][y] == 1) return false;

            // Mark x, y as part of solution path
            sol[x][y] = 1;

            // Move Right
            if (solveMazeUtil(maze, x, y + 1, sol, n)) return true;

            // Move Down
            if (solveMazeUtil(maze, x + 1, y, sol, n)) return true;

            // Move Left
            if (solveMazeUtil(maze, x, y - 1, sol, n)) return true;

            // Move Up
            if (solveMazeUtil(maze, x - 1, y, sol, n)) return true;

            // If none of the moves work, BACKTRACK
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
    }

    private static void printSolution(int[][] sol, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maze size N: ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        System.out.println("Enter maze matrix (1 for path, 0 for wall):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        solveMaze(maze, n);
        sc.close();
    }
}
