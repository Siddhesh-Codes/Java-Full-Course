// package Multithreading;

// Using Thread class to create a thread
public class Demo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("Hello from main thread");
        }
        // main thread and MyThread are running concurrently
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello from MyThread");
        }
    }
}