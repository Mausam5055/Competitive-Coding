# ➖ Move Hyphens to Beginning

## 1. Introduction

The task is to take a string and move all the hyphen characters (`-`) to the beginning of the string, ensuring that the original relative order of all other characters is maintained.

### Example:

Input: `"code-is-cool"`
Output: `"--codeiscool"`

---

## 2. Approach / Algorithm

### Method 1: StringBuilder (Simple)

1.  Iterate through the string.
2.  Collect all hyphens in one `StringBuilder`.
3.  Collect all other characters in another `StringBuilder`.
4.  Concatenate them: `hyphens` + `others`.

### Method 2: Reverse Traversal (Efficient)

1.  Traverse the string from **right to left**.
2.  Keep a pointer `pos` starting at the end.
3.  Whenever a non-hyphen character is found, place it at `arr[pos]` and decrement `pos`.
4.  After the traversal, fill the remaining positions from `0` to `pos` with hyphens.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N)$ (One traversal)
- **Space Complexity**: $O(N)$ (To store the modified characters)

---

## 4. Implementation

- [MoveHyphens.java](./MoveHyphens.java)

---

## 📝 Exam-Based MCQs

**1. What is the main goal of the Move Hyphen problem?**

- A) To delete all hyphens from a string.
- B) To move all hyphens to the start and keep other characters in order.
- C) To replace hyphens with spaces.
- D) To sort the string alphabetically.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. For the input `"a-b-c"`, the output should be:**

- A) `"--abc"`
- B) `"abc--"`
- C) `"-a-bc"`
- D) `"cba--"`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**3. Which traversal direction is most efficient for an in-place-like array modification for this problem?**

- A) Left to Right
- B) Right to Left
- C) Middle to Ends
- D) Random
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What happens to the relative order of non-hyphen characters?**

- A) They are reversed.
- B) They stay the same.
- C) They are sorted alphabetically.
- D) They stay at their original indices.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the time complexity of the optimal solution?**

- A) $O(1)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(\log N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
