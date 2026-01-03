# Unique Number of Occurrences

**Difficulty:** Easy

---

## Problem Statement

Given an array of integers `arr`, return `true` if the **number of occurrences of each value** in the array is **unique**, otherwise return `false`.

---

## Examples

### Example 1

**Input:**

```
arr = [1, 2, 2, 1, 1, 3]
```

**Output:**

```
true
```

**Explanation:**

* `1` appears `3` times
* `2` appears `2` times
* `3` appears `1` time
  All occurrence counts are unique.

---

### Example 2

**Input:**

```
arr = [1, 2]
```

**Output:**

```
false
```

**Explanation:**
Both values appear once, so the occurrence counts are not unique.

---

### Example 3

**Input:**

```
arr = [-3, 0, 1, -3, 1, 1, 1, -3, 10, 0]
```

**Output:**

```
true
```

---

## Constraints

* `1 <= arr.length <= 1000`
* `-1000 <= arr[i] <= 1000`

---

## Approach

1. Use a **hash map** to count the frequency of each number in the array.
2. Store all frequencies in a **hash set**.
3. If any frequency already exists in the set, return `false`.
4. If all frequencies are unique, return `true`.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Hash Map
* Hash Set
* Easy
