package tasks0xx.task1

import scala.annotation.tailrec
import scala.collection.mutable

/*
1. Two Sum


Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

object Main extends App {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {

        val hashMap = new mutable.HashMap[Int, Int]()

        for ((value, idx) <- nums.view.zipWithIndex) {
            if (hashMap.contains(value)) {
                return Array(hashMap(value), idx)
            } else {
                hashMap += (target - value -> idx)
            }
        }

        Array(0, 0)
    }

    def twoSumViaRec(nums: Array[Int], target: Int): Array[Int] = {
        @tailrec
        def go(nums: Array[Int], idx: Int, target: Int, hashMap: Map[Int, Int]): Array[Int] = {
            val value = nums(idx)

            if (idx >= nums.length) Array(0, 0)
            else if (hashMap.contains(value)) Array(hashMap(value), idx)
            else go(nums, idx + 1, target, hashMap + (target - value -> idx))
        }

        go(nums, 0, target, Map.empty)
    }


    assert(Array(0, 1).sameElements(twoSum(Array(2, 7, 11, 15), 9)))
    assert(Array(0, 1).sameElements(twoSumViaRec(Array(2, 7, 11, 15), 9)))
}
