package com.techinnoveta.hackerrank.binarynumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

class Solution {
	public static Node removeDuplicates(Node head) {
        Node start = head; 
        Node prev = null; 
        while (start != null){ 
            Node current = start.next; 
            while (current != null){ 
            	if (current.data == start.data) { 
            		start.next = start.next.next; 
                }
            	current = current.next; 
            }
            start = start.next;
        } 
        return head;
	}

	
	public static int getConsecutiveCount(int num) {
		List<Integer> binaryList = new ArrayList<Integer>();
		int bi = 0;
		while(num != 0){
			bi = num % 2;
			binaryList.add(bi);
			num = (num - bi) / 2;
		}
		int count = 0;
		int temp = 1;
		for (int i = 0; i < binaryList.size() - 1; i++) {
			if(binaryList.get(i) == binaryList.get(i + 1)) {
				temp ++;
			} else {
				temp = 1;
			}
			
			if(temp > count) {
				count = temp;
			}
		}
		return count;
	}


	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(getConsecutiveCount(n));
        scanner.close();

	}
}