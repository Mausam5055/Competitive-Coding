# 🎨 Graph Coloring Problem

## 1. Introduction

The **m-Coloring problem** asks whether the vertices of a given graph can be colored using at most $m$ colors such that no two adjacent vertices have the same color. The smallest number of colors needed to color a graph is called its **chromatic number**.

---

## 2. Approach / Algorithm

We use **Backtracking** to test all possible color assignments.

### Steps:

1.  Start from the first vertex.
2.  Try assigning colors from $1$ to $m$ to the current vertex.
3.  For each color, check if it's "safe" (no adjacent vertex has the same color).
4.  If safe, assign the color and recursively try to color the next vertex.
5.  If any color leads to a complete assignment, return true.
6.  If no color works, **Backtrack** (unmark the current vertex) and return false.

---

## 3. Complexity Analysis

- **Time Complexity**: $O(m^V)$ in the worst case (exploring all color combinations).
- **Space Complexity**: $O(V)$ for the color array and recursion stack.

---

## 4. Implementation

- [GraphColoring.java](./GraphColoring.java)

---

## 📝 Exam-Based MCQs

**1. What is the goal of the Graph Coloring problem?**

- A) To color all edges with different colors.
- B) To color all vertices such that no two adjacent vertices share the same color.
- C) To find the shortest path in a graph.
- D) To count the number of edges.
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**2. What is the minimum number of colors required to color a complete graph with $V$ vertices?**

- A) 1
- B) 2
- C) $V$
- D) $V-1$
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**3. The smallest number of colors needed to color a graph is called its:**

- A) Base number
- B) Chromatic number
- C) Vertex factor
- D) Degree
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: B</b>
</details>

**4. According to the Four Color Theorem, what is the maximum number of colors needed to color any planar graph?**

- A) 2
- B) 3
- C) 4
- D) 5
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>

**5. Which data structure is most useful for cycle detection in an undirected graph?**

- A) Queue
- B) Stack
- C) Disjoint Set Union (DSU)
- D) Priority Queue
<details>
<summary><b>Check Answer</b></summary>
<b>Correct Answer: C</b>
</details>
