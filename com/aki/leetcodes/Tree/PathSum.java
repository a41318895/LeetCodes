package com.aki.leetcodes.Tree;

// LeetCode : 112
public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;     // There's no node-to-leaf path when root node is null.

        boolean leftChecking = false ;
        if (root.left != null) {
            leftChecking = hasPathSum(root.left, targetSum - root.val);
        }
        boolean rightChecking = false ;
        if (root.right != null) {
            rightChecking = hasPathSum(root.right, targetSum - root.val);
        }

        return (targetSum - root.val) == 0 || leftChecking || rightChecking ;
    }

    public static boolean hasPathSimplified(TreeNode root, int targetSum) {

        if (root == null) return false ;

        // To check the leaf node
        // The condition of pre-version method -> (targetSum - root.val) == 0,
        // actually is -> root.val == targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum ;
        }

        return hasPathSimplified(root.left, targetSum - root.val) ||
                hasPathSimplified(root.right, targetSum - root.val) ;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22 ;
        System.out.println(hasPathSum(root, targetSum));
        System.out.println(hasPathSimplified(root, targetSum));


        TreeNode root2 = new TreeNode(1) ;
        root2.left = new TreeNode(2) ;
        root2.right = new TreeNode(3) ;

        int targetSum2 = 5 ;
        System.out.println(hasPathSum(root2, targetSum2));
        System.out.println(hasPathSimplified(root2, targetSum2));


        TreeNode root3 = null ;
        int targetSum3 = 0 ;
        System.out.println(hasPathSum(root3, targetSum3));
        System.out.println(hasPathSimplified(root3, targetSum3));
    }
}
