package com.example.structs;

import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pQueue = new java.util.PriorityQueue<Integer>();
		
		pQueue.add(8);
		pQueue.add(3);
		pQueue.add(2);
		pQueue.add(7);
		pQueue.add(9);
		pQueue.add(11);
		pQueue.add(16);
		pQueue.add(5);
	
		System.out.println(pQueue);

		Queue<Character> cQueue = new java.util.PriorityQueue<Character>();
		cQueue.add('r');
		cQueue.add('w');
		cQueue.add('e');
		cQueue.add('d');
		cQueue.add('f');
		cQueue.add('a');
		System.out.println(cQueue);
		
		

	}

}
