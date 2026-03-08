# 🧮 Euclid's Algorithm (GCD)

## 1. Introduction

**Euclid's Algorithm** is an efficient method for computing the **Greatest Common Divisor (GCD)** of two integers. GCD is the largest positive integer that divides both numbers without leaving a remainder.

---

## 2. Approach / Algorithm

The algorithm is based on the principle that the GCD of two numbers also divides their difference.
More specifically, $GCD(a, b) = GCD(b, a \pmod b)$.

### Steps:

1.  Divide $a$ by $b$ and find the remainder $r$.
2.  Replace $a$ with $b$ and $b$ with $r$.
3.  Repeat until $b$ becomes 0. The value of $a$ at that point is the GCD.

---

## 3. Extended Euclid Algorithm

This version not only finds the GCD but also finds coefficients $x$ and $y$ such that:
$$ax + by = GCD(a, b)$$
This is useful for finding **Modular Multiplicative Inverse**.

---

## 4. Complexity Analysis

- **Time Complexity**: $O(\log(\min(a, b)))$
- **Space Complexity**: $O(1)$ (Iterative) or $O(\log(\min(a, b)))$ (Recursive stack).

---

## 5. Implementation

- [EuclidsAlgorithm.java](./EuclidsAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. What does the Euclid's Algorithm calculate?**
A) Least Common Multiple (LCM)
B) Greatest Common Divisor (GCD)
C) Prime Factorization
D) Square Root
**Correct Answer: B**

**2. What is the time complexity of Euclid's Algorithm for two numbers $a$ and $b$?**
A) $O(n)$
B) $O(\sqrt{n})$
C) $O(\log(\min(a, b)))$
D) $O(1)$
**Correct Answer: C**

**3. What is the GCD of 48 and 18?**
A) 2
B) 6
C) 12
D) 8
**Correct Answer: B (48=18*2+12, 18=12*1+6, 12=6\*2+0)**

**4. The Extended Euclid Algorithm is primarily used to find:**
A) Modular Multiplicative Inverse
B) Factorial of a number
C) Power of a number
D) Sorting order
**Correct Answer: A**

**5. If $GCD(a, b) = 1$, then $a$ and $b$ are said to be:**
A) Even numbers
B) Perfect squares
C) Coprime (Relative Prime)
D) Composite numbers
**Correct Answer: C**
