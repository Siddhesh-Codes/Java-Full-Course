// package Multithreading;

// Using Runnable interface to create a thread
public class Demo2 {
    public static void main(String[] args) {
        
        // Using lambda expression to create a thread
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from main thread");
            }
        });
        t.start();

        MyThread t1 = new MyThread();
        t1.run(); // This will not create a new thread, it will run in the main thread
        
        // Thread t = new Thread(new MyThread());
        // t.start();
        // main thread and MyThread are running concurrently
        // for(int i = 0; i < 5; i++) {
        //     System.out.println("Hello from main thread");
        // }
    }
}

class MyThread implements Runnable {
    @Override 
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello from MyThread");
        }
    }
}


/* 
How it works internally:

t.start() --> JVM asks OS to create a new thread for execution --> Thread gets Stack and PC space --> Thread executes run()
method of MyThread class --> After run() method is executed, thread is terminated and resources are released. 

*/
