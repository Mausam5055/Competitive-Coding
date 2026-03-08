# 🧮 Chinese Remainder Theorem (CRT)

## 1. Introduction

The **Chinese Remainder Theorem** is used to solve a system of simultaneous congruences with different moduli. It states that if one knows the remainders of the Euclidean division of an integer $x$ by several integers, then one can determine uniquely the remainder of the division of $x$ by the product of these integers, under the condition that the moduli are pairwise coprime.

---

## 2. Problem Statement

Find $x$ such that:

- $x \equiv a_1 \pmod{n_1}$
- $x \equiv a_2 \pmod{n_2}$
- ...
- $x \equiv a_k \pmod{n_k}$

Where $n_1, n_2, ..., n_k$ are pairwise coprime.

---

## 3. Algorithm

1.  Compute $N = n_1 \cdot n_2 \cdot ... \cdot n_k$.
2.  For each $i$:
    - Compute $M_i = N / n_i$.
    - Find $y_i$ such that $M_i \cdot y_i \equiv 1 \pmod{n_i}$ (Modular Inverse).
3.  The solution is $x = \sum (a_i \cdot M_i \cdot y_i) \pmod N$.

---

## 4. Complexity Analysis

- **Time Complexity**: $O(k \log(\text{max } n_i))$ due to modular inverse calculations using Extended Euclid's algorithm.
- **Space Complexity**: $O(k)$ to store the inputs.

---

## 5. Implementation

- [RemainderTheorem.java](./RemainderTheorem.java)

---

## 📝 Exam-Based MCQs

**1. What is the condition for the Chinese Remainder Theorem to have a unique solution?**
A) All moduli must be prime.
B) All moduli must be pairwise coprime.
C) All remainders must be the same.
D) The number of equations must be even.
**Correct Answer: B**

**2. Which algorithm is commonly used to find the modular inverse in CRT?**
A) Binary Search
B) Extended Euclidean Algorithm
C) Sieve of Eratosthenes
D) Dijkstra's Algorithm
**Correct Answer: B**

**3. In CRT, if $n_1 = 3, n_2 = 5$, what is the product $N$?**
A) 8
B) 2
C) 15
D) 1
**Correct Answer: C**

**4. The Chinese Remainder Theorem provides a unique solution modulo:**
A) $\text{max}(n_i)$
B) $\sum n_i$
C) $\prod n_i$
D) $\text{min}(n_i)$
**Correct Answer: C**

**5. Solve: $x \equiv 2 \pmod 3$ and $x \equiv 3 \pmod 5$. The smallest positive $x$ is?**
A) 5
B) 8
C) 11
D) 14
**Correct Answer: B (8 % 3 = 2, 8 % 5 = 3)**
