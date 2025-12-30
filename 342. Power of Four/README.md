# Power of Four

**Difficulty:** Easy

---

## Problem Statement

Given an integer `n`, return `true` if it is a **power of four**. Otherwise, return `false`.

An integer `n` is a power of four if there exists an integer `x` such that:

```
n == 4^x
```

---

## Examples

### Example 1

**Input:**

```
n = 16
```

**Output:**

```
true
```

---

### Example 2

**Input:**

```
n = 5
```

**Output:**

```
false
```

---

### Example 3

**Input:**

```
n = 1
```

**Output:**

```
true
```

---

## Constraints

* `-2^31 <= n <= 2^31 - 1`

---

## Approach

A number is a power of four if:

1. It is **greater than 0**
2. It is a **power of two** (only one set bit)
3. The set bit appears at an **even position** in binary representation

This can be checked using bit manipulation.

---

## Complexity Analysis

* **Time Complexity:** `O(1)`
* **Space Complexity:** `O(1)`

---

## Tags

* Math
* Bit Manipulation
* Easy
