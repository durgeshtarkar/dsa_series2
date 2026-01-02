# N-Repeated Element in Size 2N Array

**Difficulty:** Easy

---

## Problem Statement

You are given an integer array `nums` with the following properties:

* `nums.length == 2 * n`
* `nums` contains `n + 1` **unique elements`
* Exactly **one element** is repeated **n times**

Return the element that is repeated `n` times.

---

## Examples

### Example 1

**Input:**

```
nums = [1, 2, 3, 3]
```

**Output:**

```
3
```

---

### Example 2

**Input:**

```
nums = [2, 1, 2, 5, 3, 2]
```

**Output:**

```
2
```

---

### Example 3

**Input:**

```
nums = [5, 1, 5, 2, 5, 3, 5, 4]
```

**Output:**

```
5
```

---

## Constraints

* `2 <= n <= 5000`
* `nums.length == 2 * n`
* `0 <= nums[i] <= 10^4`
* `nums` contains `n + 1` unique elements and one of them is repeated exactly `n` times

---

## Approach

### Hash Set Method

1. Create a hash set to track seen elements.
2. Traverse the array:

   * If the current element already exists in the set, return it.
   * Otherwise, add it to the set.

Since only one element is repeated `n` times, the first duplicate found is the answer.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Hash Set
* Easy
