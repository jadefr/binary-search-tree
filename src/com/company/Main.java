package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(14);
        binarySearchTree.insert(16);

        binarySearchTree.inOrder();
        binarySearchTree.postOrder();
        binarySearchTree.preOrder();

    }
}
