# 🤴 Leaders in an Array

## 1. Introduction

An element in an array is called a **Leader** if it is greater than all the elements to its right side. The rightmost element is always considered a leader.

### Example:

Input: `[16, 17, 4, 3, 5, 2]`

- `2` is a leader (rightmost).
- `5` is a leader (greater than `2`).
- `17` is a leader (greater than `4, 3, 5, 2`).
  Output: `[17, 5, 2]`

---

## 2. Approach / Algorithm

1.  Initialize `maxFromRight` with the last element of the array.
2.  Add the last element to the `leaders` list.
3.  Iterate through the array from the second-to-last element down to the first ($n-2$ to $0$):
    - If the current element is greater than `maxFromRight`:
      - Update `maxFromRight` to the current element.
      - Add the current element to the `leaders` list.
4.  Reverse the `leaders` list to maintain the original relative order.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$ (One traversal)
- **Space Complexity**: $O(1)$ (if we don't count the output list) or $O(N)$ for the result.

---

## 4. Implementation

- [ArrayLeaders.java](./ArrayLeaders.java)

---

## 📝 Exam-Based MCQs

**1. Which element in an array is always a leader?**

- A) The first element
- B) The middle element
- C) The last element
- D) The smallest element
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. For the array `[10, 20, 30, 40, 50]`, the leaders are:**

- A) `[10]`
- B) `[50]`
- C) `[10, 20, 30, 40, 50]`
- D) `[50, 40, 30, 20, 10]`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Only 50 has nothing to its right greater than it)</b>
</details>

**3. What is the brute force time complexity to find all leaders?**

- A) $O(N)$
- B) $O(N \log N)$
- C) $O(N^2)$
- D) $O(1)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**4. In the optimal $O(N)$ approach, in which direction should we traverse the array?**

- A) Left to Right
- B) Right to Left
- C) Both directions simultaneously
- D) Skip every second element
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the space complexity of the optimal leader-finding algorithm (excluding output space)?**

- A) $O(1)$
- B) $O(N)$
- C) $O(\log N)$
- D) $O(\sqrt{N})$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>
