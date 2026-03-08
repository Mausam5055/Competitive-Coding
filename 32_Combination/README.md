# 🔢 Combinations (nCr)

## 1. Introduction

A **Combination** is a selection of items from a larger set where the order of selection does **not** matter. The number of combinations of $n$ items taken $r$ at a time is denoted as $nCr$.

### Formula:

$$nCr = \frac{n!}{r! \cdot (n-r)!}$$

---

## 2. Approach / Algorithm

### Factorial Method (Not recommended for large N)

Calculate $n!$, $r!$, and $(n-r)!$ separately and apply the formula. This leads to integer overflow very quickly.

### Iterative Method (Efficient)

We can simplify $nCr$ to:
$$nCr = \frac{n \times (n-1) \times \dots \times (n-r+1)}{1 \times 2 \times \dots \times r}$$
This allows us to multiply and divide in steps, keeping the intermediate values smaller.

### Dynamic Programming (Pascal's Identity)

$$nCr = (n-1)C(r-1) + (n-1)Cr$$
This is used to build **Pascal's Triangle**.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(r)$ for the iterative approach or $O(n^2)$ for Pascal's triangle.
- **Space Complexity**: $O(1)$ for iterative or $O(n^2)$ for DP.

---

## 4. Implementation

- [Combination.java](./Combination.java)

---

## 📝 Exam-Based MCQs

**1. What is the value of 5C2?**

- A) 10
- B) 20
- C) 5
- D) 120
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A ($5 \times 4 / 2 = 10$)</b>
</details>

**2. Which of the following is true?**

- A) $nCr = nPr / r!$
- B) $nCr = nPr \times r!$
- C) $nCr = n! / r!$
- D) $nCr = r! / n!$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**3. What is the value of nC0 for any positive integer n?**

- A) 0
- B) 1
- C) n
- D) n!
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. The identity $nCr = nC(n-r)$ is useful when:**

- A) $r$ is very large.
- B) $n$ is prime.
- C) $r=0$.
- D) $n=r$.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: A</b>
</details>

**5. How many ways can you choose 3 fruits from a basket of 10?**

- A) 30
- B) 120
- C) 720
- D) 1000
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B (10C3 = $10 \times 9 \times 8 / (3 \times 2 \times 1) = 120$)</b>
</details>
