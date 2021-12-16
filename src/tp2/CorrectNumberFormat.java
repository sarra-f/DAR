package number;
import java.util.Scanner;
public class number {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);

        //get input from console
        String line = scanner.nextLine();

        //convert it to number
        try {
            int num = Integer.parseInt(line);
            System.out.println("it's a number");
        } catch(NumberFormatException e){
            System.out.println("it's not a number");
        }

        // todo print the answer based on the input

    }
}
