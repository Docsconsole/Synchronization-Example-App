package com.docsconsole.tutorials.mainclient;

import com.docsconsole.tutorials.synchronizedkeyword.SharableCounter;
import com.docsconsole.tutorials.synchronizedkeyword.ThreadExample;

public class MainClient {
	public static void main (String[] args) { 
		SharableCounter counter = new SharableCounter(); 
		ThreadExample threadExample = new ThreadExample(counter);
        Thread thread =  new Thread(threadExample);
        thread.start();
        
        ThreadExample threadExample2 = new ThreadExample(counter);       
        Thread thread1 =  new Thread(threadExample2);
        thread1.start();
        
    } 
}
