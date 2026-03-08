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

**1. What is the binary representation of the decimal number 5?**
A) `101`
B) `110`
C) `111`
D) `011`
**Correct Answer: A**

**2. Which of the following numbers is a binary palindrome?**
A) 4 (`100`)
B) 7 (`111`)
C) 10 (`1010`)
D) 6 (`110`)
**Correct Answer: B**

**3. In bit manipulation, which operation is used to get the last bit of a number?**
A) `n | 1`
B) `n ^ 1`
C) `n & 1`
D) `n >> 1`
**Correct Answer: C**

**4. What is the bitwise operation to shift bits to the left by 1 position?**
A) `>> 1`
B) `<< 1`
C) `& 1`
| D) `^ 1`
**Correct Answer: B**

**5. What is the time complexity to check if a number's binary form is a palindrome?**
A) $O(1)$
B) $O(N)$
C) $O(\log N)$
D) $O(N^2)$
**Correct Answer: C (where N is the input value)**
