package com.docsconsole.tutorials.syncwithinstance;

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