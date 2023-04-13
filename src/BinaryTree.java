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

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum Depth of Binary is: "+ maxDepth(root));

        // convert sorted arr to binary Tree
        int[] arr = {1,2,2,3,3,4,4};
        root = insertLevelOrder(arr,0);
        System.out.println(root);
        root = bst(arr);
        System.out.print("Inorder Traversal of binary Tree is: ");
        inorder(root);
    }

    //print inorder Traversal of binary Tree
    public static void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    //Calculate the maximum Depth of a Binary Tree
    public static int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    //convert array to binary tree
    public static TreeNode insertLevelOrder(int[] arr,int i){
        TreeNode root = null;
        if (i<arr.length){
            root = new TreeNode(arr[i]);
            root.left = insertLevelOrder(arr,2*i+1);
            root.right = insertLevelOrder(arr,2*i+2);
        }
        return root;
    }
    //Convert binary Search Tree from sorted Array
    public static TreeNode bst(int[] arr){
        return createBST(arr,0,arr.length-1);
    }
    public static TreeNode createBST(int[] arr, int l, int r){
        if (l>r) return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr,l,mid-1);
        root.right = createBST(arr,mid+1,r);
        return root;
    }
}
