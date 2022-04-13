package Algorithm;

import java.util.*;

public class LinkedListInsertionSort {

	node head;
	node sorted;

	class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}

		 void push(int val) {
			node newnode = new node(val);
			newnode.next = head;
			head = newnode;
		}

		void insertion(node headref) {
			sorted = null;
			node current = headref;
			while (current != null) {
				node next = current.next;
				sortInsertion(current);
				current = next;
			}
			head = sorted;
		}

		void sortInsertion(node newnode) {
			if ((sorted == null) || (sorted.val > newnode.val)) {
				newnode.next = sorted;
				sorted = newnode;
			} else {
				node current = sorted;
				while ((current.next != null) && (current.next.val < newnode.val)) {
					current = current.next;
				}
				newnode.next = current.next;
				current.next = newnode;
			}
		}

		void print(node head) {
			while (head != null) {
				System.out.println(head.val + " ");
				head = head.next;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		LinkedListInsertionSort l = new LinkedListInsertionSort();

		System.out.println("Enter A Element");
		int a = scanner.nextInt();
         
		System.out.println("Enter A Element");
	
		int b = scanner.nextInt();

		System.out.println("Enter A Element");
		int c = scanner.nextInt();

		System.out.println("Enter A Element");
		int d = scanner.nextInt();

		System.out.println("Enter A Element");
		int e = scanner.nextInt();

		System.out.println("Enter A Element");
		int f = scanner.nextInt();

	}

}
