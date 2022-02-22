package com.zt.algorithm;

import com.zt.algorithm.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // tree
        LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));
        Tree.TreeNode tree = Tree.createTreeNode(inputList);
        System.out.println("前序遍历：-----");
        Tree.preOrderTree(tree);
        System.out.println("\n中序遍历：-----");
        Tree.inOrderTree(tree);
        System.out.println("\n后序遍历：-----");
        Tree.postOrderTree(tree);
    }
}
