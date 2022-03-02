# Definition for a binary tree node.
from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        inorder_nodes = []
        if root is None:
            return inorder_nodes

        def inorder(node: Optional[TreeNode]):

            if node is None:
                return

            inorder(node.left)
            inorder_nodes.append(node.val)
            inorder(node.right)

        inorder(root)

        return inorder_nodes


if __name__ == "__main__":
    node_1 = TreeNode(1)
    node_2 = TreeNode(2)
    node_3 = TreeNode(3)

    node_1.right = node_2
    node_2.left = node_3

    solution = Solution()
    print(solution.inorderTraversal(node_1) == [1, 3, 2])
    print(solution.isSubsequence("axc", "ahbgdc"))
