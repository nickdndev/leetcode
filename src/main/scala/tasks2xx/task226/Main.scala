package tasks2xx.task226

import scala.annotation.tailrec
import scala.collection.immutable.Queue

/*
226 Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off. */

object Main extends App {

    class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
        var value: Int = _value
        var left: TreeNode = _left
        var right: TreeNode = _right
    }

    def invertTree(root: TreeNode): TreeNode = {

        if (root == null) return root

        @tailrec
        def go(nodes: Queue[TreeNode]): Unit = {

            nodes.dequeueOption match {
                case None => //nothing
                case Some((node, queue)) =>
                    val temp = node.left
                    node.left = node.right
                    node.right = temp
                    go(queue.enqueueAll(List(Option(node.left), Option(node.right)).flatten))
            }
        }

        go(Queue.from(List(root)))

        root
    }


}
