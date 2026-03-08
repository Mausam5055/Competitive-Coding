# ⌛ Maximum Sum of Hourglass in Matrix

## 1. Introduction

An **hourglass** in a 2D matrix is a subset of values shaped like an hourglass.
For example:

```
a b c
  d
e f g
```

The goal is to find the maximum sum among all possible hourglasses in a given $R \times C$ matrix.

---

## 2. Approach / Algorithm

1.  Iterate through the matrix from row $0$ to $R-3$ and column $0$ to $C-3$.
2.  For each $(i, j)$, calculate the sum of the hourglass starting at that position.
3.  The sum is $(mat[i][j] + mat[i][j+1] + mat[i][j+2]) + mat[i+1][j+1] + (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2])$.
4.  Update the maximum sum found so far.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(R \times C)$
- **Space Complexity**: $O(1)$

---

## 4. Implementation

- [HourglassSum.java](./HourglassSum.java)

---

## 📝 Exam-Based MCQs

**1. What is the minimum size of a matrix required to form at least one hourglass?**
A) $2 \times 2$
B) $3 \times 3$
C) $3 \times 2$
D) $4 \times 4$
**Correct Answer: B**

**2. How many elements are there in a single hourglass?**
A) 9
B) 5
C) 7
D) 6
**Correct Answer: C (Top 3 + Middle 1 + Bottom 3)**

**3. In a $6 \times 6$ matrix, how many hourglasses can be formed?**
A) 36
B) 16
C) 9
D) 25
**Correct Answer: B ( $(6-2) \times (6-2) = 4 \times 4 = 16$ )**

**4. What is the time complexity of finding the maximum hourglass sum?**
A) $O(R + C)$
B) $O(R \times C)$
C) $O(R^2)$
D) $O(1)$
**Correct Answer: B**

**5. Which of the following correctly represents the "neck" of the hourglass starting at `mat[i][j]`?**
A) `mat[i][j]`
B) `mat[i+1][j+1]`
C) `mat[i+2][j+2]`
D) `mat[i+1][j]`
**Correct Answer: B**
