/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> al = new ArrayList<Integer>();
        public void inOrder(TreeNode root)
        {
            if(root == null)
                return;
            inOrder(root.left);
            al.add(root.val);
            inOrder(root.right);
        }
    public boolean findTarget(TreeNode root, int k) {
       inOrder(root);
        int l = 0;
        int r = al.size()-1;
        while(l<r)
        {
            if(al.get(l)+al.get(r)==k)
                return true;
            else if(al.get(l)+al.get(r)<k)
                l++;
            else
                r--;
        }
        return false;

    }
}