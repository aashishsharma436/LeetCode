Question Link: https://leetcode.com/problems/binary-tree-preorder-traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
        
    }
}
