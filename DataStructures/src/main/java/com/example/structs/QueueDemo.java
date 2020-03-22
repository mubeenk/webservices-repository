package com.example.structs;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	
	private ArrayDeque<Integer> queue = new ArrayDeque<>(10);
	
	public void foo() {
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		queue.add(110);
		queue.add(120);

		System.out.println(queue);

		while(!queue.isEmpty()) {
			System.out.println(queue.removeLast());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QueueDemo().foo();
	}

}
