package tasks1xx.task100

/*
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false*/

object Main extends App {

    class TreeNode(var _value: Int) {
        var value: Int = _value
        var left: TreeNode = null
        var right: TreeNode = null
    }


    object Solution {
        def isSameTree(p: TreeNode, q: TreeNode): Boolean = {

            if (p == null && q == null) return true

            if (p == null || q == null) return false

            if (p.value != q.value) return false

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)

        }
    }

}
