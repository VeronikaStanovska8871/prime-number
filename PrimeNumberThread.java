package thread;

public class PrimeNumberThread extends Thread{
    private String threadName;
    private int base;
    private Thread t;

    public PrimeNumberThread(String threadName, int base) {
        this.threadName = threadName;
        this.base = base;
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
        int i;
        int num=base;
        for(i =2; i!=num; i++) {
            if (num % i == 0) {
                num++;
            } else
                System.out.println(num);
        }
        System.out.println("Thread finished");
    }

    @Override
    public void start() {
        if(t==null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
