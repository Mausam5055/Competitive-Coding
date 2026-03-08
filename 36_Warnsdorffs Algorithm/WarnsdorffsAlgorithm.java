package backtracking_algos;

import java.util.Scanner;
import java.util.Random;

/**
 * Warnsdorff's Algorithm
 * A heuristic for finding a Knight's Tour on an N x N board.
 * Rule: Move the knight to the square from which it will have the 
 * FEWEST outward moves to unvisited squares.
 */
public class WarnsdorffsAlgorithm {

    private static final int[] dx = {1, 1, 2, 2, -1, -1, -2, -2};
    private static final int[] dy = {2, -2, 1, -1, 2, -2, 1, -1};

    public static boolean solveKnightsTour(int n) {
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j] = -1;
        }

        // Random starting position
        Random rand = new Random();
        int currX = rand.nextInt(n);
        int currY = rand.nextInt(n);

        board[currX][currY] = 1; // First move

        for (int i = 0; i < n * n - 1; i++) {
            if (!nextMove(board, currX, currY, n)) {
                System.out.println("No solution found using Warnsdorff's heuristic.");
                return false;
            }
            // Update current position to the chosen one
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if (board[x][y] == i + 2) {
                        currX = x;
                        currY = y;
                    }
                }
            }
        }

        printBoard(board, n);
        return true;
    }

    private static boolean nextMove(int[][] board, int x, int y, int n) {
        int minDegIdx = -1;
        int minDeg = 9; // Knight can have max 8 moves
        int nextX = -1, nextY = -1;

        // Try all 8 possible moves from the current cell
        int start = new Random().nextInt(8); // Randomize start to explore different paths
        for (int i = 0; i < 8; i++) {
            int idx = (start + i) % 8;
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (isSafe(nx, ny, n) && board[nx][ny] == -1) {
                int degree = getDegree(board, nx, ny, n);
                if (degree < minDeg) {
                    minDegIdx = idx;
                    minDeg = degree;
                    nextX = nx;
                    nextY = ny;
                }
            }
        }

        if (minDegIdx == -1) return false;

        board[nextX][nextY] = board[x][y] + 1;
        return true;
    }

    private static int getDegree(int[][] board, int x, int y, int n) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (isSafe(x + dx[i], y + dy[i], n) && board[x + dx[i]][y + dy[i]] == -1) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSafe(int x, int y, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter board size N: ");
        int n = sc.nextInt();

        solveKnightsTour(n);
        sc.close();
    }
}
