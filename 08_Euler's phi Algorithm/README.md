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

**1. What does Euler's Totient Function $\phi(n)$ compute?**
A) The number of divisors of $n$.
B) The number of integers up to $n$ that are relatively prime to $n$.
C) The sum of all prime factors of $n$.
D) The prime factorization of $n$.
**Correct Answer: B**

**2. What is the value of $\phi(7)$?**
A) 1
B) 6
C) 7
D) 0
**Correct Answer: B (Since 7 is prime, $\phi(7) = 7-1 = 6$)**

**3. If $p$ and $q$ are two distinct prime numbers, what is $\phi(p \cdot q)$?**
A) $p \cdot q - 1$
B) $(p-1)(q-1)$
C) $p+q$
D) $pq/2$
**Correct Answer: B**

**4. What is the time complexity of the efficient algorithm to find $\phi(n)$?**
A) $O(n)$
B) $O(\log n)$
C) $O(\sqrt{n})$
D) $O(n^2)$
**Correct Answer: C**

**5. Which of the following numbers is relatively prime to 10?**
A) 2
B) 5
C) 3
D) 6
**Correct Answer: C (GCD(3, 10) = 1)**
