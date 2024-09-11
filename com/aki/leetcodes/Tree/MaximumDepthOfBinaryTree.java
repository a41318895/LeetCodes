package com.aki.leetcodes.Tree;

// LeetCode : 104
public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {

        if(root == null) return 0 ;

        // Recurse left and right side
        int leftIteratedDepth = maxDepth(root.left) ;
        int rightIteratedDepth = maxDepth(root.right) ;

        // If left and right node are null, return 0 + 1
        // If one side is not null, return 1 + 1
        return Math.max(leftIteratedDepth, rightIteratedDepth) + 1 ;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));


        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println(maxDepth(root2));
    }
}
