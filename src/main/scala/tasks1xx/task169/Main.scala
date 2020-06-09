package tasks1xx.task169

import scala.math.Ordering

/*

169. Majority Element

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2*/

object Main extends App {

    def majorityElement(nums: Array[Int]): Int = {
        if (nums.length == 1) return nums(0)

        nums.sorted(Ordering.Int)(nums.length / 2)
    }

}
