package com.docsconsole.tutorials.syncblocksoninstance;

public class Sequences {

    public void getSequences(int i) {
        int limit = i + 5;
        synchronized (this) {
            while (i < limit) {
                String currentThreadName = Thread.currentThread().getName();
                System.out.println("Current Thread  " + currentThreadName + " Sequence: " + i);
                i = i + 1;
            }
        }
    }

}
