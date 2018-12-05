package com.techinnoveta.algorithm.linkedlist;

public class Node {
	private Node next;
	private Object data;

	public Node(Object d) {
		data = d;
	}

	public Object getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
