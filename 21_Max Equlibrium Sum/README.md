# ⚖️ Maximum Equilibrium Sum

## 1. Introduction

The **Equilibrium Sum** of an array is a sum such that the sum of elements at lower indices is equal to the sum of elements at higher indices. The goal is to find the **maximum** such sum.

### Example:

Input: `[-7, 1, 5, 2, -4, 3, 0]`

- Index 3 is an equilibrium index because `(-7) + 1 + 5 = -1` and `(-4) + 3 + 0 = -1`.
- Equilibrium sum for index 3 is `-1`.

---

## 2. Approach / Algorithm

1.  Calculate the `totalSum` of the array.
2.  Maintain a `leftSum` initializing it to 0.
3.  Iterate through the array:
    - `rightSum = totalSum - leftSum - arr[i]`.
    - If `leftSum == rightSum`, we found an equilibrium point.
    - Update `maxSum = max(maxSum, leftSum)`.
    - `leftSum += arr[i]`.
4.  Return the `maxSum`.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$

---

## 4. Implementation

- [MaxEquilibriumSum.java](./MaxEquilibriumSum.java)

---

## 📝 Exam-Based MCQs

**1. What is an equilibrium point in an array?**

- A) An index where the element is equal to the sum of all elements.
- B) An index where the sum of elements before it is equal to the sum of elements after it.
- C) The middle element of a sorted array.
- D) An index where the element is zero.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. For the array `[1, 2, 3, 4, 3, 2, 1]`, what is the equilibrium index?**

- A) 2
- B) 3
- C) 4
- D) 5
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Index 3 has sum 6 on both sides)</b>
</details>

**3. What is the space complexity of the optimal equilibrium sum algorithm?**

- A) $O(N)$
- B) $O(1)$
- C) $O(N^2)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. If no equilibrium point is found, what should the algorithm typically return?**

- A) The total sum
- B) -1 or 0 (depending on implementation)
- C) The first element
- D) Infinite
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. How many traversals of the array are needed in the $O(N)$ approach?**

- A) 1
- B) 2 (One for total sum, one for equilibrium check)
- C) 3
- D) N
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
