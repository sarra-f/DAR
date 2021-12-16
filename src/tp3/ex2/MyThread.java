package ex2;

public class MyThread extends Thread {
    private MyCounter counter;

    public MyThread(MyCounter myCounter) {
        this.counter = myCounter;
    }

    @Override
    public void run() {
        synchronized (counter){
        StaticCounter.increment();
        counter.count();}
    }
}
