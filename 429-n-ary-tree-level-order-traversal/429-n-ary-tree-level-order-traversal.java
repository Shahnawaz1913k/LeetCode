/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        List<Node> nodeToTraverse = new ArrayList<>();
        nodeToTraverse.add(root);
        while(!nodeToTraverse.isEmpty()){
            List<Integer> resultList = new ArrayList<>();
            List<Node> nodeToTraverseNext = new ArrayList<>();
            for(Node node : nodeToTraverse)
            {
                resultList.add(node.val);
                for(Node child : node.children){
                if(child != null)
                    nodeToTraverseNext.add(child);
                }
            }
            result.add(resultList);
            nodeToTraverse = nodeToTraverseNext;
        }
        return result;
    }
}