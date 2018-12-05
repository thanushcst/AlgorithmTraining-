package com.techinnoveta.algorithm.linkedlist;

public class LinkedListImpl {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList(10);
		linkedList.addHead(20);
		System.out.println("List");
		linkedList.printList();
		linkedList.addHead(39);
		System.out.println("List");
		linkedList.printList();
		linkedList.addHead(67);
		System.out.println("List");
		linkedList.printList();
		linkedList.deleteAtIndex(2);
		System.out.println("List");
		linkedList.printList();
		linkedList.addAtIndex(0, 293);
		System.out.println("List");
		linkedList.printList();
		linkedList.addAtIndex(3, 13);
		System.out.println("List");
		linkedList.printList();
		
	}
	
}


