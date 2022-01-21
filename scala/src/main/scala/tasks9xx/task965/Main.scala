package tasks9xx.task965

/*
965. Univalued Binary Tree

A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.



Example 1:


Input: [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: [2,2,2,5,2]
Output: false


Note:

The number of nodes in the given tree will be in the range [1, 100].
Each node's value will be an integer in the range [0, 99].*/

object Main extends App {


  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def isUnivalTree(root: TreeNode): Boolean = {
    if (root == null) return true

    val lf = if (root.left == null) true else root.left.value == root.value
    val rf = if (root.right == null) true else root.right.value == root.value


    lf && rf && isUnivalTree(root.left) && isUnivalTree(root.right)
  }
}
