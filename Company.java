class Company {
    int n;

    boolean f = true;
    // true: Producer Chance
    // false: Consumer Chance

    synchronized public void produceItem(int n) {
        if (!f) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Produced ItemNo.:" + this.n);
        f = false;
        notify();
    }

    synchronized public int consumeItem() {
        if (f) {
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("Consumed ItemNo.:" + this.n);
        f = true;
        notify();
        return this.n;
    }
}
