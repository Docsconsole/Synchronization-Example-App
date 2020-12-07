package com.docsconsole.tutorials.syncblocksonclass;

import com.docsconsole.tutorials.syncblocksoninstance.Sequences;

public class MainClient {
    public static void main(String[] args) {

        Sequences sequences = new Sequences();
        ThreadExample threadExample = new ThreadExample(sequences);
        Thread thread = new Thread(threadExample);
        thread.start();
        ThreadExample threadExample2 = new ThreadExample(sequences);
        Thread thread1 = new Thread(threadExample2);
        thread1.start();

    }
}
