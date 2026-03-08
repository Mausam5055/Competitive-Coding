# 🧮 Euler's Totient Function (Phi)

## 1. Introduction

**Euler's Totient Function**, denoted as $\phi(n)$, counts the number of positive integers up to $n$ that are **relatively prime** to $n$. Two numbers are relatively prime if their greatest common divisor (GCD) is 1.

---

## 2. Mathematical Formula

For a number $n$ with prime factorization $n = p_1^{a_1} p_2^{a_2} ... p_k^{a_k}$:
$$\phi(n) = n \left(1 - \frac{1}{p_1}\right) \left(1 - \frac{1}{p_2}\right) ... \left(1 - \frac{1}{p_k}\right)$$

### Properties:

1.  If $p$ is prime, $\phi(p) = p - 1$.
2.  If $a$ and $b$ are relatively prime, $\phi(ab) = \phi(a) \cdot \phi(b)$.

---

## 3. Algorithm

1.  Initialize `result = n`.
2.  Iterate through all prime factors of $n$.
3.  For each prime factor $p$:
    - Divide $n$ by $p$ completely.
    - Update `result = result - (result / p)`.
4.  If $n > 1$ after the loop, it means the remaining $n$ is a prime factor. Update `result` accordingly.

---

## 4. Complexity Analysis

- **Time Complexity**: $O(\sqrt{n})$
- **Space Complexity**: $O(1)$

---

## 5. Implementation

- [EulerPhi.java](./EulerPhi.java)

---

## 📝 Exam-Based MCQs

**1. What does $\phi(n)$ represent?**

- A) Sum of factors of $n$
- B) Number of primes up to $n$
- C) Number of integers up to $n$ that are coprime to $n$
- D) Factorial of $n$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. What is the value of $\phi(7)$?**

- A) 7
- B) 6
- C) 5
- D) 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Since 7 is prime, $\phi(7) = 7-1$)</b>
</details>

**3. If $p$ is a prime number, $\phi(p^k)$ is equal to:**

- A) $p^k - 1$
- B) $p^k - p^{k-1}$
- C) $p^{k-1}$
- D) $p \times k$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. Euler's Totient function is a multiplicative function. If $gcd(a, b) = 1$, then $\phi(a \times b)$ is:**

- A) $\phi(a) + \phi(b)$
- B) $\phi(a) - \phi(b)$
- C) $\phi(a) \times \phi(b)$
- D) $\phi(a) / \phi(b)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. What is the value of $\phi(10)$?**

- A) 4
- B) 5
- C) 9
- D) 2
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A (Coprime numbers are 1, 3, 7, 9)</b>
</details>
