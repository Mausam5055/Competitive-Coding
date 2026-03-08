package backtracking_algos;

import java.util.Scanner;

/**
 * N Queens Problem
 * Place N queens on an N x N chessboard such that no two 
 * queens attack each other.
 */
public class NQueens {

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        if (solveNQueensUtil(board, 0, n)) {
            printBoard(board, n);
        } else {
            System.out.println("No solution exists for N = " + n);
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col, int n) {
        // Base case: If all queens are placed, return true
        if (col >= n) return true;

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueensUtil(board, col + 1, n)) return true;

                // If placing queen here doesn't lead to a solution, BACKTRACK
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] == 1 ? " Q " : " . ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        solveNQueens(n);
        sc.close();
    }
}
