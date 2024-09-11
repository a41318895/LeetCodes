package com.aki.leetcodes.Tree;

// LeetCode : 100
public class SameTree {

    // Tree node structure and its value should be the same
    // Time Complexity : O(n)
    // Space Complexity : O(h)
    public static boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {

        if(treeNode1 == null && treeNode2 == null) return true ;    // Both nodes are null, trees are the same.

        // One node is null or values are different, trees are not the same.
        if(treeNode1 == null || treeNode2 == null || treeNode1.val != treeNode2.val) return false ;

        // Check both sides' subtree.
        return isSameTree(treeNode1.left, treeNode2.left) && isSameTree(treeNode1.right, treeNode2.right) ;
    }

    public static void main(String[] args) {

        TreeNode root1A = new TreeNode(1);
        root1A.left = new TreeNode(2);
        root1A.right = new TreeNode(3);

        TreeNode root1B = new TreeNode(1);
        root1B.left = new TreeNode(2);
        root1B.right = new TreeNode(3);
        System.out.println(isSameTree(root1A, root1B));


        TreeNode root2A = new TreeNode(1);
        root2A.left = new TreeNode(2);

        TreeNode root2B = new TreeNode(1);
        root2B.right = new TreeNode(2);
        System.out.println(isSameTree(root2A, root2B));


        TreeNode root3A = new TreeNode(1);
        root3A.left = new TreeNode(2);
        root3A.right = new TreeNode(1);

        TreeNode root3B = new TreeNode(1);
        root3B.left = new TreeNode(1);
        root3B.right = new TreeNode(2);
        System.out.println(isSameTree(root3A, root3B));
    }
}
