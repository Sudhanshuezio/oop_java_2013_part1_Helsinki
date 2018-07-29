
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        

        // Implement your program here. Remember to ask the input from user.
        System.out.println("type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        double c = (double)a/b;
        String result = "Division: " + a + " / " + b + " = " +  c;
        System.out.println(result);
    }
}
