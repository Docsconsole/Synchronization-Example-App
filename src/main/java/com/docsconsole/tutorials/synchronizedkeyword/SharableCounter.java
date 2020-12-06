package com.docsconsole.tutorials.synchronizedkeyword;

public class SharableCounter {

	private int counter = 1;
	
	public int getCount() {

		String currentThreadName = Thread.currentThread().getName();		
		System.out.println("Current Thread  " + currentThreadName + " counter: " + counter);
		return counter;

	}

	public synchronized int incrementCount() {
		 
		while (counter < 6 ) {
			String currentThreadName = Thread.currentThread().getName();		
			System.out.println("Current Thread  " + currentThreadName + " counter: " + counter);
			counter++;			
		}
		return counter;
	}

}
