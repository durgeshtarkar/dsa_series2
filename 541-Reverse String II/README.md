# Reverse String II

**Difficulty:** Easy

---

## Problem Statement

Given a string `s` and an integer `k`, reverse the **first `k` characters for every `2k` characters** counting from the start of the string.

Rules:

* If there are **fewer than `k` characters** left, reverse **all of them**.
* If there are **at least `k` but fewer than `2k` characters** left, reverse the **first `k` characters** and leave the rest unchanged.

Return the resulting string.

---

## Examples

### Example 1

**Input:**

```
s = "abcdefg", k = 2
```

**Output:**

```
bacdfeg
```

---

### Example 2

**Input:**

```
s = "abcd", k = 2
```

**Output:**

```
bacd
```

---

## Approach

1. Convert the string to a character array for in-place modification.
2. Traverse the array in steps of `2k`.
3. For each segment:

   * Reverse characters from index `i` to `min(i + k - 1, n - 1)`.
4. Convert the character array back to a string.

This directly follows the problem rules for each `2k` block.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` (character array)

---

## Tags

* String
* Two Pointers
* Simulation
* Easy
