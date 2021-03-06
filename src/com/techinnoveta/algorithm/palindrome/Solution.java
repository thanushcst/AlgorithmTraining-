package com.techinnoveta.algorithm.palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	Queue<Character> q = new LinkedList<>();
	Stack<Character> stack = new Stack<Character>();

	List<String> list = new ArrayList<String>();
	
	private Character dequeueCharacter() {
		list.add("t");
		Collections.sort(list);
		for (String string : list) {
			
		}
		return q.remove();
	}

	private Character popCharacter() {
		return stack.pop();
	}

	private void enqueueCharacter(char c) {
		q.add(c);
	}

	private void pushCharacter(char c) {
		stack.add(c);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}