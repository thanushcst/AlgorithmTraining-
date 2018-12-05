package com.techinnoveta.codility;

import java.util.Scanner;

public class Solution {

	Node root;

	boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean isBSTUtil(Node node, int min, int max) {

		if (node == null)
			return true;

		if (node.data < min || node.data > max)
			return false;

		return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
	}

	public static void main(String args[]) throws Exception {

		Scanner scanner = new Scanner(System.in);

		int item = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < item; i++) {
			int variable = Integer.parseInt(scanner.nextLine());
			String[] row = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	            Solution tree = new Solution();
	            tree.root = new Node(variable);
	            for (int j = 0; j < row.length; j++) {
					if(j == 0){
						tree.root.left = new Node(2);
					}
				}

		}

		/*Solution tree = new Solution();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

		if (tree.isBST())
			System.out.println("YES");
		else
			System.out.println("NO");*/
	}

}

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}
