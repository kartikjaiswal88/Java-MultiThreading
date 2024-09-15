//Creating thread using Thread Class
public class ThreadUsingThreadClass extends Thread{

    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello Speaking as New Thread from Thread Class::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
   
}
