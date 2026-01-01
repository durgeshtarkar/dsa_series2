# Remove Duplicates from Sorted Array II

**Difficulty:** Medium

---

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, remove some duplicates **in-place** such that each unique element appears **at most twice**.

The **relative order** of the elements must be preserved.

Since it is impossible to change the length of the array in some languages, the final result must be placed in the **first part** of the array `nums`.

More formally:

* If there are `k` elements after removing duplicates, then the **first `k` elements** of `nums` should hold the final result.
* It does **not matter** what values remain beyond the first `k` elements.

Return `k`.

---

## Custom Judge

The judge will test your solution using the following logic:

```java
int[] nums = [...];
int[] expectedNums = [...];

int k = removeDuplicates(nums);

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

---

## Examples

### Example 1

**Input:**

```
nums = [1,1,1,2,2,3]
```

**Output:**

```
5, nums = [1,1,2,2,3,_]
```

**Explanation:**
Each element appears at most twice.
The function returns `k = 5`.

---

### Example 2

**Input:**

```
nums = [0,0,1,1,1,1,2,3,3]
```

**Output:**

```
7, nums = [0,0,1,1,2,3,3,_,_]
```

**Explanation:**
The function returns `k = 7`.
Extra elements beyond index `k` are irrelevant.

---

## Constraints

* `1 <= nums.length <= 3 * 10^4`
* `-10^4 <= nums[i] <= 10^4`
* `nums` is sorted in non-decreasing order

---

## Approach

Use the **two-pointer technique**:

* Maintain a pointer `k` that represents the position to place the next valid element.
* For each number in `nums`, allow insertion if:

  * `k < 2`, or
  * `nums[i] != nums[k - 2]`

This ensures that no element appears more than twice.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)` (in-place)

---

## Tags

* Array
* Two Pointers
* In-place
* Medium
