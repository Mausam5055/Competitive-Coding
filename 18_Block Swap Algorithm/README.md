# 🔄 Block Swap Algorithm (Array Rotation)

## 1. Introduction

The **Block Swap Algorithm** is an efficient method to rotate an array. For an array $arr[]$ of size $n$, we want to rotate it by $d$ elements.

---

## 2. Approach / Algorithm

The algorithm divides the array into two blocks $A = arr[0 \dots d-1]$ and $B = arr[d \dots n-1]$.

- If size of $A$ is equal to size of $B$, swap $A$ and $B$.
- If size of $A <$ size of $B$, divide $B$ into $B_l$ and $B_r$ such that size of $B_r$ equals size of $A$. Swap $A$ and $B_r$.
- If size of $A >$ size of $B$, divide $A$ into $A_l$ and $A_r$ such that size of $A_l$ equals size of $B$. Swap $A_l$ and $B$.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$ (In-place rotation)

---

## 4. Implementation

- [BlockSwap.java](./BlockSwap.java)

---

## 📝 Exam-Based MCQs

**1. What is the goal of the Block Swap algorithm?**

- A) Sorting an array
- B) Rotating an array by $d$ elements
- C) Finding the maximum element
- D) Merging two arrays
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. What is the time complexity of the Block Swap algorithm?**

- A) $O(\log N)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(1)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. In rotation of array `[1, 2, 3, 4, 5]` by $d=2$, what is the result?**

- A) `[4, 5, 1, 2, 3]`
- B) `[3, 4, 5, 1, 2]`
- C) `[2, 3, 4, 5, 1]`
- D) `[5, 1, 2, 3, 4]`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What is the space complexity of the Block Swap algorithm?**

- A) $O(N)$
- B) $O(\log N)$
- C) $O(1)$
- D) $O(N^2)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. Block swap algorithm is generally considered:**

- A) Slower than the Reversal algorithm
- B) More memory-intensive than others
- C) Very efficient for in-place array rotation
- D) Only applicable for even-sized arrays
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
