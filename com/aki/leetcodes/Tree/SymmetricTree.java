package com.aki.leetcodes.Tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Stack;

// LeetCode : 101
public class SymmetricTree {

    // Tree node structure and its value should be symmetric
    public static boolean isSymmetric(TreeNode root) {

        if(root == null) return true ;  // haven't any node is also symmetric

        Stack<TreeNode> nodeComparisonStack = new Stack<>();
        nodeComparisonStack.push(root.left);
        nodeComparisonStack.push(root.right);

        while(!nodeComparisonStack.isEmpty()) {

            // If no node in stack to pop, it will pop out 'null'.
            TreeNode n1 = nodeComparisonStack.pop();
            TreeNode n2 = nodeComparisonStack.pop();
            if(n1 == null && n2 == null) continue ;     // Compared nodes are null, then switch to next team in stack

            if(n1 == null || n2 == null || n1.val != n2.val) return false ;

            nodeComparisonStack.push(n1.left) ;
            nodeComparisonStack.push(n2.right) ;
            nodeComparisonStack.push(n1.right) ;
            nodeComparisonStack.push(n2.left) ;
        }

        return true ;      // Every team of node are compared symmetrically.
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root2));
    }
}
