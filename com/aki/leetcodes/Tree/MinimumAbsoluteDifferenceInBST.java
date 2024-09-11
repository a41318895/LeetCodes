package com.aki.leetcodes.Tree;

// LeetCode : 530
// Time Complexity : O(n)
// Space Complexity : O(h)
public class MinimumAbsoluteDifferenceInBST {

    private int minDiff = Integer.MAX_VALUE ;
    private Integer prevNodeValue = null ;

    public int getMinimumDifference(TreeNode root) {

        leftToRightTraversal(root);

        return minDiff ;
    }

    private void leftToRightTraversal(TreeNode node) {

        if(node == null) return ;   // Ignore comparing

        // Iterate left side first, because binary search tree's left node val always less than node,
        // and the right node val always bigger than node.
        leftToRightTraversal(node.left);

        if(prevNodeValue != null) {
            minDiff = Math.min(minDiff, node.val - prevNodeValue) ;
        }
        prevNodeValue = node.val ;  // Record the val (left -> middle -> right order)

        leftToRightTraversal(node.right);
    }

    public static void main(String[] args) {

        MinimumAbsoluteDifferenceInBST instance = new MinimumAbsoluteDifferenceInBST();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(instance.getMinimumDifference(root));


        instance = new MinimumAbsoluteDifferenceInBST() ;

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(48);
        root2.right.left = new TreeNode(12);
        root2.right.right = new TreeNode(49);
        System.out.println(instance.getMinimumDifference(root2));
    }
}
