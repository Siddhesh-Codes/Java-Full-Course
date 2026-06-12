// package Multithreading;

public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        });

        // t1.start() will create a new thread and execute the run() method in that thread
        t1.start();
        // t1.run(); // This will not create a new thread, it will run in the main thread
        // Output: Current Thread: main
    }
}



// Can we start a thread twice? -> No, it will throw IllegalThreadStateException
// Why? Because once a thread is started, it cannot be restarted. The thread goes through different states (New, Runnable, Running, Terminated) and once it reaches the Terminated state, it cannot be restarted.