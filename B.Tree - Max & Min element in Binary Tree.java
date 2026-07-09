/**
 * PROBLEM: Max and Min element in Binary Tree
 * * Given a Binary Tree, find the maximum and minimum elements in it.
 * * EXAMPLE:
 * Input:
 * 2
 * / \
 * 7   5
 * / \   \
 * 6   11  9
 * / \     /
 * 1  11   4
 * * Output: 
 * Max: 11
 * Min: 1
 * * APPROACH:
 * To find the max and min, we traverse the tree recursively. At each node,
 * we compare the current node's value with the max/min values returned by
 * the left and right subtrees.
 */

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeMinMax {

    // Function to find the maximum element
    public static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int res = root.data;
        int leftRes = findMax(root.left);
        int rightRes = findMax(root.right);

        if (leftRes > res) res = leftRes;
        if (rightRes > res) res = rightRes;

        return res;
    }

    // Function to find the minimum element
    public static int findMin(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        int res = root.data;
        int leftRes = findMin(root.left);
        int rightRes = findMin(root.right);

        if (leftRes < res) res = leftRes;
        if (rightRes < res) res = rightRes;

        return res;
    }

    public static void main(String[] args) {
        // Constructing the tree for the example
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);

        System.out.println("Maximum element: " + findMax(root));
        System.out.println("Minimum element: " + findMin(root));
    }
}
