# 🧮 Simple Sieve (Sieve of Eratosthenes)

## 1. Introduction

The **Sieve of Eratosthenes** is an ancient and efficient algorithm used to find all prime numbers up to a given limit $N$. It works by iteratively marking the multiples of each prime number starting from 2.

---

## 2. Approach / Algorithm

1.  Create a list of consecutive integers from 2 through $N$: $(2, 3, 4, ..., N)$.
2.  Initially, let $p = 2$, the smallest prime number.
3.  Enumerate the multiples of $p$ by counting in increments of $p$ from $p^2$ to $N$, and mark them in the list (these will be $2p, 3p, 4p, ...$; the $p^2$ optimization is used because any smaller multiple would have already been marked by a smaller prime).
4.  Find the smallest number in the list greater than $p$ that is not marked. If there was no such number, stop. Otherwise, let $p$ now equal this new number (which is the next prime), and repeat from step 3.
5.  When the algorithm terminates, the numbers remaining not marked in the list are all the primes below $N$.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N \log \log N)$
- **Space Complexity**: $O(N)$

---

## 4. Implementation

- [SimpleSieve.java](./SimpleSieve.java)

---

## 📝 Exam-Based MCQs

**1. What is the time complexity of the Simple Sieve of Eratosthenes?**
A) $O(N)$
B) $O(N \log N)$
C) $O(N \log \log N)$
D) $O(N^2)$
**Correct Answer: C**

**2. Which optimization is commonly used in the inner loop of the Sieve?**
A) Start marking multiples from $p + 1$
B) Start marking multiples from $p^2$
C) Start marking multiples from $2p$
D) Marking only even numbers
**Correct Answer: B**

**3. What is the space complexity of the Sieve of Eratosthenes to find primes up to $N$?**
A) $O(1)$
B) $O(\sqrt{N})$
C) $O(N)$
D) $O(\log N)$
**Correct Answer: C**

**4. Why do we stop the outer loop at $\sqrt{N}$?**
A) Because there are no primes greater than $\sqrt{N}$
B) Because all composite numbers will have at least one factor less than or equal to $\sqrt{N}$
C) To make the algorithm $O(\sqrt{N})$
D) Because $N$ is always a perfect square
**Correct Answer: B**

**5. Sieve of Eratosthenes is used for which of the following?**
A) Sorting an array
B) Finding the shortest path in a graph
C) Generating prime numbers efficiently
D) Searching for an element in a binary tree
**Correct Answer: C**
