package tasks1xx.task136

/*
Single Number


Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4*/

object Main extends App {
    def singleNumber(nums: Array[Int]): Int = {
        nums.fold(0)(_ ^ _)
    }

    assert(1 == singleNumber(Array(2, 2, 1)))
    assert(4 == singleNumber(Array(4, 1, 2, 1, 2)))
}
