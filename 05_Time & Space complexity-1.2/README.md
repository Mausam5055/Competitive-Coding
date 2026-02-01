# ⏳ Time & Space Complexity (Part 2)

## 1. Space Complexity

Space complexity is the amount of extra memory space required by an algorithm to run.

- **Fixed Part**: Variables, constants.
- **Dynamic Part**: Array size O(N), Stack space (recursion).

### Auxiliary Space

The extra space or temporary space used by an algorithm.

> **Total Space = Input Space + Auxiliary Space**
> In competitive coding, we usually care about Auxiliary Space.

---

## 2. Recursive Complexity

Recursion uses the **System Stack** to store function calls.

- **Time**: Total number of recursive calls \* Time per call.
- **Space**: Maximum depth of the recursion tree (Stack Height).

### Example: Factorial

```java
int fact(n) {
    if(n==0) return 1;
    return n * fact(n-1);
}
```

- Calls: `fact(5) -> fact(4) -> ... -> fact(0)`
- Total calls: N
- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(N)` (Stack depth is N)

---

## 3. Best vs Average vs Worst Case

- **Best Case (Ω - Omega)**: Minimum time required. (e.g., Target found at index 0).
- **Average Case (Θ - Theta)**: Expected time on random input.
- **Worst Case (O - Big O)**: Maximum time. **(Most Important!)**

---

## 4. Constraint Analysis Cheat Sheet

If N is...

- **10^18**: `O(log N)` or `O(1)`
- **10^8**: `O(N)` likely TLE (Time Limit Exceeded), try `O(log N)` or `O(1)`. Actually `10^8` is the borderline in 1 sec.
- **10^5**: `O(N)` or `O(N log N)`
- **10^4**: `O(N^2)`
- **10^2**: `O(N^3)`
- **20**: `O(2^N)` (Recursion)
