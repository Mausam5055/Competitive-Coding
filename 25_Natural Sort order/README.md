# 🔢 Natural Sort Order

## 1. Introduction

**Natural Sort Order** is an ordering of strings where multi-digit numbers are treated as a single unit rather than a sequence of individual digits. This is how humans naturally expect lists to be sorted.

### Example:

Standard Lexicographical Sort:

1. `img1.png`
2. `img10.png`
3. `img2.png`

**Natural Sort Order**:

1. `img1.png`
2. `img2.png`
3. `img10.png`

---

## 2. Approach / Algorithm

The key is to use a **Custom Comparator**:

1.  Iterate through both strings character by character.
2.  If both characters are digits, extract the entire numeric sequence from both strings.
3.  Convert these sequences to integers and compare their numerical values.
4.  If characters are non-digits, compare them normally (lexicographically).
5.  Repeat until a difference is found or one string ends.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N \cdot L)$ where $N$ is number of strings and $L$ is average string length.
- **Space Complexity**: $O(L)$ for string builder operations.

---

## 4. Implementation

- [NaturalSort.java](./NaturalSort.java)

---

## 📝 Exam-Based MCQs

**1. How does standard ASCII sort treat the strings "item2" and "item10"?**

- A) "item2" comes before "item10"
- B) "item10" comes before "item2"
- C) They are considered equal
- D) It depends on the operating system
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (Because '1' comes before '2' in ASCII)</b>
</details>

**2. Natural sort order is often used for:**

- A) Sorting large databases by primary key
- B) File names in file explorers (Windows/macOS)
- C) Encrypting data
- D) Floating point precision
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. If we use Natural Sort on `["a1", "a01", "a10"]`, what is a likely result if leading zeros are ignored?**

- A) `["a1", "a01", "a10"]`
- B) `["a01", "a1", "a10"]`
- C) `["a10", "a01", "a1"]`
- D) `["a1", "a10", "a01"]`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A (or B, depending on leading zero logic)</b>
</details>

**4. In Java, how do you implement Natural Sort for a list of strings?**

- A) `Collections.sort(list)`
- B) By using a custom `Comparator` with digit parsing logic
- C) `list.sort(null)`
- D) It's the default behavior of `String.compareTo()`
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the main logic difference between Lexicographical and Natural sort?**

- A) Natural sort is slower.
- B) Natural sort handles numbers as numeric values, not characters.
- C) Lexicographical sort only works for letters.
- D) There is no difference.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
