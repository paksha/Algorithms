import java.util.LinkedList;
import java.util.Queue;

// Implementation of a Binary Tree in Java
class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}
}

public class BinaryTree {
	Node root; // this is the starting node of our tree, usually called root

	// need to be able to add to a tree
	private Node addRecursive(Node current, int value) {
		if (current == null) return new Node(value);
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current; // value already exists
		}
		return current;
	}

	// wrapper for adding to a binary tree
	public void add(int value) {
		root = addRecursive(root, value);
	}

	// need to be able to check if a binary tree contains a certain element
	private boolean containsNodeRecursive(Node current, int value) {
		if (current == null) return false;
		if (current.value == value) return true;
		return value < current.value ? containsNodeRecursive(current.left, value) :
									   containsNodeRecursive(current.right, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	// deleting a node from a binary tree
	public void deleteNode(int value) {
		root = deleteRecursive(root, value);
	}

	private Node deleteRecursive(Node current, int value) {
		if (current == null) return null;

		if (value == current.value) {
			// Case 1: No child
			if (current.left == null && current.right == null) {
				return null;
			}

			// Case 2: Only 1 child
			if (current.right == null) return current.left;
			if (current.left == null) return current.right;

			// Case 3: 2 Children
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}

		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}

		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}

	// Depth-First Search
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePreOrder(node.left);
			traversePreOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	// Breadth-First Search
	public void traverseLevelOrder() {
		if (root == null) return;

		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			Node node = nodes.remove();
			System.out.print(" " + node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right != null) {
				nodes.add(node.right);
			}
		}
	}
}






















