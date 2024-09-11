package com.aki.leetcodes.Tree;

// LeetCode : 110
public class BalancedBinaryTree {

    // Time Complexity : O(n)
    // Space Complexity : O(h)
    // Can't achieve the goal perfectly.
    public static boolean isBalancedMayIgnoreTheCaseSubtreeUnbalanced(TreeNode root) {

        if(root == null) return true ;

        int leftDepth = getMaxDepth(root.left) ;
        int rightDepth = getMaxDepth(root.right) ;

        return Math.abs(leftDepth - rightDepth) <= 1 ;
    }

    // Time Complexity : O(n ^ 2)
    // Space Complexity : O(h)
    public static boolean isBalanced(TreeNode root) {

        if(root == null) return true ;

        int leftDepth = getMaxDepth(root.left) ;
        int rightDepth = getMaxDepth(root.right) ;

        // Pre-return false when the diff of tree height is over 1
        if(Math.abs(leftDepth - rightDepth) > 1) return false ;

        // Check subtree via recursion
        return isBalanced(root.left) && isBalanced(root.right) ;
    }

    // This method will iterate all nodes in tree and calculate the height of tree
    private static int getMaxDepth(TreeNode root) {

        if(root == null) return 0 ;

        int leftIteratedDepth = getMaxDepth(root.left) ;
        int rightIteratedDepth = getMaxDepth(root.right) ;

        return Math.max(leftIteratedDepth, rightIteratedDepth) + 1 ;
    }

    // Time Complexity : O(n)
    // Space Complexity : O(h)
    public static boolean isBalancedOptimized(TreeNode root) {

        return checkBalance(root) != -1 ;
    }

    private static int checkBalance(TreeNode node) {

        if(node == null) return 0 ;

        int leftIteratedDepth = checkBalance(node.left) ;
        // If left subtree unbalanced itself, pre-return -1 to end iteration.
        if(leftIteratedDepth == -1) return -1 ;

        int rightIteratedDepth = checkBalance(node.right) ;
        if(rightIteratedDepth == -1) return -1 ;

        // Reduce the iteration of tree
        if(Math.abs(leftIteratedDepth - rightIteratedDepth) > 1) return -1 ;

        return Math.max(leftIteratedDepth, rightIteratedDepth) + 1 ;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
        System.out.println(isBalancedOptimized(root));


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);
        System.out.println(isBalanced(root2));
        System.out.println(isBalancedOptimized(root2));
    }
}
