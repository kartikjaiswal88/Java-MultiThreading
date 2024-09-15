
//Creating thread using Runnable Interface
public class ThreadUsingRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello Speaking as New Thread from Runnable Interface::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        //Running thread which is created using Runnable Interface
        ThreadUsingRunnable t1 = new ThreadUsingRunnable();
        Thread thread = new Thread(t1);
        thread.start();

        //Running Thread which is created using Thread Class
        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
        t2.start();

    }
}