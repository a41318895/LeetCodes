package com.aki.leetcodes.Tree;

import java.util.LinkedList;

// LeetCode : 226
public class InvertBinaryTree {

    public static TreeNode invertTreeUseBreadthFirstSearch(TreeNode root) {

        LinkedList<TreeNode> list = new LinkedList<>() ;    // To handle every node by layer

        if(root != null) list.add(root) ;

        // Until the list be empty (every left and right node was checked completely contains null)
        while(!list.isEmpty()){

            TreeNode tempRootNode = list.poll();    // The node handled

            // Add left and right nodes to list, waiting for checking and swapping next time.
            if(tempRootNode.left != null) list.add(tempRootNode.left);
            if(tempRootNode.right != null) list.add(tempRootNode.right);

            // Swapping
            TreeNode currentNode = tempRootNode.left;
            tempRootNode.left = tempRootNode.right;
            tempRootNode.right = currentNode;
        }

        return root;
    }

    public static TreeNode invertTreeUseDepthFirstSearch(TreeNode root) {

        if (root == null) return null ;

        // Swapping
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursion (Swap the nodes under left or right node many times until their left and right nodes are null)
        invertTreeUseDepthFirstSearch(root.left);
        invertTreeUseDepthFirstSearch(root.right);

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println(invertTreeUseBreadthFirstSearch(root));
        System.out.println(invertTreeUseDepthFirstSearch(root));

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);

        System.out.println(invertTreeUseBreadthFirstSearch(root2));
        System.out.println(invertTreeUseDepthFirstSearch(root2));


        TreeNode root3 = null ;
        System.out.println(invertTreeUseBreadthFirstSearch(root3));
        System.out.println(invertTreeUseDepthFirstSearch(root3));
    }
}
