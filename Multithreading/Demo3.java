// package Multithreading;

// Thread ID and Thread Name

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Main Thread ID: " + Thread.currentThread().getId());
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());


        Thread t1  = new Thread(() -> {
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });

        Thread t2  = new Thread(() -> {
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
    }    
}

