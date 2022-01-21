package tasks0xx.task35

/*
35. Search Insert Position

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0*/

object Main extends App {

    def searchInsert(nums: Array[Int], target: Int): Int = {
        def bs(nums: Array[Int], l: Int, r: Int, target: Int): Int = {
            if (r >= l) {

                val mid = l + (r - l) / 2

                if (nums(mid) == target) {
                    return mid
                }

                if (nums(mid) > target) {
                    return bs(nums, l, mid - 1, target)

                } else {
                    return bs(nums, mid + 1, r, target)

                }
            }
            l
        }

        bs(nums, 0, nums.length - 1, target)
    }


    assert(2 == searchInsert(Array(1, 3, 5, 6), 5))
    assert(1 == searchInsert(Array(1, 3, 5, 6), 2))
    assert(4 == searchInsert(Array(1, 3, 5, 6), 7))
    assert(0 == searchInsert(Array(1, 3, 5, 6), 0))
}
