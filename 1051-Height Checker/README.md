# Height Checker

**Difficulty:** Easy

---

## Problem Statement

A school is trying to take an annual photo of all the students. Students must stand in a single file line in **non-decreasing order of height**.

Let this correct order be represented by an integer array `expected`, where `expected[i]` is the expected height of the `i`-th student.

You are given an integer array `heights` representing the **current order** of students.

Return the **number of indices** where `heights[i] != expected[i]`.

---

## Examples

### Example 1

**Input:**

```
heights = [1, 1, 4, 2, 1, 3]
```

**Output:**

```
3
```

**Explanation:**

```
heights:  [1, 1, 4, 2, 1, 3]
expected: [1, 1, 1, 2, 3, 4]
```

Indices `2`, `4`, and `5` do not match.

---

### Example 2

**Input:**

```
heights = [5, 1, 2, 3, 4]
```

**Output:**

```
5
```

**Explanation:**
All indices do not match the expected order.

---

### Example 3

**Input:**

```
heights = [1, 2, 3, 4, 5]
```

**Output:**

```
0
```

**Explanation:**
All indices already match the expected order.

---

## Constraints

* `1 <= heights.length <= 100`
* `1 <= heights[i] <= 100`

---

## Approach

1. Create a copy of the `heights` array.
2. Sort the copied array to get the `expected` order.
3. Compare both arrays index by index.
4. Count how many positions have different values.

---

## Complexity Analysis

* **Time Complexity:** `O(n log n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Sorting
* Easy
