package org.example;

public class Main {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        if (root.right != null) invertTree(root.right);
        if (root.left != null) invertTree(root.left);
        return root;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}