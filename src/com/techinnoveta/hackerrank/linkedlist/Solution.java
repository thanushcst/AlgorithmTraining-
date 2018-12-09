package com.techinnoveta.hackerrank.linkedlist;

public class Solution {
	public static void main(String[] arg) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(30);
		linkedList.add(30);
		linkedList.add(30);
		linkedList.add(30);
		linkedList.add(30);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(12);

		linkedList.display();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
		
		linkedList.removeDupilicate();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		linkedList.display();

	}
}

class LinkedList {
	private Node node;
	private Node head;

	public LinkedList() {
		this.node = new Node();
	}

	public void add(int data) {
		if (this.head == null) {
			this.node.setData(data);
			this.node.setNext(null);
			this.head = this.node;
		} else {
			Node node = new Node(head, data);
			this.head = node;
		}
	}

	public void display() {
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println("");
	}

	public void remove() {
		while (this.head != null) {
			System.out.print(this.head + " ");
			this.head = this.head.getNext();
		}
	}
	
	public void removeDupilicate() {
		Node start = this.head;
		while (start != null && start.getNext() != null) {
			Node currentNode = start;
			while (currentNode.getNext() != null) {
				if(start.getData() == currentNode.getNext().getData()) {
					currentNode.setNext(currentNode.getNext().getNext());
				} else {
					currentNode = currentNode.getNext();
				}
			}		
			start = start.getNext();
		}
	}

}

class Node {
	private Node next;
	private int data;

	public Node() {
		this.next = null;
		this.data = 0;
	}

	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}