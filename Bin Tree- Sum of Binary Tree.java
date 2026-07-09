/**
 * Problem: Sum of Binary Tree
 * Difficulty: Basic
 * * Solution:
 * The sum of nodes in a binary tree can be calculated recursively:
 * sum(node) = node.data + sum(node.left) + sum(node.right)
 * Base case: if node is null, return 0.
 */

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class SumOfBinaryTree {

    public static int sumBT(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumBT(root.left) + sumBT(root.right);
    }

    public static void main(String[] args) {
        // Example 1: [15, 10, 20, 8, 12, 16, 25]
        Node root1 = new Node(15);
        root1.left = new Node(10);
        root1.right = new Node(20);
        root1.left.left = new Node(8);
        root1.left.right = new Node(12);
        root1.right.left = new Node(16);
        root1.right.right = new Node(25);
        System.out.println("Sum of Example 1: " + sumBT(root1)); // Output: 106

        // Example 2: [1, 3, 2]
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        System.out.println("Sum of Example 2: " + sumBT(root2)); // Output: 6

        // Example 3: [1, 2, N, 4, N]
        Node root3 = new Node(1);
        root3.left = new Node(2);
        root3.left.left = new Node(4);
        System.out.println("Sum of Example 3: " + sumBT(root3)); // Output: 7
    }
}
