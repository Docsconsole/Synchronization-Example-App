package com.docsconsole.tutorials.synchronizedkeyword;

public class ThreadExample implements Runnable {

	private SharableCounter sharableCounter;

	public ThreadExample(SharableCounter sharableCounter) {
		this.sharableCounter = sharableCounter;
	}

	@Override
	public void run() {
		this.sharableCounter.incrementCount();
	}
}