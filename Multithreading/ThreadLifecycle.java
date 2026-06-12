public class ThreadLifecycle {
    public static void main(String[] args) {
        // Thread new Stage -> Runnable Stage -> Running Stage -> Terminated Stage

        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            System.out.println("Name of the Current Thread: " + Thread.currentThread().getName());
            System.out.println("State of Main Thread : " + mainThread.getState());
        });
        // State of Thread t1: NEW
        System.out.println("State of Thread t1: " + t1.getState());

        t1.start();
        
        // State of Thread t1: RUNNABLE or TERMINATED (non-deterministic)
        System.out.println("State of Thread t1: " + t1.getState());


        // We can use Thread.sleep() to simulate a long-running task and check the state of the thread       
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }

        System.out.println("State of Thread t1: " + t1.getState());        



    //     Thread t1 = new Thread(() -> {
    //         // flow of the thread execution -> first it will print NEW, then it will print RUNNABLE, then it will print TIMED_WAITING (when it is sleeping) and finally it will print TERMINATED (after it finishes execution)
    //         System.out.println("Before Sleep: " + Thread.currentThread().getState());
    //         try {    
    //             Thread.sleep(3000); // Sleep for 3 seconds
                
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //         System.out.println("After Sleep: " + Thread.currentThread().getState());
    //     });
        
    //     System.out.println("State of Thread t1:" +t1.getState());   
        
    //     t1.start(); 

    //     // State of Thread t1: RUNNABLE or TERMINATED (non-deterministic)
    //     try {
    //         Thread.sleep(2000); // Sleep for 1 second to ensure t1 is in the sleep state
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    //     System.out.println("State of Thread t1:" +t1.getState()); // TIMED_WAITING (when it is sleeping) or TERMINATED (after it finishes execution) (non-deterministic)
    }
}
