# ⚡ Quick Sort & 🔎 Selection Sort

## 1. Introduction

This topic covers two fundamental sorting algorithms:

- **Selection Sort**: A simple, in-place comparison-based sort.
- **Quick Sort**: A highly efficient, divide-and-conquer sorting algorithm.

---

## 2. Algorithms

### Selection Sort

1.  Find the minimum element in the unsorted part.
2.  Swap it with the first element of the unsorted part.
3.  Move the boundary between sorted and unsorted parts.

### Quick Sort

1.  Pick an element as `pivot`.
2.  **Partition**: Rearrange the array so elements smaller than pivot are on the left, and larger ones are on the right.
3.  Recursively apply the same logic to the left and right sub-arrays.

---

## 3. Complexity Analysis

| Algorithm          | Best Case     | Average Case  | Worst Case | Space Complexity |
| :----------------- | :------------ | :------------ | :--------- | :--------------- |
| **Selection Sort** | $O(N^2)$      | $O(N^2)$      | $O(N^2)$   | $O(1)$           |
| **Quick Sort**     | $O(N \log N)$ | $O(N \log N)$ | $O(N^2)$   | $O(\log N)$      |

---

## 4. Implementation

- [SortingAlgos.java](./SortingAlgos.java)

---

## 📝 Exam-Based MCQs

**1. Which sorting algorithm has a worst-case time complexity of $O(N^2)$ but an average of $O(N \log N)$?**

- A) Merge Sort
- B) Quick Sort
- C) Selection Sort
- D) Bubble Sort
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Selection sort is generally preferred for:**

- A) Large datasets
- B) Datasets where swap operations are expensive
- C) Small datasets with minimal memory overhead
- D) Priority queues
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. What is the main disadvantage of Selection Sort?**

- A) It is unstable.
- B) It uses $O(N)$ extra space.
- C) It is $O(N^2)$ even if the array is already sorted.
- D) It cannot sort strings.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**4. The 'Partition' step is a key component of which algorithm?**

- A) Selection Sort
- B) Insertion Sort
- C) Quick Sort
- D) Heap Sort
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. Which pivot selection strategy helps avoid the $O(N^2)$ worst-case in Quick Sort?**

- A) Always pick the first element.
- B) Always pick the last element.
- C) Pick a random element or the median of three.
- D) Pick the smallest element.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
