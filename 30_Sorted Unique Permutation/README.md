# 🔀 Sorted Unique Permutations

## 1. Introduction

The goal is to generate all **distinct** permutations of a string (which may have duplicate characters) and list them in **lexicographical (dictionary) order**.

### Example:

Input: `"ABB"`
Sorted Unique Permutations:

1. `"ABB"`
2. `"BAB"`
3. `"BBA"`
   Output: **3 permutations**

---

## 2. Approach / Algorithm

We use **Backtracking with Pruning** to solve this efficiently.

### Steps:

1.  **Sort the characters**: This is crucial to handle duplicates and ensure the generated permutations are in order.
2.  **Backtrack**: Build the permutation one character at a time.
3.  **Handle Duplicates**: In the loop, if the current character is the same as the previous one (`chars[i] == chars[i-1]`) and the previous one hasn't been used in this recursive branch, skip the current character to avoid duplicate permutations.
4.  **Base Case**: When the current string length equals the original string length, add it to the result list.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N \cdot N!)$ where $N$ is the string length.
- **Space Complexity**: $O(N)$ for recursion depth and backtracking storage.

---

## 4. Implementation

- [SortedUniquePermutations.java](./SortedUniquePermutations.java)

---

## 📝 Exam-Based MCQs

**1. How many unique permutations does the string `"AAA"` have?**

- A) 1
- B) 3
- C) 6
- D) 9
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**2. Which algorithmic technique is most commonly used for generating permutations?**

- A) Greedy Approach
- B) Dynamic Programming
- C) Backtracking
- D) Divide and Conquer
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. Why is sorting the string important before generating permutations?**

- A) To make the algorithm faster.
- B) To ensure permutations are generated in lexicographical order.
- C) To remove characters.
- D) It is not important.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. For a string of length $N$ with all unique characters, how many permutations exist?**

- A) $N^2$
- B) $2^N$
- C) $N!$
- D) $N$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. What is the time complexity to generate all permutations of a string with $N$ unique characters?**

- A) $O(N)$
- B) $O(N^2)$
- C) $O(N \cdot N!)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
