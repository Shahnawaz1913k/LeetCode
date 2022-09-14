# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pseudoPalindromicPaths (self, root: Optional[TreeNode]) -> int:
        def dfs(node, cnt):
            if not node: return 0
            cnt ^= 1 << node.val
            res = dfs(node.left, cnt) + dfs(node.right, cnt)
            if node.left == node.right:
                if cnt & (cnt - 1) == 0:
                    res += 1
            return res
        return dfs(root, 0) 
            