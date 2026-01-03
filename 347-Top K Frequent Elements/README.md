# Top K Frequent Elements

**Difficulty:** Medium

---

## Problem Statement

Given an integer array `nums` and an integer `k`, return the **`k` most frequent elements**.

You may return the answer in **any order**.

---

## Examples

### Example 1

**Input:**

```
nums = [1,1,1,2,2,3], k = 2
```

**Output:**

```
[1, 2]
```

---

### Example 2

**Input:**

```
nums = [1], k = 1
```

**Output:**

```
[1]
```

---

### Example 3

**Input:**

```
nums = [1,2,1,2,1,2,3,1,3,2], k = 2
```

**Output:**

```
[1, 2]
```

---

## Constraints

* `1 <= nums.length <= 10^5`
* `-10^4 <= nums[i] <= 10^4`
* `1 <= k <= number of unique elements`
* The answer is **guaranteed to be unique**

---

## Follow Up

Your algorithm’s time complexity must be **better than `O(n log n)`**, where `n` is the size of the array.

---

## Approach

### Bucket Sort (Optimal)

1. Count the frequency of each element using a hash map.
2. Create buckets where index represents frequency.
3. Place elements into buckets based on their frequencies.
4. Traverse buckets from high to low frequency and collect `k` elements.

This avoids sorting and achieves linear time complexity.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Hash Map
* Bucket Sort
* Heap
* Medium
