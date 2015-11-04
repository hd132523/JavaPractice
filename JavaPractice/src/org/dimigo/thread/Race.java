package org.dimigo.thread;

public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		Thread t1 = new Runner("찬지니1");
		Thread t2 = new Runner("찬진잉2");
		
		//MAX_PRIORITY(10) , NORM_PRIORITY(5)
		//우선순위가 높은 스레드가 실행 기회를 더 많이 가진다
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}