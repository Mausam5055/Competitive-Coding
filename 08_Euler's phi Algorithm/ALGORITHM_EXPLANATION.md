# Euler's Totient Function - Complete Algorithm & Code Explanation

## Table of Contents

1. [Concept Overview](#concept-overview)
2. [Brute Force Algorithm](#brute-force-algorithm)
3. [Optimized Algorithm](#optimized-algorithm)
4. [Java Implementation Explained](#java-implementation-explained)
5. [Step-by-Step Examples](#step-by-step-examples)

---

## Concept Overview

### What is Euler's Totient Function?

**φ(n)** counts how many numbers from 1 to n are coprime with n (their GCD is 1).

**Example:** φ(6)

- Numbers 1 to 6: [1, 2, 3, 4, 5, 6]
- Check GCD with 6:
  - gcd(1,6) = 1 ✓ (coprime)
  - gcd(2,6) = 2 ✗
  - gcd(3,6) = 3 ✗
  - gcd(4,6) = 2 ✗
  - gcd(5,6) = 1 ✓ (coprime)
  - gcd(6,6) = 6 ✗
- **Result:** φ(6) = 2 (only 1 and 5 are coprime)

---

## Brute Force Algorithm

### Pseudocode

```
Algorithm: EulerTotientBruteForce(n)
Input: A positive integer n
Output: φ(n)

1. count ← 0
2. for i ← 1 to n do
3.     if gcd(i, n) = 1 then
4.         count ← count + 1
5.     end if
6. end for
7. return count
```

### Logic Explanation

#### **Step 1: Initialize counter**

```
count ← 0
```

- Start with count = 0
- This will store how many coprime numbers we find

#### **Step 2-6: Check each number**

```
for i ← 1 to n do
    if gcd(i, n) = 1 then
        count ← count + 1
```

**What happens:**

1. Loop through every number from 1 to n
2. For each number i, calculate gcd(i, n)
3. If GCD is 1, the numbers are coprime
4. Increment the counter

**Why it works:**

- By definition, two numbers are coprime if their GCD = 1
- We check ALL numbers from 1 to n
- Count how many pass the coprimality test

### Complexity Analysis

**Time Complexity: O(n log n)**

- Loop runs n times: **O(n)**
- Each GCD calculation: **O(log n)** (Euclidean algorithm)
- Total: **O(n × log n) = O(n log n)**

**Space Complexity: O(1)**

- Only uses a counter variable
- No arrays or extra storage

### When to Use

✅ Small values of n (n < 1000)
✅ Learning/understanding the concept
✅ When simplicity is more important than speed
❌ Large values of n (too slow)

---

## Optimized Algorithm

### Pseudocode

```
Algorithm: EulerTotientOptimized(n)
Input: A positive integer n
Output: φ(n) using Euler's product formula

1. result ← n
2. temp ← n
3. p ← 2
4. while p * p <= temp do
5.     if temp mod p = 0 then
6.         // Remove all occurrences of p
7.         while temp mod p = 0 do
8.             temp ← temp / p
9.         end while
10.        // Apply formula: result *= (1 - 1/p)
11.        result ← result - result / p
12.    end if
13.    p ← p + 1
14. end while
15. // If temp > 1, then it's a prime factor
16. if temp > 1 then
17.     result ← result - result / temp
18. end if
19. return result
```

### Logic Explanation (Line by Line)

#### **Lines 1-3: Initialize variables**

```
result ← n
temp ← n
p ← 2
```

- **result**: Stores φ(n), starts at n
- **temp**: Working copy of n (we'll modify this)
- **p**: Current prime candidate, starts at 2 (smallest prime)

**Why result starts at n?**

- The formula is: φ(n) = n × (1 - 1/p₁) × (1 - 1/p₂) × ...
- We multiply n by fractions, never divide
- Starting at n lets us subtract instead

#### **Line 4: Main loop condition**

```
while p * p <= temp do
```

**Why p² ≤ temp?**

- If n has a prime factor > √n, there can only be ONE such factor
- Example: n = 15 = 3 × 5
  - √15 ≈ 3.87
  - We check up to 3, find it's a factor
  - After removing 3, temp = 5
  - We handle 5 at the end (lines 16-18)

**Key insight:** If no factor found up to √n, then n itself is prime!

#### **Line 5: Check if p divides n**

```
if temp mod p = 0 then
```

- Use modulo (%) to check divisibility
- If temp % p == 0, then p is a prime factor
- **Important:** We only reach here if p is prime!
  - At p=2, we remove all factors of 2
  - At p=3, we remove all factors of 3
  - Composite numbers like 4,6,8 won't divide temp anymore

#### **Lines 7-9: Remove ALL occurrences of prime p**

```
while temp mod p = 0 do
    temp ← temp / p
end while
```

**Example:** n = 12 = 2² × 3

- At p=2:
  - temp = 12, 12 % 2 = 0 ✓ → temp = 6
  - temp = 6, 6 % 2 = 0 ✓ → temp = 3
  - temp = 3, 3 % 2 = 1 ✗ → exit loop
- Now temp = 3 (all 2's removed)

**Why remove all?**

- We only care about UNIQUE prime factors
- 12 = 2² × 3, but φ formula only needs primes: 2 and 3
- We don't care about the exponent (2²), just that 2 exists

#### **Line 11: Apply Euler's formula**

```
result ← result - result / p
```

**This is the MAGIC line!**

**Mathematical formula:**
φ(n) = n × (1 - 1/p)

**Algebraic transformation:**

```
n × (1 - 1/p)
= n × (p - 1)/p
= n - n/p
```

**Example:** p=2, result=12

```
result = result - result/p
result = 12 - 12/2
result = 12 - 6
result = 6
```

**Why integer division works:**

- We know p divides n (from line 5)
- So n/p is always a whole number
- Java's `/` does integer division automatically!

#### **Line 13: Move to next prime candidate**

```
p ← p + 1
```

- Try next number
- We check 2, 3, 4, 5, 6, ...
- BUT: Composite numbers won't pass the test (line 5)
- Only actual primes will divide temp

#### **Lines 16-18: Handle remaining prime**

```
if temp > 1 then
    result ← result - result / temp
end if
```

**Why needed?**

- If temp > 1 after the loop, temp IS a prime factor
- This prime is larger than √n
- Apply the formula one more time

**Example:** n = 15

- At p=2: 15 % 2 ≠ 0, skip
- At p=3: 15 % 3 = 0 ✓
  - temp = 15/3 = 5
  - result = 15 - 15/3 = 15 - 5 = 10
- p=4: 4² = 16 > 5, exit loop
- **temp = 5 > 1** ✓
  - result = 10 - 10/5 = 10 - 2 = 8
- **φ(15) = 8** ✓

### Complexity Analysis

**Time Complexity: O(√n)**

- Loop runs from 2 to √n
- Each iteration is O(log n) for divisions
- Total: **O(√n × log n) ≈ O(√n)**

**Space Complexity: O(1)**

- Only uses 3 variables

### When to Use

✅ Large values of n (n > 1000)
✅ Production code / competitive programming
✅ When performance matters
✅ RSA cryptography (n can be huge!)

---

## Java Implementation Explained

### 1. GCD Function (Euclidean Algorithm)

```java
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
```

#### How Euclidean Algorithm Works

**Principle:** gcd(a, b) = gcd(b, a % b)

**Example: gcd(48, 18)**

```
gcd(48, 18)
  = gcd(18, 48 % 18)
  = gcd(18, 12)
  = gcd(12, 18 % 12)
  = gcd(12, 6)
  = gcd(6, 12 % 6)
  = gcd(6, 0)
  = 6  ← Base case (b == 0)
```

**Code Execution:**

```
Call 1: gcd(48, 18) → b ≠ 0 → return gcd(18, 12)
Call 2: gcd(18, 12) → b ≠ 0 → return gcd(12, 6)
Call 3: gcd(12, 6)  → b ≠ 0 → return gcd(6, 0)
Call 4: gcd(6, 0)   → b == 0 → return 6
```

**Why it works:**

- Any divisor of a and b also divides (a % b)
- Recursion reduces the problem size
- Eventually b becomes 0
- At that point, a is the GCD

### 2. Brute Force Java Implementation

```java
public static int phiBruteForce(int n) {
    int count = 0;

    // Check each number from 1 to n
    for (int i = 1; i <= n; i++) {
        if (gcd(i, n) == 1) {
            count++;
        }
    }

    return count;
}
```

#### Line-by-Line Execution for n=6

```java
int count = 0;  // count = 0
```

**Loop iterations:**

```
i=1: gcd(1,6) = 1 → 1 == 1 ✓ → count = 1
i=2: gcd(2,6) = 2 → 2 == 1 ✗ → count = 1
i=3: gcd(3,6) = 3 → 3 == 1 ✗ → count = 1
i=4: gcd(4,6) = 2 → 2 == 1 ✗ → count = 1
i=5: gcd(5,6) = 1 → 1 == 1 ✓ → count = 2
i=6: gcd(6,6) = 6 → 6 == 1 ✗ → count = 2
```

**Return:** count = 2 → φ(6) = 2 ✓

### 3. Optimized Java Implementation

```java
public static int phiOptimized(int n) {
    int result = n;  // Initialize result as n

    // Consider all prime factors of n
    for (int p = 2; p * p <= n; p++) {

        // Check if p is a prime factor
        if (n % p == 0) {

            // Remove all occurrences of p
            while (n % p == 0) {
                n = n / p;
            }

            // Apply formula: φ(n) *= (1 - 1/p)
            // Equivalent to: result = result - result/p
            result = result - result / p;
        }
    }

    // If n is still greater than 1,
    // then it's a prime factor
    if (n > 1) {
        result = result - result / n;
    }

    return result;
}
```

#### Detailed Execution for n=12

**Initial state:**

```java
n = 12
result = 12
```

**Loop iteration p=2:**

```java
p = 2
2 * 2 = 4 <= 12 ✓ (continue loop)

12 % 2 == 0 ✓ (p=2 is a factor)

// Remove all 2's
while (12 % 2 == 0):  // 12 % 2 = 0 ✓
    n = 12 / 2 = 6
while (6 % 2 == 0):   // 6 % 2 = 0 ✓
    n = 6 / 2 = 3
while (3 % 2 == 0):   // 3 % 2 = 1 ✗ (exit loop)

// Now n = 3

// Apply formula
result = result - result / p
result = 12 - 12/2
result = 12 - 6
result = 6
```

**Loop iteration p=3:**

```java
p = 3
3 * 3 = 9 <= 3 ✗ (exit loop!)
```

**After loop:**

```java
n = 3 (still > 1)
if (3 > 1) ✓:
    result = result - result / n
    result = 6 - 6/3
    result = 6 - 2
    result = 4

return 4  → φ(12) = 4 ✓
```

**Verification:**

```
12 = 2² × 3
φ(12) = 12 × (1 - 1/2) × (1 - 1/3)
      = 12 × 1/2 × 2/3
      = 6 × 2/3
      = 4 ✓
```

---

## Step-by-Step Examples

### Example 1: φ(20) using Optimized Method

**Given:** n = 20 = 2² × 5

**Step 1: Initialize**

```
n = 20
result = 20
```

**Step 2: p = 2**

```
2² = 4 <= 20 ✓
20 % 2 = 0 ✓ (2 is a factor)

Remove all 2's:
  20 / 2 = 10
  10 / 2 = 5
  5 % 2 ≠ 0 (stop)
  n = 5

Apply formula:
  result = 20 - 20/2 = 20 - 10 = 10
```

**Step 3: p = 3**

```
3² = 9 > 5 ✗ (exit loop)
```

**Step 4: Check remaining**

```
n = 5 > 1 ✓ (5 is a prime factor)
result = 10 - 10/5 = 10 - 2 = 8
```

**Answer:** φ(20) = 8

**Coprime numbers:** {1, 3, 7, 9, 11, 13, 17, 19}

### Example 2: φ(11) - Prime Number

**Given:** n = 11 (prime)

**Step 1: Initialize**

```
n = 11
result = 11
```

**Step 2: Loop p = 2 to √11 ≈ 3.3**

```
p=2: 11 % 2 ≠ 0 (skip)
p=3: 11 % 3 ≠ 0 (skip)
p=4: 4² = 16 > 11 (exit loop)
```

**Step 3: Check remaining**

```
n = 11 > 1 ✓ (11 itself is prime)
result = 11 - 11/11 = 11 - 1 = 10
```

**Answer:** φ(11) = 10

**Why?** For any prime p: φ(p) = p - 1
(All numbers 1 to p-1 are coprime with p)

---

## Key Programming Concepts

### 1. Integer Division in Java

```java
result = result - result / p;
```

- **Java automatically uses integer division for `int / int`**
- Example: `12 / 2 = 6` (not 6.0)
- Example: `10 / 3 = 3` (not 3.333...)
- This is PERFECT for our formula!

### 2. Why `result - result/p` Works

```
Mathematical: n × (1 - 1/p)
Algebraic:    n × (p-1)/p = (n×p - n)/p = n - n/p
Java code:    result - result/p
```

**Example:**

```
n = 12, p = 2
Math:  12 × (1 - 1/2) = 12 × 0.5 = 6
Code:  12 - 12/2 = 12 - 6 = 6 ✓
```

### 3. Modulo Operator (%)

```java
if (n % p == 0)
```

- `n % p` gives remainder when n is divided by p
- If remainder is 0, p divides n perfectly
- Used to check if p is a factor

### 4. Recursion in GCD

```java
return gcd(b, a % b);
```

- Function calls itself with smaller values
- Eventually reaches base case (b == 0)
- Stack unwinds, returning the GCD

---

## Comparison Table

| Feature                | Brute Force        | Optimized           |
| ---------------------- | ------------------ | ------------------- |
| **Time Complexity**    | O(n log n)         | O(√n)               |
| **For n=1000**         | ~10,000 operations | ~32 operations      |
| **For n=1,000,000**    | ~20 million ops    | ~1,000 ops          |
| **Code Complexity**    | Simple             | Moderate            |
| **Best For**           | Learning, small n  | Production, large n |
| **Uses GCD**           | Yes                | No                  |
| **Uses Prime Factors** | No                 | Yes                 |

---

## Common Mistakes to Avoid

### ❌ Mistake 1: Not handling n > 1 after loop

```java
// WRONG - misses large prime factor
if (n > 1) {
    // FORGOT THIS PART!
}
```

### ❌ Mistake 2: Using `p <= n` instead of `p * p <= n`

```java
// WRONG - too slow!
for (int p = 2; p <= n; p++)

// CORRECT
for (int p = 2; p * p <= n; p++)
```

### ❌ Mistake 3: Not removing all occurrences

```java
// WRONG - only removes once
if (n % p == 0) {
    n = n / p;  // Only divides once!
}

// CORRECT - removes all
while (n % p == 0) {
    n = n / p;
}
```

---

## Summary

### Brute Force

- **Idea:** Check every number from 1 to n
- **Method:** Use GCD to test coprimality
- **Pros:** Simple, easy to understand
- **Cons:** Slow for large n

### Optimized

- **Idea:** Use Euler's product formula
- **Method:** Find prime factors, apply formula
- **Pros:** Very fast, O(√n)
- **Cons:** Slightly more complex logic

### Key Formula

```
φ(n) = n × ∏(1 - 1/p) for all prime p that divide n
     = n - n/p₁ - n/p₂ + corrections...
     ≈ implemented as: result -= result/p for each prime p
```

---

**Remember:** Both methods give the SAME answer, but optimized is much faster!
