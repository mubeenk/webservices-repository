package com.dxc.threads;

public class HowManyThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.activeCount());
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++) {
			Thread thread = new Thread(new MyThread());
			thread.start();
				//thread.join();
	
		}
		
	}

}
