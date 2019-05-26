package com.techinnoveta.datastarcture;

public class StackImpl {
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.show();
	}
}

class Stack {
	int initSize = 2;
	int stack[] = new int[initSize];
	int size = 0;
	int top;
	
	
	public void push(int data) {
		if(initSize == size) {
			expand();
		}
		stack[size] = data;
		size++;
		top++;
	}
	
	public void expand() {
		this.initSize = this.initSize * 2;
		int stackNew[] = new int[initSize];
		System.arraycopy(stack, 0, stackNew, 0, this.size);
		stack = stackNew;
	}
	
	public void peek() {
		System.out.println(stack[top - 1]);
		top--;
	}
	
	public void pop() {
		stack[top - 1] = 
		top--;
	}
	
	public void show() {
		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i] + " ");
		}
	}
}
