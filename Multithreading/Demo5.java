// package Multithreading;
// Execution order -> Non-deterministic, it can change every time we run the program

// Thread scheduling is done by the OS, it can be preemptive or non-preemptive. In preemptive scheduling, the OS can interrupt a thread and switch to another thread. In non-preemptive scheduling, the OS will wait for the current thread to finish before switching to another thread.


public class Demo5 {
   public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 20; i++) {
                if(i % 2 == 0) {
                    System.out.println("Hello from Thread 1: " + i);
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for(int i = 0; i <= 20; i++) {
                if(i % 2 != 0) {
                    System.out.println("Hello from Thread 2: " + i);
                }
            }
        });
        t2.start();
   } 
}

 