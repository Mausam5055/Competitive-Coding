# 💡 Toggle Switch & 🍎 Alice Apple Tree

## 1. Toggle Switch Problem

There are $N$ switches in a room, all initially OFF.

- In round 1, you toggle every switch (1, 2, 3, ...).
- In round 2, you toggle every 2nd switch (2, 4, 6, ...).
- ...
- In round $N$, you toggle the $N$-th switch.

**Observation**: A switch $i$ is toggled once for every divisor it has.

- If a number has an **even** number of divisors, it ends up **OFF**.
- If a number has an **odd** number of divisors, it ends up **ON**.
- Only **perfect squares** ($1, 4, 9, 16, ...$) have an odd number of divisors.

---

## 2. Alice Apple Tree Problem

Alice is at $(0,0)$ and there's an apple tree at every integer coordinate $(i, j)$. The number of apples on tree $(i, j)$ is $|i| + |j|$.
Alice wants to collect at least $M$ apples by choosing a square boundary centered at $(0,0)$ with side length $2 \cdot \text{unit}$.

**Formula**: Total apples in a square with radius $k$ is $12 \cdot k^3$.
We need to find minimum $k$ such that $12k^3 \ge M$.

---

## 3. Complexity Analysis

- **Toggle Switch**: $O(\sqrt{N})$ to find all perfect squares.
- **Alice Apple Tree**: $O(M^{1/3})$ as we iterate to find $k$.

---

## 4. Implementation

- [ToggleSwitch.java](./ToggleSwitch.java)

---

## 📝 Exam-Based MCQs

**1. In the Toggle Switch problem, what is the final state of switch $N$ if it's initially OFF?**

- A) Always ON
- B) Always OFF
- C) ON only if $N$ is a perfect square
- D) ON only if $N$ is a prime number
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**2. Why do perfect squares have an odd number of factors?**

- A) Because they are divisible by 2.
- B) Because their square root factor is not paired with a different distinct factor.
- C) Because they are always prime.
- D) All numbers have an odd number of factors.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. In the Alice Apple Tree problem, what is the perimeter of a square with side length $2 \times \text{unit}$?**

- A) $4 \times \text{unit}$
- B) $8 \times \text{unit}$
- C) $12 \times \text{unit}$
- D) $16 \times \text{unit}$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. If $N = 10$, how many switches will be ON in the Toggle Switch problem?**

- A) 10
- B) 5
- C) 3 (1, 4, 9)
- D) 4
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. The Alice Apple Tree problem is an example of:**

- A) Optimization / Greedy approach
- B) Backtracking
- C) Sorting
- D) Graph Traversal
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>
