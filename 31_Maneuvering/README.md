# 🟩 Maneuvering (Grid Path Counting)

## 1. Introduction

The **Maneuvering** problem involves finding the total number of possible paths from the top-left corner $(0,0)$ to the bottom-right corner $(M-1, N-1)$ of an $M \times N$ grid, with the constraint that you can only move either **Right** or **Down**.

### Example:

For a $2 \times 2$ grid:

- Path 1: Down $\to$ Right
- Path 2: Right $\to$ Down
  Total Paths = **2**.

---

## 2. Approach / Algorithm

### Recursive Logic

The number of ways to reach a cell $(i, j)$ is the sum of the ways to reach the cell above it $(i-1, j)$ and the cell to its left $(i, j-1)$.
$$Paths(m, n) = Paths(m-1, n) + Paths(m, n-1)$$
Base Case: $Paths(1, n) = 1$ and $Paths(m, 1) = 1$.

### Combinatorial Logic

The total number of steps is $(M-1) + (N-1)$.
Out of these steps, we must choose $(M-1)$ steps to be 'Down'.
$$Total Paths = \binom{(M-1) + (N-1)}{M-1}$$

---

## 3. Complexity Analysis

- **Recursive Time**: $O(2^{M+N})$ (Exponential)
- **DP Time**: $O(M \times N)$
- **Space Complexity**: $O(M \times N)$ for DP table or $O(1)$ with combinatorial formula.

---

## 4. Implementation

- [Maneuvering.java](./Maneuvering.java)

---

## 📝 Exam-Based MCQs

**1. If you are in a $3 \times 3$ grid, how many paths are there from (0,0) to (2,2)?**

- A) 4
- B) 6
- C) 9
- D) 3
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Steps: RRD, RDR, DRR, DDR, DRD, RDD)</b>
</details>

**2. What is the base case for the recursive maneuvering problem?**

- A) When $M$ or $N$ is 0.
- B) When $M$ and $N$ are both 1.
- C) When $M$ or $N$ is 1.
- D) When $M = N$.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. The number of paths in a grid can be solved using which mathematical concept?**

- A) Prime Factorization
- B) Combinations (nCr)
- C) Integration
- D) Matrix Multiplication
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What is the time complexity of the Dynamic Programming approach?**

- A) $O(N)$
- B) $O(M+N)$
- C) $O(M \times N)$
- D) $O(1)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. How many total moves are required to reach the destination in an $M \times N$ grid?**

- A) $M \times N$
- B) $(M-1) + (N-1)$
- C) $M+N$
- D) $2 \times (M+N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
