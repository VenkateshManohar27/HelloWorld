package com.vm;

public class SinglyLinkedList {
	private Node firstNode;
	private Node lastNode;

	public void add(String num) {
		Node n = new Node();
		n.setValue(num);
		if (firstNode == null) {
			firstNode = n;
		}
		if (lastNode != null) {
			lastNode.setNextNode(n);
		}
		lastNode = n;
	}

	public boolean find(String num) {
		boolean flag = false;
		Node current = firstNode;
		Node next = null;
		if (current == null) {
			System.out.println("List is empty");
			return flag;
		}
		do {
			if (num.equals(current.getValue())) {
				System.out.print("Element found :");
				System.out.println(current);
				flag = true;
				break;
			}
			next = current.getNextNode();
			current = next;

		} while (next != null);

		return flag;
	}

	public boolean remove(String num) {
		boolean flag = false;
		System.out.println("Element to be removed:" + num);
		// Node current = firstNode;
		Node prev = firstNode;
		Node next = firstNode;
		if (next == null) {
			System.out.println("List is empty");
			return flag;
		}
		do {
			if (num.equals(next.getValue())) {
				System.out.println("Element removed");
				System.out.println(next);
				flag = true;
				if (prev != null) {
					prev.setNextNode(next.getNextNode());
				}
				next = null;
				break;
			}
			prev = next;
			next = next.getNextNode();

		} while (next != null);
		return flag;
	}

	public void displayList() {
		Node n = firstNode;
		if (n == null) {
			System.out.println("List is empty");
			return;
		}

		Node current = firstNode;
		Node next = null;
		System.out.println("-------------------------------------------------------------------");
		do {
			System.out.print(current.getValue() + "|");
			next = current.getNextNode();
			current = next;
		} while (next != null);
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.displayList();
		for (int i = 0; i < 100; i++) {
			list.add(i + "");
		}
		list.displayList();
		for (int i = 100; i >= 0; i--) {
			list.find(i + "");
		}

		for (int i = 100; i >= 0; i--) {
			list.remove(i + "");
		}

		list.displayList();
	}

}

class Node {
	private Node nextNode;
	private String value;

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return "Value :" + getValue();
	}

}