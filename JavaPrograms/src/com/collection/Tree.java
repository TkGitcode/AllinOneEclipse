package com.collection;

//private TreeNode root;

class TreeNode {
	int data;
	TreeNode right;
	TreeNode left;

	public TreeNode(int data) {
		this.data = data;
	}
}

class BinaryTree {

	public TreeNode createNewTreeNode(int value) {
		TreeNode insetRoot = new TreeNode(value);
		insetRoot.data = value;
		insetRoot.right = null;
		insetRoot.left = null;
		return insetRoot;

	}

	public TreeNode insert(TreeNode node, int value) {
		
		if (node == null) {
			return createNewTreeNode(value);
		}

		return node;

	}
}

//	public void insertNode(int value) {
//		TreeNode tn = new TreeNode(value);
//		if (root == null) {
//			root = tn;
//			System.out.println(root.data);
//		} else if (root.left == null) {
//
//			root.left = tn;
//			System.out.println(root.left.data);
//
//		} else if (root.right == null) {
//
//			root.right = tn;
//			System.out.println(root.right.data);
//		}
//	}
//
//	public void display() {
//		System.out.println(root.data);
//		System.out.println(root.right.data);
//		System.out.println(root.left.data);
//	}
//	}

public class Tree {

	public static void main(String[] args) {

		BinaryTree binarySearchTree = new BinaryTree();
		TreeNode root = null;
		binarySearchTree.insert(root, 600);

	}

}
