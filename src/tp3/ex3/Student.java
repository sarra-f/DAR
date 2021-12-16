package ex3;
public class Student extends Thread  {
        private ISISandwich isiSandwich;

        public Student(String s, ISISandwich isiSandwich) {
            super(s);
            this.isiSandwich = isiSandwich;
        }

        @Override
        public void run() {synchronized (isiSandwich){

            System.out.println("Student " + this.getName() + " is waiting for a sandwich");
            try {
                isiSandwich.wait();
                System.out.println("Student " + this.getName() + " got a sandwich");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
    }}
