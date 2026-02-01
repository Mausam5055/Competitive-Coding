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
