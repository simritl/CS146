class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BST:
    def isValidBST(self, root):
        return self.isBST(root, float("-inf"), float("inf"))

    def isBST(self, root, min_val, max_val):
        if not root:
            return True

        if root.val <= min_val or root.val >= max_val:
            return False

        return self.isBST(root.left, min_val, root.val) and self.isBST(root.right, root.val, max_val)


root = TreeNode(1)
root.left = TreeNode(2)
root.left.left = TreeNode(3)
root.left.right = TreeNode(4)

root.right = TreeNode(8)
root.right.left = TreeNode(5)
root.right.right = TreeNode(6)

bst = BST()
print(bst.isValidBST(root))
