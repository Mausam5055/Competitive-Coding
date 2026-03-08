# 🗳️ Majority Element

## 1. Introduction

A **Majority Element** in an array of size $n$ is an element that appears more than $n/2$ times.

### Example:

Input: `[3, 3, 4, 2, 4, 4, 2, 4, 4]`

- Size $n = 9$.
- Majority element must appear $> 4.5$ times.
- `4` appears 5 times.
  Output: **4**

---

## 2. Approach / Algorithm

The **Boyer-Moore Voting Algorithm** is the most efficient way to find the majority element.

### Steps:

1.  **Candidate Selection**:
    - Maintain a `candidate` and a `count`.
    - If `count` is 0, pick the current element as the `candidate`.
    - If current element is the `candidate`, increment `count`.
    - Otherwise, decrement `count`.
2.  **Verification**:
    - Traverse the array again to count the occurrences of the selected `candidate`.
    - If count $> n/2$, it is the majority element.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$

---

## 4. Implementation

- [MajorityElement.java](./MajorityElement.java)

---

## 📝 Exam-Based MCQs

**1. What is the definition of a majority element in an array of size $n$?**

- A) An element that appears exactly $n/2$ times.
- B) An element that appears more than $n/2$ times.
- C) An element that is the largest in the array.
- D) An element that appears at least once.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Which algorithm finds the majority element in $O(N)$ time and $O(1)$ space?**

- A) Binary Search
- B) Boyer-Moore Voting Algorithm
- C) Merge Sort
- D) Kadane's Algorithm
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. In an array of size 10, what is the minimum frequency required for an element to be a majority element?**

- A) 5
- B) 6
- C) 10
- D) 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B ($> 10/2 \implies > 5$)</b>
</details>

**4. What happens in the Boyer-Moore algorithm if the count becomes zero?**

- A) The algorithm stops.
- B) A new candidate is chosen from the current element.
- C) The previous candidate is returned.
- D) The array is sorted.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. Can an array have more than one majority element (appearing $> n/2$ times)?**

- A) Yes, up to two.
- B) No, at most one.
- C) Yes, up to $n$ elements.
- D) Only if $n$ is even.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
