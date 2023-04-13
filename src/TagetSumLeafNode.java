public class TagetSumLeafNode {
    public static void main(String[] args){
        BinaryTree.TreeNode root = new BinaryTree.TreeNode(1);
        root.right = new BinaryTree.TreeNode(3);
        root.left = new BinaryTree.TreeNode(2);
        System.out.println(new TagetSumLeafNode().hasPathSum(root,0));
    }
    public boolean hasPathSum(BinaryTree.TreeNode root, int targetSum) {
        if (root == null) return false;
        return (path(root,0,targetSum));
    }

    public boolean path(BinaryTree.TreeNode root,int sum, int tar){
        if (root == null) return false;
        if (root.left == null && root.right == null) return (root.val + sum) ==  tar;
        else {
            boolean left = path(root.left,root.val+sum,tar);
            boolean right = path(root.right,root.val+sum,tar);
            return (left || right);
        }

    }
}
