# 🌳 Kruskal's Algorithm

## 1. Introduction

**Kruskal's Algorithm** is a greedy algorithm used to find the **Minimum Spanning Tree (MST)** for a connected weighted graph. A spanning tree is a subset of edges that connects all vertices without any cycles. The MST is the spanning tree with the minimum total edge weight.

---

## 2. Approach / Algorithm

### The Greedy Choice

Always pick the edge with the smallest weight that does not form a cycle with the edges already selected.

### Steps:

1.  **Sort** all edges in non-decreasing order of their weight.
2.  Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far.
3.  If a cycle is **not** formed, include this edge. Else, discard it.
4.  Repeat until there are $(V-1)$ edges in the spanning tree (where $V$ is the number of vertices).

### Cycle Detection

Efficiency is achieved using the **Disjoint Set Union (DSU)** data structure with _Path Compression_ and _Union by Rank_.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(E \log E)$ or $O(E \log V)$ (due to sorting edges).
- **Space Complexity**: $O(V + E)$ to store the graph and DSU subsets.

---

## 4. Implementation

- [KruskalsAlgorithm.java](./KruskalsAlgorithm.java)

---

## 📝 Exam-Based MCQs

**1. Kruskal's algorithm is based on which algorithmic strategy?**

- A) Dynamic Programming
- B) Greedy Method
- C) Backtracking
- D) Branch and Bound
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. What data structure is used in Kruskal's algorithm for grouping vertices and detecting cycles?**

- A) Stack
- B) Queue
- C) Disjoint Set Union (DSU)
- D) Hash Map
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. In a graph with $V$ vertices, how many edges will the Minimum Spanning Tree have?**

- A) $V$
- B) $V-1$
- C) $V+1$
- D) $E-1$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. What is the complexity of sorting $E$ edges in Kruskal's algorithm?**

- A) $O(E)$
- B) $O(E \log E)$
- C) $O(E^2)$
- D) $O(\log E)$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**5. What is the main difference between Prim's and Kruskal's algorithm?**

- A) Kruskal's is greedy, Prim's is not.
- B) Kruskal's adds edges, while Prim's grows a tree from a single vertex.
- C) They have different time complexities.
- D) Only Kruskal's works on weighted graphs.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>
