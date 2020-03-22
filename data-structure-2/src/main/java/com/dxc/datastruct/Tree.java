package com.dxc.datastruct;

public class Tree {

	private Node root;
	
	private class Node{
		
		private int value;
		private Node leftChild;		
		private Node rightChild;
		
		public Node(int data) {
			this.value = data;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + "]" + "Left := " + leftChild;
		}
	}
	
	
	public void insert(int value) {
		
		Node node = new Node(value);
		
		// empty tree
		if(root == null) {
			root = node; 		
			return;
		}
		
		Node current = root;
		while(true) {
			
			if(value < current.value) {
				// go to left
				if(current.leftChild ==  null) {
					current.leftChild = node;
					break;
				}
				current = current.leftChild;
			}else {
				if(current.rightChild == null) {
					current.rightChild = node;
					break;
				}
				current = current.rightChild;
			}
		}
		System.out.println(current);
	}
	
	public boolean find(int value) {
		
		Node current = root;
		
		while(current != null) {
			if(value < current.value)
				current = current.leftChild;
			else if(value > current.value)
				current = current.rightChild;
			else if(value == current.value)
				return true;
		}
		return false;
	}
	
	public void traversePreOrder() {
		traversePreOrder(root);
	}

	public void traverseInOrder() {
		traverseInOrder(root);
	}

	public void traversePostOrder() {
		traversePostOrder(root);
	}

	private void traversePreOrder(Node node) {
	
		if(node == null)
			return;
		
		System.out.println(node.value);
		traversePreOrder(node.leftChild);
		traversePreOrder(node.rightChild);
		
	}

	private void traverseInOrder(Node node) {
		
		if(node == null)
			return;
		
		traverseInOrder(node.leftChild);
		System.out.println(node.value);
		traverseInOrder(node.rightChild);
		
	}

	private void traversePostOrder(Node node) {
		
		if(node == null)
			return;
		
		traverseInOrder(node.leftChild);
		traverseInOrder(node.rightChild);
		System.out.println(node.value);
		
	}
	
	  public int height() {
	    return height(root);
	  }

	  private int height(Node root) {
	    if (root == null)
	      return -1;

	    if (isLeaf(root))
	      return 0;

	    return 1 + Math.max(
	            height(root.leftChild),
	            height(root.rightChild));
	  }

	  private boolean isLeaf(Node node) {
		   if(node == null)
			   return false;
		    return (node.leftChild == null && node.rightChild == null);
	 }
	  
	  public int min() {
		  return min(root);
	  }
	  
	  // O(n)
	  private int min(Node root) {
		  
		if(root == null)
			return 9999;
		
	    if (isLeaf(root))
	      return root.value;

	    System.out.println("Root Value := " + root.value);
	    
	    int left = min(root.leftChild);
	    System.out.println("Left " + left);
	    
	    int right = min(root.rightChild);
	    System.out.println("Right " + right);

	    System.out.println(" Min " + left + "," + right + "," + root.value);
	    return Math.min(Math.min(left, right), root.value);
	  }
	
	// O(log n)
	  public int minBST() {
	    if (root == null)
	      throw new IllegalStateException();

	    Node current = root;
	    Node last = current;
	    while (current != null) {
	      last = current;
	      current = current.leftChild;
	    }
	    return last.value;
	  }
	  
	  public boolean equals(Tree other) {
		    if (other == null)
		      return false;

		    return equals(root, other.root);
	  }

	  private boolean equals(Node first, Node second) {
	    if (first == null && second == null)
	      return true;

	    if (first != null && second != null)
	      return first.value == second.value
	              && equals(first.leftChild, second.leftChild)
	              && equals(first.rightChild, second.rightChild);

	    return false;
	  }	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(6);
		tree.insert(14);
		tree.insert(3);
		tree.insert(8);
		tree.insert(24);		
		tree.insert(26);
		
		System.out.println(tree.find(8));
		
		System.out.println("PreOrder");
		tree.traversePreOrder();
		System.out.println("InOrder");
		tree.traverseInOrder();
		System.out.println("PostOrder");
		tree.traversePostOrder();
		
		System.out.println("Height " + tree.height());
		
		System.out.println("Min := " + tree.min());
		
		System.out.println("Min2 := " + tree.minBST());
		
		Tree tree2 = new Tree();
		tree2.insert(20);
		tree2.insert(10);
		tree2.insert(30);
		tree2.insert(6);
		tree2.insert(14);
		tree2.insert(3);
		tree2.insert(86);
		tree2.insert(24);		
		tree2.insert(26);
		
		System.out.println(tree.equals(tree2));
	}

}
