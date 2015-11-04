package org.dimigo.thread;

public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");

		Thread t1 = new Thread(new Runner2("찬진1"));
		Thread t2 = new Thread(new Runner2("찬진2"));
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}