package com.collection;

import java.util.EmptyStackException;

public class Stack {

	private  ListNode top;
	private  int size;

	private  class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			//this.next = null;
		}
	}

	public Stack()
	{
		top =null;
		size=0;
	}
		public void push(int value) {
			ListNode pushList = new ListNode(value);
			pushList.next = top;
			top = pushList;
			size++;
		}
		public int pop()
		{
			if(size == 0)
			{
				 throw new  EmptyStackException();
			}
			else {
				int result=top.data;
				top=top.next;
				size--;
				return result;
			}
			
		}
		public int  size()
		{
			return size;
		}
		
		public void display()
		{
			ListNode disply=top;
			while(disply.next != null){
			System.out.print(disply.data);
			}
		}

	public static void main(String[] args) {

		
		Stack test=new Stack();
		test.push(85);
		test.push(98);
		System.out.println(test.size());
		System.out.println(test.pop());
		System.out.println(test.size());

	}

}
