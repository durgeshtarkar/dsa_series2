# Minimum Number Game

**Difficulty:** Easy

---

## Problem Statement

You are given a **0-indexed integer array** `nums` of **even length** and an empty array `arr`.

Alice and Bob play a game with the following rules:

1. In every round:

   * Alice removes the **minimum element** from `nums`.
   * Bob then removes the **minimum element** from the remaining `nums`.
2. After removals:

   * Bob appends his removed element to `arr` **first**.
   * Alice appends her removed element to `arr` **next**.
3. The game continues until `nums` becomes empty.

Return the resulting array `arr`.

---

## Examples

### Example 1

**Input:**

```
nums = [5, 4, 2, 3]
```

**Output:**

```
[3, 2, 5, 4]
```

**Explanation:**

* Round 1:

  * Alice removes `2`, Bob removes `3`
  * `arr = [3, 2]`
* Round 2:

  * Alice removes `4`, Bob removes `5`
  * `arr = [3, 2, 5, 4]`

---

### Example 2

**Input:**

```
nums = [2, 5]
```

**Output:**

```
[5, 2]
```

---

## Constraints

* `2 <= nums.length <= 100`
* `1 <= nums[i] <= 100`
* `nums.length` is even

---

## Approach

1. Sort the array `nums` in ascending order.
2. Traverse the sorted array in pairs.
3. For each pair:

   * Append the **second element** (Bob’s pick) first.
   * Append the **first element** (Alice’s pick) next.

Sorting ensures that the minimum elements are always chosen correctly.

---

## Complexity Analysis

* **Time Complexity:** `O(n log n)`
* **Space Complexity:** `O(n)` (for the result array)

---

## Tags

* Array
* Sorting
* Simulation
* Easy
