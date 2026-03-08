# 🐭 Maze Solving (Rat in a Maze)

## 1. Introduction

The **Rat in a Maze** problem is a classic application of **Backtracking**. A rat is placed at the top-left coordinate $(0,0)$ in an $N \times N$ grid, and it needs to reach the bottom-right coordinate $(N-1, N-1)$. Some cells are blocked (walls), and some are open (paths).

### Example:

Input:

```
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1
```

Output (Path):

```
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1
```

---

## 2. Approach / Algorithm

We use recursion to explore all possible directions (Right, Down, Left, Up) from the current cell.

1.  If the current cell is the target, return success.
2.  Mark the current cell as part of the solution path.
3.  Recursively try all directions.
4.  If a direction leads to the target, return success.
5.  If none of the directions work, **Backtrack**: unmark the current cell and return failure.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(4^{N^2})$ in the worst case (exploring all paths).
- **Space Complexity**: $O(N^2)$ for the solution matrix and recursion stack.

---

## 4. Implementation

- [RatInAMaze.java](./RatInAMaze.java)

---

## 📝 Exam-Based MCQs

**1. Rat in a Maze problem is typically solved using which technique?**

- A) Greedy Algorithm
- B) Backtracking
- C) Divide and Conquer
- D) Linear Programming
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. What is the base case for the Rat in a Maze recursion?**

- A) When the rat hits a wall.
- B) When the rat reaches the destination $(N-1, N-1)$.
- C) When the rat has visited all cells.
- D) When the rat moves out of the grid.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. Why do we need to mark a cell as visited (part of solution) during the process?**

- A) To increase the path length.
- B) To avoid cycles and infinite loops.
- C) To make the maze look beautiful.
- D) It's not necessary.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What does "Backtracking" mean in this context?**

- A) Moving the rat backward to the start.
- B) Removing the current cell from the valid path when it leads to a dead end.
- C) Sorting the maze matrix.
- D) Jumping over walls.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. If a rat can only move Right and Down, what is the maximum number of steps in a valid path in an $N \times N$ matrix?**

- A) $N^2$
- B) $2N - 2$
- C) $N$
- D) $N - 1$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
