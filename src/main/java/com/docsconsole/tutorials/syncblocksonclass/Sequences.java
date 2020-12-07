package com.docsconsole.tutorials.syncblocksonclass;

public class Sequences {

    public static void getSequences(int i) {
        int limit = i + 5;
        synchronized (Sequences.class) {
            while (i < limit) {
                String currentThreadName = Thread.currentThread().getName();
                System.out.println("Current Thread  " + currentThreadName + " Sequence: " + i);
                i = i + 1;
            }
        }

    }

}
