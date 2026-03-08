# 🧮 Segmented & Incremental Sieve

## 1. Introduction

The **Segmented Sieve** is an optimization of the Simple Sieve. Instead of creating a large array of size $N$, we divide the range $[1, N]$ into smaller segments and process each segment one by one. This significantly reduces the space complexity.

---

## 2. Why Segmented Sieve?

- **Memory Efficiency**: Simple Sieve requires $O(N)$ space, which fails for $N > 10^9$. Segmented Sieve uses $O(\sqrt{N})$ auxiliary space.
- **Cache Friendly**: Processing smaller segments improves cache performance.
- **Large Ranges**: Perfect for finding primes in a range $[L, R]$ where $R$ is large but $R-L$ is small.

---

## 3. Algorithm

1.  Find all primes up to $\sqrt{R}$ using Simple Sieve.
2.  Divide the range $[L, R]$ into segments of size $\approx \sqrt{R}$.
3.  For each segment, create a boolean array and mark multiples of primes found in step 1.
4.  Primes remaining in the segment are the result.

---

## 4. Complexity Analysis

- **Time Complexity**: $O((R-L+1) \log \log R + \sqrt{R} \log \log \sqrt{R})$
- **Space Complexity**: $O(\sqrt{R} + \text{segment size})$

---

## 5. Implementation

- [SegmentedSieve.java](./SegmentedSieve.java)

---

## 📝 Exam-Based MCQs

**1. What is the primary advantage of Segmented Sieve over Simple Sieve?**
A) It is much faster in terms of time complexity.
B) it reduces the space complexity from $O(N)$ to $O(\sqrt{N})$.
C) It can only find even numbers.
D) It doesn't require any prime numbers to start.
**Correct Answer: B**

**2. Which primes are needed to mark composite numbers in a segment up to $R$?**
A) All primes up to $R/2$
B) Only the first 10 primes
C) All primes up to $\sqrt{R}$
D) Only primes between $L$ and $R$
**Correct Answer: C**

**3. In a range query $[L, R]$, what is the size of the boolean array used in Segmented Sieve?**
A) $R$
B) $L$
C) $R - L + 1$
D) $\sqrt{R}$
**Correct Answer: C**

**4. Segmented Sieve is particularly useful when:**
A) $N$ is very small.
B) We want to find primes in a large range far away from zero.
C) We have infinite memory.
D) Time complexity is not a concern.
**Correct Answer: B**

**5. What is the space complexity of Segmented Sieve?**
A) $O(N)$
B) $O(1)$
C) $O(\sqrt{N} + \text{segment size})$
D) $O(N \log N)$
**Correct Answer: C**
