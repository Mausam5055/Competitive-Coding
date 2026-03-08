# 🗜️ Huffman Coding

## 1. Introduction

**Huffman Coding** is a popular algorithm used for **lossless data compression**. It uses a variable-length coding scheme where characters that appear more frequently in the data are assigned shorter binary codes, while less frequent characters are assigned longer codes.

---

## 2. Approach / Algorithm

Huffman coding uses a **Greedy Algorithm** to build a binary tree (Huffman Tree).

### Steps:

1.  Calculate the frequency of each character in the input.
2.  Create a leaf node for each character and add it to a **Priority Queue** (min-heap).
3.  While there is more than one node in the queue:
    - Extract the two nodes with the lowest frequencies.
    - Create a new internal node with a frequency equal to the sum of the two nodes.
    - Add this new node back to the Priority Queue.
4.  The remaining node in the queue is the root of the Huffman Tree.
5.  Assign `0` for left branches and `1` for right branches to generate the binary codes for each leaf.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N \log N)$ where $N$ is the number of unique characters (due to priority queue operations).
- **Space Complexity**: $O(N)$ to store the tree and frequency map.

---

## 4. Implementation

- [HuffmanCoding.java](./HuffmanCoding.java)

---

## 📝 Exam-Based MCQs

**1. Huffman coding belongs to which category of algorithms?**

- A) Dynamic Programming
- B) Greedy Algorithm
- C) Divide and Conquer
- D) Backtracking
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. In Huffman coding, higher frequency characters are assigned:**

- A) Longer codes
- B) Shorter codes
- C) Fixed-length codes
- D) Random codes
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What data structure is primarily used to build the Huffman tree efficiently?**

- A) Stack
- B) Hash Map
- C) Priority Queue (Min-Heap)
- D) Linked List
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**4. Huffman coding is a form of:**

- A) Lossy compression
- B) Lossless compression
- C) Encryption
- D) Sorting
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the prefix property in Huffman coding?**

- A) No code is a prefix of any other code.
- B) All codes start with 0.
- C) All codes have the same prefix.
- D) The prefix is always '111'.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>
