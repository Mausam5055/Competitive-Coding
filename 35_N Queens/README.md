# 👑 N Queens Problem

## 1. Introduction

The **N Queens Problem** is the challenge of placing $N$ chess queens on an $N \times N$ chessboard such that no two queens threaten each other. Thus, a solution requires that no two queens share the same row, column, or diagonal.

### Example (4-Queens):

```
 .  Q  .  .
 .  .  .  Q
 Q  .  .  .
 .  .  Q  .
```

---

## 2. Approach / Algorithm

This is solved using **Backtracking**.

1.  Start in the leftmost column.
2.  If all queens are placed $\to$ return true.
3.  Try all rows in the current column. For each row:
    - Check if the queen can be placed safely (not attacked by queens already in the left columns).
    - If yes, mark this `[row][column]` and recursively try placing queens in the next columns.
    - If placing queen leads to a solution $\to$ return true.
    - If not $\to$ **Backtrack** (remove queen from `[row][column]`) and try the next row.
4.  If all rows have been tried and no solution found, return false.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N!)$ in terms of states explored.
- **Space Complexity**: $O(N^2)$ for the board and $O(N)$ for the recursion stack.

---

## 4. Implementation

- [NQueens.java](./NQueens.java)

---

## 📝 Exam-Based MCQs

**1. What is the fundamental constraint in the N-Queens problem?**

- A) All queens must be on the same row.
- B) No two queens can attack each other.
- C) Queens must be placed on black squares only.
- D) All squares must be covered by queens.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Which algorithmic technique is standard for solving the N-Queens problem?**

- A) Breadth First Search
- B) Backtracking
- C) Greedy Search
- D) Randomized Selection
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. How many solutions exist for the 4-Queens problem?**

- A) 1
- B) 2
- C) 4
- D) 8
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What is the minimum $N$ for which a solution to the N-Queens problem exists, where $N > 1$?**

- A) 2
- B) 3
- C) 4
- D) 5
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. To check if a queen can be placed safely at `[row][col]`, we only need to check columns to the:**

- A) Left
- B) Right
- C) Top
- D) Bottom
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A (assuming we place queens column-by-column from left to right)</b>
</details>
