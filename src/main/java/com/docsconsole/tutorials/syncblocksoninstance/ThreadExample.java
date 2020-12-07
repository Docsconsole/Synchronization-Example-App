package com.docsconsole.tutorials.syncblocksoninstance;

public class ThreadExample implements Runnable {

    private final Sequences sequences;

    public ThreadExample(Sequences sequences) {
        this.sequences = sequences;
    }

    @Override
    public void run() {
        sequences.getSequences(5);
    }
}