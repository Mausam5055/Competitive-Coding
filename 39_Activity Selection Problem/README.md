# 📅 Activity Selection Problem

## 1. Introduction

The **Activity Selection Problem** is a classic optimization problem. Given a set of activities, each with a start time $S_i$ and a finish time $F_i$, the goal is to find the maximum number of activities that can be performed by a single person or resource, assuming that the person can only work on one activity at a time.

---

## 2. Approach / Algorithm

This problem is best solved using a **Greedy Algorithm**.

### Steps:

1.  **Sort** the activities according to their **finish times**.
2.  Select the first activity from the sorted list and mark it as the `lastSelected` activity.
3.  For the remaining activities:
    - If the start time of the current activity is greater than or equal to the finish time of the `lastSelected` activity, select the current activity and update `lastSelected`.
4.  Repeat until all activities are considered.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N \log N)$ (due to sorting activities by finish time).
- **Space Complexity**: $O(N)$ to store the activities.

---

## 4. Implementation

- [ActivitySelection.java](./ActivitySelection.java)

---

## 📝 Exam-Based MCQs

**1. The Activity Selection Problem is typically solved using which approach?**

- A) Dynamic Programming
- B) Greedy Algorithm
- C) Backtracking
- D) Branch and Bound
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. To solve the problem greedily, activities must be sorted based on their:**

- A) Start Time
- B) Finish Time
- C) Duration
- D) Priority
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the time complexity of the Activity Selection algorithm if activities are already sorted?**

- A) $O(N \log N)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(1)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. Why do we sort by finish time instead of start time?**

- A) To pick the longest activity.
- B) To pick the activity that leaves the most room for subsequent activities.
- C) Because start times are often unknown.
- D) Sorting by finish time is faster.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. How many activities can be selected from these pairs (Start, Finish): (1,3), (2,5), (4,6), (6,7)?**

- A) 2
- B) 3
- C) 4
- D) 1
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B ((1,3), (4,6), (6,7))</b>
</details>
