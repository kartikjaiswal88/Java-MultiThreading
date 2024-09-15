public class Producer extends Thread {
    Company c;

    public Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            this.c.produceItem(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
