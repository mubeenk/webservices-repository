package com.example.structs;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {

	private Node first=null;
	private Node last=null;
	
	// deleteFirst
	// deleteLast
	// contains
	// indexOf
	
	public Node addLast(int val) {
		
		Node tmp = new Node(val);		
		if(first == null) {
			first = last = tmp;			
		}else {
			last.next = tmp;
			last = tmp;
		}
		return tmp;	
	}
	
	public Node addFirst(int val) {
		
		Node node = new Node(val);
		if(first == null)
			first=last=node;
		else {
			node.next = first;
			first = node;
		}
		
		return node;		
	}
	
	public int indexOf(int val) {
		
		int loc=-1;
		Node node=null;
		if(first != null) {
			node = first;
			while(node.next != null) {
				//System.out.println(node.value);
				if(node.value == val)
					return loc;
				node = node.next;
				loc++;
			}
		}
		return loc;
	}

	public boolean contains(int val) {

		boolean flag = false;
		Node node=null;
		if(first != null) {
			node = first;
			while(node.next != null) {
				
				if(node.value == val)
					return true;
				node = node.next;				
			}
		}
		return flag;
		
	}
	
	public void removeFirst() {
	
		if(first == last)
			System.out.println("End of line reached");
		
		Node second = null;
		if(first!= null) {
			
			second = first.next;
			if(second != null) {
				first.next = null;
				first = second;
			}
			
		}else
			throw new NoSuchElementException();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		Node ptr = first;
		while(ptr.next != null) {
			buffer.append(ptr.value).append("->");
			ptr = ptr.next;
		}
		buffer.append(ptr.value);
		return buffer.toString(); 
	}

	public int size() {
		
		int size = -1;
		Node second= null;
		if(first == last)
			return 1;
		
		if(first!= null) {	
			size = 0;
			second = first;
			while(second.next != null) {
				size++;
				second = second.next;
			}
		}
		return size;
	}
	
	public int[] toArray() {
		
		int[] array = new int[size()+1];
		int index=0;
		Node second = first;
		
		while(second != null) {
			array[index++] = second.value;
			second=second.next;
		}
		
		return array;
	}
	
	public void reverse() {
		
		Node prevFirst = first;
		Node prevLast = last;
		
		if(first == null)
			throw new NoSuchElementException();
		
		if(first == last) {	// no need to reverse
			System.out.println("SINGLE element");
			return;
		}

		int count = 0;
		Node second=last;
		while(second != null) {			
			Node node = getPrevious(second);
			if(node != null) {
				System.out.println("reverse order element -->" + node.value);
				second.next = node;
			}
			
//			count++;
//			if(count > 4) break;
			
			if(node==first)
				node.next = null;
			second = node;
		}
		
		first = prevLast;
		last = prevFirst;
		
	}
	
	public void reverseFromMosh() {
		
		Node previous = first;
		Node current = first.next;
		
		last = first;
		last.next = null;
		
		while(current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		last = first;
		last.next = null;
		first = previous;
	}
	
	private Node getPrevious(Node node) {
		int count=0;
		Node current = first;
		while(current != null) {
			if(current.next == node)
				return current;
				
			current = current.next;
		}
		
		return null;
	}

	public int getKthElementFromLast(int k) {
	
		Node a = first;
		Node b = first;
		
		for(int i=0;i<k-1;i++) {
			b=b.next;
			if( b == null)
				throw new IllegalArgumentException();
		}
		
		while( b != last) {
			a = a.next;
			b = b.next;
		}
			
		System.out.println(a .value+ " <--> " + b.value);
		return a.value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.addLast(3);
		list.addLast(5);
		list.addLast(9);
		list.addLast(11);
		list.addFirst(444);
		
		int[] array = list.toArray();
		System.out.println( Arrays.toString(array));
		System.out.println(list.toString() + "::" + list.size());
		System.out.println(list.indexOf(11));
		//list.removeFirst();
		System.out.println(list.contains(9));
		//System.out.println(list.toString() + "::" + list.size());
		//list.removeFirst();
		//System.out.println(list.toString() + "::" + list.size());
		//list.removeFirst();
		//System.out.println(list.toString() + "::" + list.size());
		//list.removeFirst();
		//System.out.println(list.toString() + "::" + list.size());
		//list.removeFirst();
		
		// list.reverse();
		list.reverseFromMosh();
		int[] array2 = list.toArray();
		System.out.println("REVERSAL --> " +  Arrays.toString(array2));
		int kthElementValue = list.getKthElementFromLast(2);
		System.out.println("Kth Element = " + kthElementValue);
		
		
	}

	// Inner Class
	public class Node {

		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}	// inner class end
}
