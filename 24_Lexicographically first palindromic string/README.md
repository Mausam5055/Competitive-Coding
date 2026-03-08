# 🔤 Lexicographically First Palindrome

## 1. Introduction

Given a string of characters, the task is to rearrange them to form the **lexicographically smallest** (first in dictionary order) palindrome.

### Example:

Input: `"aabbc"`

- Possible palindromes: `"abcba"`, `"bacab"`.
- `"abcba"` is lexicographically smaller.
  Output: **"abcba"**

---

## 2. Approach / Algorithm

1.  **Character Count**: Count the frequency of each character in the string.
2.  **Palindromic Check**:
    - Count how many characters have an **odd** frequency.
    - If more than one character has an odd frequency, a palindrome **cannot** be formed.
3.  **Construction**:
    - Use a **Map** (like `TreeMap` for automatic sorting) to iterate through characters from 'a' to 'z'.
    - For each character, append **half** of its frequency to a `firstHalf` string.
    - Keep track of the character with the odd frequency (if any) to place in the middle.
    - Result = `firstHalf` + `oddChar` + `reverse(firstHalf)`.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N + K \log K)$ where $N$ is string length and $K$ is the alphabet size (26).
- **Space Complexity**: $O(K)$ for character counts.

---

## 4. Implementation

- [FirstPalindrome.java](./FirstPalindrome.java)

---

## 📝 Exam-Based MCQs

**1. What is the condition for a string to be rearrangeable into a palindrome?**

- A) All characters must have even frequencies.
- B) All characters must have odd frequencies.
- C) At most one character can have an odd frequency.
- D) The string length must be even.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. Which data structure is best for storing character frequencies in sorted order?**

- A) HashMap
- B) TreeMap
- C) Stack
- D) Queue
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. If the input is `"apple"`, can a palindrome be formed?**

- A) Yes
- B) No
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Frequencies: a:1, p:2, l:1, e:1. More than one odd count)</b>
</details>

**4. To get the lexicographically smallest palindrome, we should process characters in:**

- A) Increasing order ('a' to 'z')
- B) Decreasing order ('z' to 'a')
- C) Random order
- D) The order they appear in the original string
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**5. What is the middle character of the lexicographical first palindrome of `"aaaabbbc"`?**

- A) 'a'
- B) 'b'
- C) 'c'
- D) No palindrome possible
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C (c is the only odd frequency character)</b>
</details>
