# 🔍 Manacher's Algorithm

## 1. Introduction

**Manacher's Algorithm** is an advanced string algorithm used to find the **Longest Palindromic Substring** in linear time. While the brute-force approach takes $O(N^2)$, Manacher's optimizes this by reusing information from previously found palindromes.

### Example:

Input: `"babad"`
Possible Palindromes: `"bab"`, `"aba"`.
Longest: `"bab"` (or `"aba"`).

---

## 2. Approach / Algorithm

1.  **Preprocessing**: Transform the string by inserting special characters (like `#`) between every character and at the ends (e.g., `aba` $\to$ `#a#b#a#`). This handles both even and odd length palindromes uniformly.
2.  **Tracking Palindromes**: Maintain an array `P[i]` that stores the radius of the palindrome centered at index `i`.
3.  **Center and Right Boundary**: Keep track of the rightmost palindrome's `center` and its right boundary `R`.
4.  **Symmetry Optimization**: For a new index `i`, if `i < R`, its initial radius can be estimated using its mirror position relative to `center`.
5.  **Expansion**: Try to expand the palindrome centered at `i` and update `center` and `R` when necessary.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(N)$ (for the transformed string and radius array)

---

## 4. Implementation

- [ManachersAlgorithm.java](./ManachersAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. What is the time complexity of Manacher's Algorithm?**

- A) $O(N \log N)$
- B) $O(N^2)$
- C) $O(N)$
- D) $O(1)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. Why is preprocessing (adding #) necessary in Manacher's Algorithm?**

- A) To make the string longer.
- B) To handle even-length and odd-length palindromes uniformly.
- C) To encrypt the string.
- D) To remove whitespace.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. In the array `P[i]` of Manacher's, what does `P[i]` store?**

- A) The start index of the palindrome.
- B) The radius of the palindrome centered at `i`.
- C) The frequency of the character at `i`.
- D) The total number of palindromes.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. Manacher's algorithm is an improvement over which approach?**

- A) Binary Search
- B) Brute-force $O(N^2)$ expansion around center
- C) Quick Sort
- D) Dijkstra's Algorithm
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What does the "Right Boundary (R)" represent in the algorithm?**

- A) The end of the string.
- B) The rightmost edge reached by any previously discovered palindrome.
- C) The number of palindromes found so far.
- D) The index of the last character.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
