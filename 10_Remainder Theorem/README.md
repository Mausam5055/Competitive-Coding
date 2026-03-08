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

**1. What is the main requirement for the Chinese Remainder Theorem to be applicable?**

- A) All remainders must be equal.
- B) All moduli must be pairwise coprime.
- C) Moduli must be prime numbers only.
- D) The number of equations must be even.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. CRT is used to solve a system of:**

- A) Linear equations
- B) Quadratic equations
- C) Simultaneous congruences
- D) Differential equations
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. Given $x \equiv 2 \pmod 3$ and $x \equiv 3 \pmod 5$, what is a possible value for $x$?**

- A) 5
- B) 8
- C) 11
- D) 13
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (8%3=2, 8%5=3)</b>
</details>

**4. The solution found by CRT is unique modulo:**

- A) The largest modulus
- B) The sum of moduli
- C) The product of moduli
- D) The average of moduli
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. In CRT, if $M = m_1 \times m_2 \times \dots \times m_n$, then $M_i$ is computed as:**

- A) $M + m_i$
- B) $M - m_i$
- C) $M / m_i$
- D) $M^{m_i}$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
