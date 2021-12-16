package ex1;

public class Test {

        public static void main(String[] args) throws InterruptedException {

        Myfisrt t1=new Myfisrt();
        Mysecond t2=new Mysecond();
        t1.start();
        Thread t3 = new Thread(t2);
        t3.start();
        t1.join();
        t3.join();
        System.out.println("it''over");

        }

}
