# ⭕ Hamiltonian Cycle

## 1. Introduction

A **Hamiltonian Path** is a path in an undirected or directed graph that visits each vertex exactly once. A **Hamiltonian Cycle** (or Hamiltonian Circuit) is a Hamiltonian Path that is a cycle (it returns to the starting vertex).

Finding whether such a cycle exists is an **NP-complete** problem.

---

## 2. Approach / Algorithm

We use **Backtracking** to find the Hamiltonian Cycle.

1.  Create an empty path array and add vertex 0 to it.
2.  Add other vertices one by one. Before adding a vertex:
    - Check if it is adjacent to the previously added vertex.
    - Check if it has already been added to the path.
3.  If a vertex satisfies the conditions, add it and recurse.
4.  If adding a vertex doesn't lead to a solution, **Backtrack** (remove it).
5.  If we have added all vertices, check if there's an edge from the last vertex back to the first vertex. If yes, the cycle is complete.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(N!)$ in the worst case (searching all permutations of vertices).
- **Space Complexity**: $O(N)$ to store the path and recursion stack.

---

## 4. Implementation

- [HamiltonianCycle.java](./HamiltonianCycle.java)

---

## 📝 Exam-Based MCQs

**1. What is the definition of a Hamiltonian Cycle?**

- A) A cycle that visits every edge exactly once.
- B) A cycle that visits every vertex exactly once.
- C) A path that visits every vertex twice.
- D) A tree that contains all vertices.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. Finding a Hamiltonian Cycle in a general graph is:**

- A) P-Complete
- B) NP-Complete
- C) Solvable in $O(N \log N)$
- D) Solvable in $O(N^2)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**3. What is the difference between an Eulerian Circuit and a Hamiltonian Circuit?**

- A) Eulerian visits every vertex; Hamiltonian visits every edge.
- B) Eulerian visits every edge; Hamiltonian visits every vertex.
- C) They are the same.
- D) Eulerian is NP-complete.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. In the backtracking solution, how do we handle the "cycle" requirement?**

- A) By checking if the graph is connected.
- B) By checking if there's an edge between the last and first vertex in the path.
- C) By visiting every edge.
- D) By using a priority queue.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the space complexity of the backtracking approach for $N$ vertices?**

- A) $O(1)$
- B) $O(N)$
- C) $O(N^2)$
- D) $O(2^N)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
