package tasks1xx.task104

/*
104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.*/

object Main extends App {

    class TreeNode(var _value: Int) {
        var value: Int = _value
        var left: TreeNode = null
        var right: TreeNode = null
    }


    def maxDepth(node: TreeNode): Int = {
        if (node == null) {
            0
        } else {
            val maxLeft = maxDepth(node.left)
            val maxRight = maxDepth(node.right)
            Math.max(maxLeft, maxRight) + 1
        }
    }
}
