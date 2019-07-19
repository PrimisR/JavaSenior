public class TestStorage
{
    public static void main(String[] args) {
        Storage storage=new Storage();

        Producer p=new Producer(storage);
        Consumer c=new Consumer(storage);

        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        Thread t3=new Thread(p);

        Thread c1=new Thread(c);
        Thread c2=new Thread(c);
        Thread c3=new Thread(c);
        Thread c4=new Thread(c);
        Thread c5=new Thread(c);
        Thread c6=new Thread(c);
        Thread c7=new Thread(c);

        t1.start();
        t2.start();
        t3.start();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
    }
}
