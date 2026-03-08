# 🔢 Booth's Algorithm

## 1. Introduction

**Booth's Multiplication Algorithm** is a multiplication algorithm that multiplies two signed binary numbers in two's complement notation. It is efficient because it reduces the number of partial product additions by shifting.

---

## 2. Approach / Algorithm

The algorithm looks at pairs of bits $(Q_i, Q_{i-1})$ of the multiplier:

1.  **00 or 11**: No arithmetic operation, just arithmetic shift.
2.  **01**: Add multiplicand to the partial product, then shift.
3.  **10**: Subtract multiplicand from the partial product, then shift.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$ where $N$ is the number of bits in the multiplier.
- **Space Complexity**: $O(N)$ to store the bits.

---

## 4. Implementation

- [BoothsAlgorithm.java](./BoothsAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. Booth's algorithm is used for the multiplication of:**

- A) Unsigned integers only
- B) Signed binary numbers in 2's complement
- C) Floating-point numbers
- D) Hexadecimal numbers
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. In Booth's algorithm, what action is taken when the last two bits are `01`?**

- A) Subtraction
- B) Addition
- C) Only Shift
- D) No action
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the main advantage of Booth's algorithm?**

- A) It increases the number of additions.
- B) It handles both positive and negative numbers without extra logic.
- C) It is only applicable for large numbers.
- D) It uses less memory than standard multiplication.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. When the last two bits are `10`, the action taken is:**

- A) Add
- B) Subtract
- C) Divide
- D) Stop
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. Which shift is performed at each step in Booth's algorithm?**

- A) Logical Left Shift
- B) Logical Right Shift
- C) Arithmetic Right Shift
- D) Circular Shift
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
