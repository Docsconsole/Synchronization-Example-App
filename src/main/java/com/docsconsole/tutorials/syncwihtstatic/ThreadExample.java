package com.docsconsole.tutorials.syncwihtstatic;

public class ThreadExample implements Runnable {

    private final Sequences seqWithStaticMethod;

    public ThreadExample(Sequences seqWithStaticMethod) {
        this.seqWithStaticMethod = seqWithStaticMethod;
    }

    @Override
    public void run() {
        Sequences.getSequences(5);
    }
}