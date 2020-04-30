package tasks1xx.task101

/*
Single Number


Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3


But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3*/

object Main extends App {

    class TreeNode(var _value: Int) {
        var value: Int = _value
        var left: TreeNode = null
        var right: TreeNode = null
    }

    def isSymmetric(root: TreeNode): Boolean = {


        def isSameTree(p: TreeNode, q: TreeNode): Boolean = {

            if (p == null && q == null) return true

            if (p == null || q == null) return false

            if (p.value != q.value) return false

            isSameTree(p.left, q.right) && isSameTree(p.right, q.left)

        }

        if(root==null) return true

        isSameTree(root.left, root.right)


    }
}
