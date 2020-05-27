package tasks1xx.task112

/*
112. Path Sum

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.*/

object Main extends App {

    class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
        var value: Int = _value
        var left: TreeNode = _left
        var right: TreeNode = _right
    }


    def hasPathSum(root: TreeNode, sum: Int): Boolean = {
        if (root == null) return false
        if (root.value == sum && (root.left == null && root.right == null)) return true

        hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
    }
}
