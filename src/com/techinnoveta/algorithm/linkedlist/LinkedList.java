package com.techinnoveta.algorithm.linkedlist;

public class LinkedList {
	private static Node head;
	private static int numNodes;
	
	public LinkedList(Object dat)
	{
		head = new Node(dat);
	}
	
	public void addHead(Object data){
		Node temp = head;
		head = new Node(data);
		head.setNext(temp);
		numNodes++;
	}
	
	public void deleteAtIndex(int index){
		if(index <= 0){
			head = head.getNext();
		} else {
			Node temp = head;
			for (int i = 1; i < index && temp.getNext()!=null; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			numNodes--;
		}
	}
	
	public void addAtIndex(int index, Object data){
		Node temp = head;
		Node holder;
		if(index <= 0){
			head = new Node(data);
			head.setNext(temp);
		} else {
			for (int i = 1; i < index && temp.getNext()!=null; i++) {
				temp = temp.getNext();
			}
			holder = temp.getNext();
			temp.setNext(new Node(data));
			temp.getNext().setNext(holder);
		}
		numNodes++;

	}
	
	public void printList(){
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}


