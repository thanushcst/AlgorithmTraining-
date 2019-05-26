package com.techinnoveta.datastarcture;

public class LinkedListImpl {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(20);
		linkedList.insert(10);
		linkedList.insert(40);
		linkedList.insert(60);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		linkedList.read();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(">>>>>>>>>>>>>>>>>InseartAtHead>>>>>>>>>>>>>>>");
		linkedList.insertAtHead(75);
		linkedList.insertAtHead(175);
		linkedList.read();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(">>>>>>>>>>>>>>>>>InseartAt>>>>>>>>>>>>>>>");
		linkedList.insertAt(5, 275);
		linkedList.read();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(">>>>>>>>>>>>>>>>>Delete>>>>>>>>>>>>>>>");
		linkedList.delete(0);
		linkedList.read();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
}

class LinkedList {
	Node head;
	int ixdex;
	
	public void insert(Object data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	
	public void insertAtHead(Object data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		} else {
			Node current = head;
			node.next = current;
			head = node;
		}
	}
	
	public void insertAt(int index, Object data) {
		Node node = new Node(data);
		Node current = head;
		if(index == 0) {
			insertAtHead(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	
	public void delete(int index) {
		Node current = head;
		if(index == 0) {
			head = head.next;
		} else {
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
		
	}
	
	public void read() {
		Node current = head;
		while(current.next != null) {
			System.out.println(current.getData());
			current = current.next;
		}
		System.out.println(current.getData());
	}
}

class Node {
	Node next;
	Object data;
	
	Node(Object data) {
		this.data = data;
		this.next = null;
	}

	public Object getData() {
		return data;
	}
}