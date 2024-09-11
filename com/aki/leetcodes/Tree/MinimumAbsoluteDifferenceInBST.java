package com.aki.leetcodes.Tree;

// LeetCode : 530
public class MinimumAbsoluteDifferenceInBST {

    public static int getMinimumDifference(TreeNode root) {
        return -1 ;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(getMinimumDifference(root));


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(48);
        root2.right.left = new TreeNode(12);
        root2.right.right = new TreeNode(49);
        System.out.println(getMinimumDifference(root2));
    }
}
