# Find the XOR of Numbers Which Appear Twice

**Difficulty:** Easy

---

## Problem Statement

You are given an array `nums`, where **each number appears either once or twice**.

Return the **bitwise XOR** of all the numbers that appear **twice** in the array, or `0` if **no number appears twice**.

---

## Examples

### Example 1

**Input:**

```
nums = [1, 2, 1, 3]
```

**Output:**

```
1
```

**Explanation:**
The only number that appears twice is `1`.

---

### Example 2

**Input:**

```
nums = [1, 2, 3]
```

**Output:**

```
0
```

**Explanation:**
No number appears twice in the array.

---

### Example 3

**Input:**

```
nums = [1, 2, 2, 1]
```

**Output:**

```
3
```

**Explanation:**
Numbers `1` and `2` appear twice.
`1 XOR 2 = 3`

---

## Constraints

* `1 <= nums.length <= 50`
* `1 <= nums[i] <= 50`
* Each number appears **either once or twice**

---

## Approach

1. Use a frequency array or hash map to count occurrences of each number.
2. Identify numbers with frequency `2`.
3. Compute the XOR of all such numbers.
4. If no number appears twice, return `0`.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

## Tags

* Array
* Bit Manipulation
* Hash Map
* Easy
