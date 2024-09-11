package com.aki.leetcodes.Tree;

// LeetCode : 543
public class DiameterOfBinaryTree {

    private int diameter = 0 ;

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Every iteration of left and right node, got the max depth and upgraded the diameter.
    public int diameterOfBinaryTree(TreeNode root) {

        maxDepth(root) ;

        return diameter ;
    }

    private int maxDepth(TreeNode node) {

        if (node == null) return 0 ;

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        // Update diameter when iterated left and right of one node = (the max len in this subtree)
        diameter = Math.max(diameter, leftDepth + rightDepth) ;

        return Math.max(leftDepth, rightDepth) + 1 ;
    }

    public static void main(String[] args) {

        DiameterOfBinaryTree solution = new DiameterOfBinaryTree() ;

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.diameterOfBinaryTree(root));

        // Create a new instance for avoiding affecting the result below. (Init diameter = 0)
        solution = new DiameterOfBinaryTree() ;

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        System.out.println(solution.diameterOfBinaryTree(root2));
    }
}
