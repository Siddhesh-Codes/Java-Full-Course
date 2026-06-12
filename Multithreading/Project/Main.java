// package Project;

public class Main {
   public static void main(String[] args) {
    Thread t1 = new Thread(new DownloadTask("file1.txt"));
    Thread t2 = new Thread(new DownloadTask("file2.txt"));
    Thread t3 = new Thread(new DownloadTask("file3.txt"));

    t1.start();
    t2.start();
    t3.start();

    // System.out.println("File-2 Downloaded 20%\n" +
    //             "File-1 Downloaded 20%\n" +
    //             "File-3 Downloaded 20%");

    // try {
    // t1.join(); // Wait for t1 to finish
    // t2.join(); // Wait for t2 to finish
    // t3.join(); // Wait for t3 to finish
    // } catch (InterruptedException e) {
    //     e.printStackTrace();   
    // }
    System.out.println("All files downloaded successfully!");
   } 
}

class DownloadTask implements Runnable {
    String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override 
    public void run() {
        System.out.println("Downloading file: " + fileName);

        for(int progress = 0; progress <= 100; progress += 20) {
            System.out.println(fileName + " Downloaded " + progress + "%");
            try {
                Thread.sleep(3000); // Simulate time taken to download a file
            } catch (InterruptedException e) {
                e.printStackTrace();        
            }
        }

        System.out.println("File " + fileName + " downloaded successfully!");
    }
}