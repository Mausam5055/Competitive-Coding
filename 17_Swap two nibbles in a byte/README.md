# 🔢 Swap Two Nibbles in a Byte

## 1. Introduction

A **byte** consists of 8 bits. A **nibble** is a group of 4 bits.

- **Higher Nibble**: The first 4 bits.
- **Lower Nibble**: The last 4 bits.

The goal is to swap these two nibbles.

### Example:

Input: $100$
Binary: `0110 0100` (First 4: `0110`, Last 4: `0100`)
Swapped: `0100 0110`
Result: **70**

---

## 2. Approach / Algorithm

Using Bitwise operators, we can extract and shift the nibbles:

1.  **Extract Lower Nibble**: `(n & 0x0F)` (Hex `0F` is `0000 1111`)
2.  **Shift Lower Nibble Left**: `(n & 0x0F) << 4`
3.  **Extract Higher Nibble**: `(n & 0xF0)` (Hex `F0` is `1111 0000`)
4.  **Shift Higher Nibble Right**: `(n & 0xF0) >> 4`
5.  **Combine**: Use Bitwise OR (`|`) to merge them.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(1)$
- **Space Complexity**: $O(1)$

---

## 4. Implementation

- [SwapNibbles.java](./SwapNibbles.java)

---

## 📝 Exam-Based MCQs

**1. How many bits are there in a "nibble"?**
A) 8
B) 2
C) 4
D) 16
**Correct Answer: C**

**2. Which hex value is used as a mask to extract the lower nibble of a byte?**
A) `0xFF`
B) `0x0F`
C) `0xF0`
D) `0xAA`
**Correct Answer: B**

**3. What is the decimal value of the binary `0000 1111`?**
A) 8
B) 15
C) 16
D) 255
**Correct Answer: B**

**4. If we swap nibbles of `0001 0000` (16), what is the resulting binary?**
A) `0000 0001`
B) `1111 0000`
C) `0001 0001`
D) `1010 1010`
**Correct Answer: A**

**5. Swap nibbles operation is mostly used in:**
A) Sorting algorithms
B) Graphics and Image Processing
C) Low-level bit manipulation and data compression
D) Database management
**Correct Answer: C**
