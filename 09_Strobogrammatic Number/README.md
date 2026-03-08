# 🔄 Strobogrammatic Number

## 1. Introduction

A **Strobogrammatic Number** is a number that looks exactly the same when rotated 180 degrees (upside down).

### Example:

- **69**: Turned upside down, 6 becomes 9 and 9 becomes 6. So it becomes "69".
- **88**: Turned upside down, 8 remains 8.
- **101**: Turned upside down, 1 remains 1 and 0 remains 0.

---

## 2. Approach / Algorithm

1.  Define a mapping for strobogrammatic digits:
    - `0` -> `0`
    - `1` -> `1`
    - `6` -> `9`
    - `8` -> `8`
    - `9` -> `6`
2.  Use two pointers: `left` at the start and `right` at the end of the string.
3.  Check if characters at `left` and `right` are valid and map to each other.
4.  Move `left` forward and `right` backward until they meet.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$ where $N$ is the number of digits.
- **Space Complexity**: $O(1)$ (ignoring the small mapping table).

---

## 4. Implementation

- [Strobogrammatic.java](./Strobogrammatic.java)

---

## 📝 Exam-Based MCQs

**1. Which of the following digits remain unchanged when rotated 180 degrees?**

- A) 1, 2, 3
- B) 0, 1, 8
- C) 0, 6, 9
- D) 2, 5, 8
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. What does a Strobogrammatic Number look like when rotated 180 degrees?**

- A) It looks inverted.
- B) It looks like a different number.
- C) It looks exactly the same.
- D) It becomes zero.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. Which pair of digits are Strobogrammatic reflections of each other?**

- A) 2 and 5
- B) 6 and 9
- C) 3 and 4
- D) 7 and 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. Is 619 a Strobogrammatic Number?**

- A) Yes
- B) No
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A (6 becomes 9, 1 becomes 1, 9 becomes 6 -> 619 rotated is 619)</b>
</details>

**5. What is the time complexity to check if a number of $N$ digits is Strobogrammatic?**

- A) $O(1)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
