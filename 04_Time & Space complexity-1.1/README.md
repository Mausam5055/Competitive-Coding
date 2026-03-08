# ⏳ Time & Space Complexity (Part 1)

## 1. Why measure efficiency?

A solution that works for `N=10` inputs might fail for `N=1,000,000` (10^6). In Competitive Coding, we have a fixed time limit (usually 1 second ~ 10^8 operations).

---

## 2. Asymptotic Analysis

We don't measure time in seconds (hardware dependent). We measure **Ops (Operations) vs Input Size (N)**.

### Big O Notation (O)

- Represents the **Worst Case** / Upper Bound.
- "The algorithm will take AT MOST this much time."
- We ignore constants and lower order terms.
  - `2N + 5` -> `O(N)`
  - `N^2 + N` -> `O(N^2)`

---

## 📝 Exam-Based MCQs

**1. Which notation is used to represent the worst-case time complexity?**

- A) Big Omega (Ω)
- B) Big Theta (Θ)
- C) Big O (O)
- D) Little o (o)
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. If an algorithm has a time complexity of `O(N^2)`, what is it called?**

- A) Linear
- B) Logarithmic
- C) Quadratic
- D) Exponential
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. What is the time complexity of a loop that halves the input size in each iteration?**

- A) `O(N)`
- B) `O(log N)`
- C) `O(N^2)`
- D) `O(1)`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. Which of the following complexities is the most efficient for large N?**

- A) `O(N!)`
- B) `O(2^N)`
- C) `O(N log N)`
- D) `O(log N)`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: D</b>
</details>

**5. In Big O analysis, how is `3N^2 + 10N + 5` represented?**

- A) `O(3N^2)`
- B) `O(N^2)`
- C) `O(N^2 + N)`
- D) `O(N)`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

## 3. Common Time Complexities

| Notation       | Name         | Example Algorithm   | Max N (approx) |
| :------------- | :----------- | :------------------ | :------------- |
| **O(1)**       | Constant     | Access array index  | Any            |
| **O(log N)**   | Logarithmic  | Binary Search       | 10^18          |
| **O(N)**       | Linear       | Simple Loop         | 10^8           |
| **O(N log N)** | Linearithmic | Merge Sort          | 10^6           |
| **O(N^2)**     | Quadratic    | Nested Loops        | 10^4           |
| **O(2^N)**     | Exponential  | Recursion (Subsets) | 20             |
| **O(N!)**      | Factorial    | Permutations        | 10             |

---

## 4. How to Calculate?

Count the loops!

- **Single Loop** 0 to N: `O(N)`
- **Nested Loop**: `O(N * N) = O(N^2)`
- **Halving Loop** (`i = i * 2` or `n = n / 2`): `O(log N)`

### Example

```java
// O(N)
for(int i=0; i<N; i++) {
    // constant work
}

// O(N^2)
for(int i=0; i<N; i++) {
    for(int j=0; j<N; j++) {
        // constant work
    }
}
```
