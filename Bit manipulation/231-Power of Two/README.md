# Power of Two

**Difficulty:** Easy

---

## Problem Statement

Given an integer `n`, return `true` if it is a **power of two**. Otherwise, return `false`.

An integer `n` is a power of two if there exists an integer `x` such that:

```
n == 2^x
```

---

## Examples

### Example 1

**Input:**

```
n = 1
```

**Output:**

```
true
```

**Explanation:**

```
2^0 = 1
```

---

### Example 2

**Input:**

```
n = 16
```

**Output:**

```
true
```

**Explanation:**

```
2^4 = 16
```

---

### Example 3

**Input:**

```
n = 3
```

**Output:**

```
false
```

---

## Constraints

* `-2^31 <= n <= 2^31 - 1`

---

## Approach

A number is a power of two if:

* It is greater than `0`
* It has **only one set bit** in its binary representation

We can use the bitwise trick:

```
n & (n - 1) == 0
```

This works because powers of two have exactly one `1` bit.

---

## Complexity Analysis

* **Time Complexity:** `O(1)`
* **Space Complexity:** `O(1)`

---

## Tags

* Bit Manipulation
* Math
* Easy
