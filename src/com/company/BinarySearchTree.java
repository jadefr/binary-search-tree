package com.company;

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node parent, int data) {
        if (parent == null) {
            parent = new Node(data);
        } else {
            if (data < parent.data) {
                parent.left = insert(parent.left, data);
            } else {
                parent.right = insert(parent.right, data);
            }
        }
        return parent;
    }

    public void inOrder() {
        System.out.print("inOrder::  ");
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void postOrder() {
        System.out.println("");
        System.out.print("postOrder::  ");
        postOrder(root);
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void preOrder() {
        System.out.println("");
        System.out.print("preOrder::  ");
        preOrder(root);
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
