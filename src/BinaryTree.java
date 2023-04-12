//Calculate the maximum Depth of a Binary Tree

public class BinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode (int val, TreeNode left){this.val=val; this.left = left;}
        TreeNode (int val, TreeNode left, TreeNode right){ this.val = val; this.left = left; this.right = right;}

    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.print(maxDepth(root));
    }

    public static int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
