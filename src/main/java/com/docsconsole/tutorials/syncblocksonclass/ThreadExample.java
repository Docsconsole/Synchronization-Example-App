package com.docsconsole.tutorials.syncblocksonclass;

import com.docsconsole.tutorials.syncblocksoninstance.Sequences;

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