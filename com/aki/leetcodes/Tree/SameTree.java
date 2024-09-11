package com.aki.leetcodes.Tree;

// LeetCode : 100
public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return false ;
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
