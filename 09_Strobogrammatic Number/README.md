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

**1. Which of the following digits remain the same when rotated 180 degrees?**
A) 2
B) 5
C) 8
D) 4
**Correct Answer: C**

**2. Is the number "96" strobogrammatic?**
A) Yes
B) No
**Correct Answer: A (9 becomes 6, 6 becomes 9, so it stays 69 upside down? Wait, 96 upside down is 96.)**

**3. What is the rotated version of the digit 6?**
A) 6
B) 9
C) 8
D) 0
**Correct Answer: B**

**4. Which of these is NOT a strobogrammatic number?**
A) 11
B) 69
C) 818
D) 22
**Correct Answer: D**

**5. How many pointers are typically used in the efficient algorithm to check for a strobogrammatic number?**
A) 1
B) 2
C) 3
D) 4
**Correct Answer: B**
