# 🧮 Karatsuba Algorithm

## 1. Introduction

The **Karatsuba Algorithm** is a fast multiplication algorithm. It reduces the multiplication of two $n$-digit numbers to at most three multiplications of $n/2$-digit numbers. It is faster than the classical "grammar school" algorithm which requires $n^2$ single-digit multiplications.

---

## 2. Approach / Algorithm

The algorithm uses a **Divide and Conquer** strategy.
For two numbers $X$ and $Y$:
$X = X_1 \cdot 10^m + X_0$
$Y = Y_1 \cdot 10^m + Y_0$

Standard multiplication would be:
$X \cdot Y = X_1 Y_1 \cdot 10^{2m} + (X_1 Y_0 + X_0 Y_1) \cdot 10^m + X_0 Y_0$ (Requires 4 multiplications)

Karatsuba optimization:
Let $z_2 = X_1 Y_1$
Let $z_0 = X_0 Y_0$
Let $z_1 = (X_1 + X_0)(Y_1 + Y_0) - z_2 - z_0$
**Result** $= z_2 \cdot 10^{2m} + z_1 \cdot 10^m + z_0$ (Requires only 3 multiplications)

---

## 3. Complexity Analysis

- **Time Complexity**: $O(n^{\log_2 3}) \approx O(n^{1.585})$
- **Space Complexity**: $O(n)$ due to recursion stack.

---

## 4. Implementation

- [KaratsubaAlgorithm.java](./KaratsubaAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. Karatsuba Algorithm is based on which design paradigm?**

- A) Greedy Approach
- B) Dynamic Programming
- C) Divide and Conquer
- D) Backtracking
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. What is the time complexity of the Karatsuba algorithm?**

- A) $O(n^2)$
- B) $O(n \log n)$
- C) $O(n^{1.585})$
- D) $O(n^3)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. Karatsuba algorithm reduces the number of recursive multiplications from 4 to:**

- A) 1
- B) 2
- C) 3
- D) 4
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**4. When should the Karatsuba algorithm be preferred over standard multiplication?**

- A) For very small numbers (1 digit)
- B) For extremely large numbers
- C) It is always slower than standard multiplication
- D) Only for even numbers
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What does the variable $z_1$ represent in Karatsuba's formula?**

- A) $X_1 Y_1$
- B) $X_0 Y_0$
- C) $X_1 Y_0 + X_0 Y_1$
- D) $X_1 + Y_1$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
