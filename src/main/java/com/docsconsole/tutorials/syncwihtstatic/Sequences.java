package com.docsconsole.tutorials.syncwihtstatic;

public class Sequences {

    public synchronized static void getSequences(int i) {
        int limit = i + 5;

        while (i < limit) {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println("Current Thread  " + currentThreadName + " Sequence: " + i);
            i = i + 1;
        }

    }

}
