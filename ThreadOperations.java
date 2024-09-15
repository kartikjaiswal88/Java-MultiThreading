class UserThread extends Thread{
    public void run(){
        System.out.println("This is user Defined Thread");
        System.out.println("Id is:"+this.getId());
        this.setName("UserThread");
        System.out.println("Name is:"+this.getName());
    }
}


public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Started...........!");

        Thread t = Thread.currentThread();

        t.setName("Kartik's Thread");
        String threadName = t.getName();
        System.out.println("Current Thread is:"+threadName);
        System.out.println("Current Thread Id is:"+t.getId());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Going to start User Defined Thread
        UserThread uThread = new UserThread();
        uThread.start();

        System.out.println("Program Ended............!");
    }
}
