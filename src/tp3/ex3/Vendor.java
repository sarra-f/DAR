package ex3;

public class Vendor extends Thread{
    private ISISandwich isiSandwich;

    public Vendor(String s, ISISandwich isiSandwich) {
        super(s);
        this.isiSandwich = isiSandwich;
    }

    @Override
    public void run(){synchronized (isiSandwich) {

        try {
            sleep(2000);
            isiSandwich.setReady(true);
            isiSandwich.notify();
            System.out.println("Vendor "+this.getName()+" said 'isi sandwich is ready'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





    }
}}
