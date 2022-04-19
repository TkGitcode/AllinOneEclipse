package com.collection;

public class Singlelinkedlist {

	int count = 0;
	public static ListNode head;

	static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public void display() {
		ListNode current = head;
		System.out.print("[");
		while (current != null) {
			count++;
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.print("]");
	}

	public void insertEnd(int value) {
		ListNode EndNode = new ListNode(value);
		if (head == null) {
			head = EndNode;
			return;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = EndNode;
		}
	}

	// Inserting value into head position
	public void insertBegin(int value) {
		ListNode insertBegin = new ListNode(value);
		insertBegin.next = head;
		head = insertBegin;
	}

	// Normal Insertion
	public void insert(int value) {
		ListNode insertNew = new ListNode(value);
		if (head == null) {
			head = insertNew;
		} else {
			ListNode currentNode = head;
			while (null != currentNode.next) {
				currentNode = currentNode.next;
			}
			currentNode.next = insertNew;
		}
	}

	// Method for Insertion Given Position
	public void insertGivenPosition(int value, int position) {
		ListNode insertbypos = new ListNode(value);
		if (position == 1) {
			insertbypos.next = head;
			head = insertbypos;
		} else {
			ListNode previous = head;
			int countPosition = 1;
			while (countPosition < position - 1) {
				previous = previous.next;
				countPosition++;
			}
			ListNode currentpos = previous.next;
			previous.next = insertbypos;
			insertbypos.next = currentpos;

		}

	}

	// Delete First Value in Linked List
	public ListNode deletFirst() {
		if (head == null) {
			return head;
		} else {
			ListNode headNode = head;
			head = headNode.next;
			headNode = null;

			return headNode;
		}
	}

	// Finding a Size of Linked List
	public int size() {
		return count;
	}

	public static void main(String[] args) {

		Singlelinkedlist LinkedList = new Singlelinkedlist();

		// Insert Value
		LinkedList.insert(89);
		LinkedList.insert(90);
		LinkedList.insert(100);
		LinkedList.insert(200);
		LinkedList.insert(855);

		// Method to insert first
		LinkedList.insertBegin(40);

		// Insertion at End
		LinkedList.insertEnd(3566);

		// Insertion by Position
		LinkedList.insertGivenPosition(85, 3);

		// Delete head
		LinkedList.deletFirst();

		// Displaying
		LinkedList.display();

		// Size of LinkedList
		System.out.println();
		System.out.println("Size of Linked List " + LinkedList.size());

	}

}
