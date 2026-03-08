# ♞ Warnsdorff's Algorithm

## 1. Introduction

**Warnsdorff's Algorithm** is a heuristic for finding a **Knight's Tour** on a chessboard. A Knight's Tour is a sequence of moves of a knight on a chessboard such that the knight visits every square exactly once.

While a brute-force search (backtracking) can be extremely slow for large boards, Warnsdorff's rule makes it surprisingly efficient.

---

## 2. Approach / Algorithm

### The Rule

At each step, move the knight to an unvisited square such that the knight will have the **minimum number of onward moves** (degree) to unvisited squares.

### Steps:

1.  Choose a starting square.
2.  Mark it as visited.
3.  For each square reachable from the current square, count how many empty squares are reachable from _that_ square.
4.  Move to the square with the lowest count.
5.  If there's a tie, any of the squares can be chosen (or use another tie-breaking rule).
6.  Repeat until the board is full.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N^2)$ for a single tour (much faster than $O(8^{N^2})$ backtracking).
- **Space Complexity**: $O(N^2)$ for the board.

---

## 4. Implementation

- [WarnsdorffsAlgorithm.java](./WarnsdorffsAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. Warnsdorff's Algorithm is a heuristic for solving which problem?**

- A) N-Queens
- B) Knight's Tour
- C) Traveling Salesman
- D) Shortest Path
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. According to Warnsdorff's rule, which square should the knight move to next?**

- A) The one with the most onward moves.
- B) The one with the fewest onward moves.
- C) A random adjacent square.
- D) The square closest to the corners.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the maximum number of moves a knight can have from any position on a standard $8 \times 8$ board?**

- A) 4
- B) 6
- C) 8
- D) 10
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**4. Why is Warnsdorff's Algorithm preferred over simple backtracking for large boards?**

- A) It is guaranteed to find all solutions.
- B) It reduces the time complexity from exponential to polynomial.
- C) it uses less memory.
- D) It handles 3D chessboards.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What happens if there's a tie in the number of onward moves?**

- A) The algorithm fails.
- B) The algorithm picks the first one encountered or a random one.
- C) The algorithm stops.
- D) The knight moves two squares instead of one.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
