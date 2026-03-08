# 💀 Josephus Trap

## 1. Introduction

The **Josephus Problem** (or Josephus Trap) is a theoretical problem related to a certain counting-out game. People are standing in a circle waiting to be executed. After a specified number of people are skipped, the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed) until only the last person remains, who is given freedom.

### Example:

Input: $N = 5, K = 3$

1. Circle: `1, 2, 3, 4, 5`
2. 3rd person (3) is removed. Circle: `1, 2, 4, 5`
3. Next 3rd (1) is removed. Circle: `2, 4, 5`
4. Next 3rd (5) is removed. Circle: `2, 4`
5. Next 3rd (2) is removed. Circle: `4`
   Output: **4**

---

## 2. Approach / Algorithm

### Recursive Formula

Let $f(n, k)$ be the position of the survivor for $n$ people and step $k$ (using 0-based indexing).
$$f(n, k) = (f(n-1, k) + k) \pmod n$$
Base Case: $f(1, k) = 0$.

### Iterative Method

We can start from 1 person and build up to $n$ using a simple loop.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$ (for iterative) or $O(N)$ (for recursive stack).

---

## 4. Implementation

- [JosephusProblem.java](./JosephusProblem.java)

---

## 📝 Exam-Based MCQs

**1. What is the base case for the Josephus recursive formula?**

- A) $f(0, k) = 0$
- B) $f(1, k) = 1$
- C) $f(1, k) = 0$
- D) $f(k, k) = 0$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. In the Josephus problem with $N=7$ and $K=2$, who is the survivor?**

- A) 1
- B) 7
- C) 5
- D) 3
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the recurrence relation used to solve this problem?**

- A) $f(n, k) = f(n-1, k) + k$
- B) $f(n, k) = (f(n-1, k) + k) \pmod n$
- C) $f(n, k) = n \times k$
- D) $f(n, k) = f(n/2, k)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What is the time complexity to find the survivor for $N$ people and step $K$?**

- A) $O(K)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. The Josephus problem can be categorized under which algorithmic paradigm?**

- A) Greedy
- B) Backtracing
- C) Recursion / Dynamic Programming
- D) Searching
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
