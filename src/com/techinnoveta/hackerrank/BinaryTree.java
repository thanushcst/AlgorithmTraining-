package com.techinnoveta.hackerrank;//Java implementation to find leaf count of a given Binary tree 


class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	static int count(Node node)  
    { 
		int count = 0;
        if (node == null) {
        	count = 0; 
        }
        if (node.left != null && node.right != null){
        	return count(node.left) + count(node.right); 
        }else {
        	count ++;
        }
        return count;
    } 
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

	/* Driver program to test above functions */
	public static void main(String args[]) {
		int[] data = new int[] { 1, 3, 1, -1, 3 };
		Node node = null;
		for (int i : data) {
			node=insert(node,i);
		}
		System.out.println(BinaryTree.count(node));
	}
}

// This code has been contributed by Mayank Jaiswal(mayank_24)
