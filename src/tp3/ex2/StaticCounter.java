package ex2;

public class StaticCounter {
    private static int counter =0;
    public static void increment(){{
        counter++;
        System.out.println(counter);}
    }
}
