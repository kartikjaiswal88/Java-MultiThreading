public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        Producer pro = new Producer(c);
        Consumer con = new Consumer(c);

        pro.start();
        con.start();
    }
}
