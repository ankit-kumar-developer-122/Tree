/**
 * Problem: Size of Binary Tree
 * Link: https://www.geeksforgeeks.org/problems/size-of-binary-tree/1
 * * Description:
 * Given the root of a binary tree, return the size of the tree. 
 * The size of a binary tree is the total number of nodes in the tree.
 * * Examples:
 * 1. Input: 1 -> 2, 3 | Output: 3
 * 2. Input: 5 -> 1, 6; 1 -> 3; 6 -> 7, 4 | Output: 6
 */

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {
    
    /**
     * Solution Approach:
     * We use a recursive approach. The base case is when the current node is null, 
     * in which case the size is 0. Otherwise, the size of the tree rooted at the 
     * current node is 1 (the current node itself) + the size of the left subtree 
     * + the size of the right subtree.
     */
    public int getSize(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String[] args) {
        // Example 1 Construction
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Solution sol = new Solution();
        System.out.println("Size of the tree: " + sol.getSize(root)); // Output: 3
    }
}
