package tasks7xx.task700

import scala.annotation.tailrec

/* 700. Search in a Binary Search Tree

Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

For example,

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2
     / \
    1   3
In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.*/

object Main extends App {

    class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
        var value: Int = _value
        var left: TreeNode = _left
        var right: TreeNode = _right
    }

    object Solution {
        @tailrec
        def searchBST(root: TreeNode, `val`: Int): TreeNode = {
            if (root == null) return root

            if (root.value == `val`) root
            else if (root.value > `val`) searchBST(root.left, `val`)
            else searchBST(root.right, `val`)
        }
    }

    // assert(3 == numJewelsInStones("aA", "aAAbbbb"))

}
