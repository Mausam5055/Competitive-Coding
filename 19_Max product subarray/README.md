# 🔢 Maximum Product Subarray

## 1. Introduction

The **Maximum Product Subarray** problem asks to find the contiguous subarray within a one-dimensional array of numbers that has the largest product.

### Example:

Input: `[2, 3, -2, 4]`
Output: **6** (Subarray: `[2, 3]`)

---

## 2. Approach / Algorithm

A simple linear approach (similar to Kadane's algorithm but for product):

1.  Since a negative number can turn a very small product into a very large positive one, we keep track of both **maximum** and **minimum** products ending at the current position.
2.  Iterate through the array.
3.  For each element, update `maxSoFar` and `minSoFar`.
4.  If the element is negative, swap `maxSoFar` and `minSoFar` before updating.
5.  Keep track of the overall maximum product found.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$

---

## 4. Implementation

- [MaxProductSubarray.java](./MaxProductSubarray.java)

---

## 📝 Exam-Based MCQs

**1. What is the maximum product for the array `[-2, 0, -1]`?**

- A) 2
- B) 0
- C) -1
- D) 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Why do we keep track of the minimum product ending at a position?**

- A) To find the smallest product.
- B) Because a negative number multiplied by a minimum (negative) can become a maximum.
- C) To save memory.
- D) It is only useful for positive numbers.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the time complexity of the efficient solution for this problem?**

- A) $O(1)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. In the array `[6, -3, -10]`, what is the maximum product?**

- A) 6
- B) 180
- C) 60
- D) -30
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (The whole array 6*-3*-10 = 180)</b>
</details>

**5. Kadane's algorithm is primarily for sum, while this problem is for product. True or False?**

- A) True
- B) False
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>
