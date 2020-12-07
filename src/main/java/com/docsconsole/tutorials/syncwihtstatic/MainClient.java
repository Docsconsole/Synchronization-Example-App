package com.docsconsole.tutorials.syncwihtstatic;

public class MainClient {
    public static void main(String[] args) {

        Sequences seqWithStaticMethod = new Sequences();
        ThreadExample threadExample = new ThreadExample(seqWithStaticMethod);
        Thread thread = new Thread(threadExample);
        thread.start();

        ThreadExample threadExample2 = new ThreadExample(seqWithStaticMethod);
        Thread thread1 = new Thread(threadExample2);
        thread1.start();

    }
}
