# 📚 Basic I/O and Operators in Java

## 1. Introduction

Input and Output (I/O) are the fundamental operations of any program. In Competitive Programming, handling I/O efficiently is crucial. Operators allow us to manipulate data (variables) to perform calculations.

---

## 2. Input / Output

### 2.1 Output

- `System.out.print()`: Prints text without a newline.
- `System.out.println()`: Prints text with a newline.
- `System.out.printf()`: Formatted output (similar to C).
  - `%d`: Integer
  - `%f`: Float
  - `%s`: String
  - `%c`: Character

### 2.2 Input

We mainly use the `Scanner` class in `java.util` package.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();      // Read Integer
double d = sc.nextDouble(); // Read Double
String s = sc.next();       // Read Word
String line = sc.nextLine();// Read Line
```

> **Pro Tip**: For very large inputs (like in Competitive Programming), `Scanner` is slow. Use `BufferedReader`.

---

## 3. Operators

| Category          |            Operators             | Description                      |
| :---------------- | :------------------------------: | :------------------------------- | ------------------------------- | --------------------------- |
| **Arithmetic**    |     `+`, `-`, `*`, `/`, `%`      | Basic Math. `%` gives remainder. |
| **Relational**    | `==`, `!=`, `>`, `<`, `>=`, `<=` | Comparison. Returns boolean.     |
| **Valid Logical** |             `&&`, `              |                                  | `, `!`                          | Logic gates (AND, OR, NOT). |
| **Assignment**    |   `=`, `+=`, `-=`, `*=`, `/=`    | Assigns values.                  |
| **Unary**         |            `++`, `--`            | Increment/Decrement by 1.        |
| **Bitwise**       |              `&`, `              | `, `^`, `~`, `<<`, `>>`          | Manipulate bits directly. Fast! |

### Bitwise Deep Dive (Next Level)

- **AND (`&`)**: `1 & 1 = 1`, else 0.
- **OR (`|`)**: `0 | 0 = 0`, else 1.
- **XOR (`^`)**: Same bits = 0, Different bits = 1.
- **Left Shift (`<<`)**: `x << y` is `x * (2^y)`.
- **Right Shift (`>>`)**: `x >> y` is `x / (2^y)`.

---

## 4. Operator Precedence

(Order of evaluation, highest to lowest)

1. Postfix `expr++` `expr--`
2. Unary `++expr` `--expr` `~` `!`
3. Multiplicative `*` `/` `%`
4. Additive `+` `-`
5. Shift `<<` `>>`
6. Relational `<` `>` `<=` `>=`
7. Equality `==` `!=`
8. Bitwise AND `&`
9. Bitwise XOR `^`
10. Bitwise OR `|`
11. Logical AND `&&`
12. Logical OR `||`
13. Assignment `=` `+=` etc.
