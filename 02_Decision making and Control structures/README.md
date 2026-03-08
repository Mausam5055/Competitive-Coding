# 🔀 Decision Making & Control Structures

## 1. Introduction

Control structures determine the flow of program execution based on conditions (Decision Making) or repetition (Loops).

---

## 2. Decision Making

### 2.1 If-Else Statement

Standard conditional branching.

```java
if (score >= 90) {
    System.out.println("Grade A");
} else if (score >= 80) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

### 2.2 Switch Case

Used when checking a variable against multiple constant values.
**Modern Java Switch (Java 12+):**

```java
String type = switch(day) {
    case 1, 7 -> "Weekend";
    default -> "Weekday";
};
```

---

## 3. Loops (Iteration)

### 3.1 For Loop

Best when the number of iterations is known fixed.

```java
for (int i = 0; i < n; i++) {
    // Code
}
```

### 3.2 While Loop

Best when the number of iterations is unknown (runs while condition is true).

```java
while (n > 0) {
    n = n / 10;
}
```

### 3.3 Do-While Loop

Guarantees execution at least once.

```java
do {
    // This runs once even if condition is false
} while (condition);
```

---

## 4. Jump Statements

- **`break`**: Exits the loop/switch immediately.
- **`continue`**: Skips the current iteration and jumps to the next one.
- **`return`**: Exits the method.

---

## 5. Next Level Concepts

- **Enhanced For Loop (For-Each)**: Used for iterating Arrays/Collections.
  ```java
  int[] nums = {1, 2, 3};
  for(int x : nums) System.out.println(x);
  ```
- **Labeled Loops**: Breaking out of nested loops.
  ```java
  outerLoop:
  for(int i=0; i<5; i++) {
      for(int j=0; j<5; j++) {
           if(condition) break outerLoop;
      }
  }
  ```

---

## 📝 Exam-Based MCQs

**1. Which loop is guaranteed to execute at least once?**
A) `for` loop
B) `while` loop
C) `do-while` loop
D) None of the above
**Correct Answer: C**

**2. What does the `break` statement do?**
A) Stops the current iteration and starts the next one.
B) Exits the entire loop or switch block.
C) Exits the entire program.
D) Jumps to a specific label.
**Correct Answer: B**

**3. Which statement is used to skip the current iteration of a loop?**
A) `break`
B) `return`
C) `continue`
D) `exit`
**Correct Answer: C**

**4. In a `switch` statement, what happens if a `break` is missing?**
A) Compile-time error
B) Execution stops at the end of the case
C) Execution "falls through" to the next case
D) The default case is executed immediately
**Correct Answer: C**

**5. Which of the following is the correct syntax for an enhanced `for` loop to iterate over an array `arr`?**
A) `for (int i=0; i<arr.length; i++)`
B) `for (int x : arr)`
C) `for (x in arr)`
D) `foreach (int x : arr)`
**Correct Answer: B**
