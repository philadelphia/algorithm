package com.zt.algorithm.tree;

import java.util.LinkedList;

public class Tree {

    /**
     * create a tree
     *
     * @param inputList
     * @return
     */
    public static TreeNode createTreeNode(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.isEmpty()) {
            return node;
        }
        Integer integer = inputList.removeFirst();
        if (integer != null) {
            node = new TreeNode(integer);
            node.leftChild = createTreeNode(inputList);
            node.rightChild = createTreeNode(inputList);
        }

        return node;
    }


    /**
     * 使用递归方式前序遍历二叉树
     *
     * @param treeNode
     */
    public static void preOrderTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        System.out.print(treeNode.node + "\t");
        preOrderTree(treeNode.leftChild);
        preOrderTree(treeNode.rightChild);
    }

    /**
     * 使用递归方式中序遍历二叉树
     *
     * @param treeNode
     */
    public static void inOrderTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        preOrderTree(treeNode.leftChild);
        System.out.print(treeNode.node + "\t");
        preOrderTree(treeNode.rightChild);

    }

    /**
     * 使用递归方式后序遍历二叉树
     *
     * @param treeNode
     */
    public static void postOrderTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        preOrderTree(treeNode.leftChild);
        preOrderTree(treeNode.rightChild);
        System.out.print(treeNode.node + "\t");
    }

    public static class TreeNode {
        int node;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int node) {
            this.node = node;
        }
    }
}
