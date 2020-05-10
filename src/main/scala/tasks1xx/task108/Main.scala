package tasks1xx.task108

/*

108. Convert Sorted Array to Binary Search Tree

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5*/

object Main extends App {

    class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
        var value: Int = _value
        var left: TreeNode = _left
        var right: TreeNode = _right
    }


    object Solution {

        def sortedArrayToBST(nums: Array[Int]): TreeNode = {

            def constructBranch(leftIdx: Int, rightIdx: Int, nums: Array[Int]): TreeNode = {
                if (leftIdx > rightIdx)
                    return null

                val mid = (leftIdx + rightIdx) / 2

                val rootNode = new TreeNode(nums(mid))

                rootNode.left = constructBranch(leftIdx, mid - 1, nums)
                rootNode.right = constructBranch(mid + 1, rightIdx, nums)

                rootNode
            }

            constructBranch(0, nums.length - 1, nums)

        }
    }

}
