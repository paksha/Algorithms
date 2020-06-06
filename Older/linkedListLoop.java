import java.util.*;

public class LinkedList {
	struct Node head;

	// Linked List Node
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void push(int new_data) {
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}

	static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		Node curr = h;
		while (curr != null) {
			if (s.contains(curr)) return true;
			s.add(curr);
			curr = curr.next;
		}
		return false;
	}
}