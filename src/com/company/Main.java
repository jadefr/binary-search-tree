package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(8);
        binarySearchTree.insert(7);
        binarySearchTree.insert(20);
        binarySearchTree.insert(18);
        binarySearchTree.insert(17);
        binarySearchTree.insert(11);

        binarySearchTree.inOrder();
    }
}
