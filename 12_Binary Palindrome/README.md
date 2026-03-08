# 🔢 Binary Palindrome

## 1. Introduction

A number is a **Binary Palindrome** if its binary representation reads the same forwards and backwards.

### Example:

- **9**: Binary is `1001`. Readings from left and right are both `1001`. (Palindrome)
- **10**: Binary is `1010`. Reading from right is `0101`. (Not a Palindrome)

---

## 2. Approach / Algorithm

### Method 1: String Conversion

1.  Convert the integer to its binary string representation using `Integer.toBinaryString(n)`.
2.  Use two pointers (`left` and `right`) to check if the string is a palindrome.

### Method 2: Bit Manipulation (Efficient)

1.  Initialize `rev = 0`.
2.  While input `n > 0`:
    - Shift `rev` left by 1: `rev <<= 1`.
    - Add the last bit of `n` to `rev`: `rev |= (n & 1)`.
    - Shift `n` right by 1: `n >>= 1`.
3.  Check if original `n` equals `rev`.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(\text{number of bits})$ which is $O(\log N)$.
- **Space Complexity**: $O(\log N)$ for string method, $O(1)$ for bit manipulation.

---

## 4. Implementation

- [BinaryPalindrome.java](./BinaryPalindrome.java)

---

## 📝 Exam-Based MCQs

**1. What is the binary representation of 9?**

- A) `1010`
- B) `1001`
- C) `1100`
- D) `1011`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Is the number 9 a Binary Palindrome?**

- A) Yes
- B) No
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A (`1001` is same forwards and backwards)</b>
</details>

**3. What is the binary of 10?**

- A) `1010`
- B) `0101`
- C) `1111`
- D) `1100`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**4. Which of these is a character sequence that is a palindrome?**

- A) `racecar`
- B) `hello`
- C) `world`
- D) `java`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**5. What is the time complexity to check if a number's binary is a palindrome?**

- A) $O(1)$
- B) $O(N)$ (where $N$ is value)
- C) $O(\text{bits})$ or $O(\log \text{Value})$
- D) $O(N^2)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
