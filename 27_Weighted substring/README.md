# ⚖️ Weighted Substring

## 1. Introduction

The **Weighted Substring** problem involves finding the count of **distinct** substrings of a given string that satisfy a weight constraint. Each character from 'a' to 'z' is assigned a weight (often binary, where '0' means "bad" and '1' means "good"), and a substring is valid if the sum of weights of its characters does not exceed a limit $K$.

### Example:

Input:

- String: `"abab"`
- Weights: `"0101..."` (a is bad, b is good)
- $K = 1$
  Substrings with at most 1 'bad' character: `"a"`, `"b"`, `"ab"`, `"ba"`, `"aba"`, `"bab"`.
  Distinct ones: `"a", "b", "ab", "ba", "aba", "bab"`.

---

## 2. Approach / Algorithm

1.  **Iterate through all possible starting positions** of substrings.
2.  For each start index, grow the substring character by character.
3.  Maintain a `currentWeight` sum.
4.  If the weight exceeds $K$, stop growing from that start index.
5.  Store valid substrings in a **HashSet** to ensure they are distinct.
6.  Return the size of the set.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N^2)$ (Simple approach) or $O(N)$ with Suffix Automaton/Trie.
- **Space Complexity**: $O(N^2)$ to store all distinct substrings in a set.

---

## 4. Implementation

- [WeightedSubstring.java](./WeightedSubstring.java)

---

## 📝 Exam-Based MCQs

**1. What is the main constraint in the Weighted Substring problem?**

- A) The length of the substring.
- B) The number of vowels in the substring.
- C) The total sum of weights of characters in the substring.
- D) The alphabetical order of characters.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. Which data structure is typically used to store distinct substrings?**

- A) ArrayList
- B) LinkedList
- C) HashSet
- D) PriorityQueue
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. If all characters are "good" (weight 0) and $K=0$, how many distinct substrings of "aaa" are valid?**

- A) 1
- B) 3
- C) 6
- D) 0
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B ("a", "aa", "aaa")</b>
</details>

**4. What is the time complexity of the brute-force approach to find all distinct substrings?**

- A) $O(N)$
- B) $O(N^2)$
- C) $O(N^3)$ (due to string creation and hashing)
- D) $O( \log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C (Iterating $O(N^2)$ and $O(N)$ for string operations)</b>
</details>

**5. How can we optimize the distinct substring count beyond $O(N^2)$?**

- A) Using a Trie or Suffix Tree/Automaton.
- B) Using Bubble Sort.
- C) Using Binary Search.
- D) It cannot be optimized.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>
