# 🔢 Longest Sequence of 1 after flipping a bit

## 1. Introduction

Given an integer, you are allowed to flip exactly one bit from $0$ to $1$. The goal is to find the length of the longest sequence of consecutive $1$s you can create.

### Example:

Input: $1775$
Binary: `11011101111`

- If we flip the first $0$: `11111101111` (length 6)
- If we flip the second $0$: `11011111111` (length 8)
  Output: **8**

---

## 2. Approach / Algorithm

An efficient approach is to keep track of the current sequence length and the previous sequence length (separated by a single zero).

1.  Iterate through bits of the number.
2.  If the bit is $1$, increment `currentLen`.
3.  If the bit is $0$, update `prevLen` and reset `currentLen`.
4.  At each step, keep track of $maxLen = \max(maxLen, currentLen + prevLen + 1)$.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(B)$ where $B$ is the number of bits (e.g., 32 for an integer).
- **Space Complexity**: $O(1)$.

---

## 4. Implementation

- [LongestSequenceWithFlip.java](./LongestSequenceWithFlip.java)

---

## 📝 Exam-Based MCQs

**1. What is the goal of the "Longest Sequence after Flip" problem?**

- A) To find the total number of 1s in binary.
- B) To find the longest sequence of 0s.
- C) To maximize the sequence of 1s by flipping one 0.
- D) To convert decimal to binary.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. For the binary number `1101`, what is the maximum length of 1s after flipping one bit?**

- A) 2
- B) 3
- C) 4
- D) 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C (Flip 0 to get `1111`)</b>
</details>

**3. If a number is all 1s (e.g., `1111`), what is the result of the algorithm for a 4-bit integer?**

- A) 4
- B) 5
- C) 3
- D) 0
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**4. What is the bitwise operation used to check if the last bit is 1?**

- A) `n | 1`
- B) `n & 1`
- C) `n ^ 1`
- D) `n >> 1`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the time complexity of the bit-tracking approach?**

- A) $O(1)$
- B) $O(N)$
- C) $O(\log N)$
- D) $O(N^2)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C (where N is the value of the number, or $O(\text{bits})$)</b>
</details>
