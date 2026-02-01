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
