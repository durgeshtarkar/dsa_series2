# Count Elements With Maximum Frequency

**Difficulty:** Easy

---

## Problem Statement

You are given an array `nums` consisting of **positive integers**.

Return the **total frequencies of elements** in `nums` such that those elements all have the **maximum frequency**.

The **frequency** of an element is the number of times it appears in the array.

---

## Examples

### Example 1

**Input:**

```
nums = [1, 2, 2, 3, 1, 4]
```

**Output:**

```
4
```

**Explanation:**
The elements `1` and `2` both appear **2 times**, which is the maximum frequency in the array.
Total count = `2 + 2 = 4`

---

### Example 2

**Input:**

```
nums = [1, 2, 3, 4, 5]
```

**Output:**

```
5
```

**Explanation:**
All elements appear exactly **once**, which is the maximum frequency.
Total count = `5`

---

## Constraints

* `1 <= nums.length <= 100`
* `1 <= nums[i] <= 100`

---

## Approach

1. Count the frequency of each element using a hash map (or array).
2. Find the **maximum frequency** among all elements.
3. Add up the frequencies of all elements that have this maximum frequency.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Hash Map
* Counting
* Easy
