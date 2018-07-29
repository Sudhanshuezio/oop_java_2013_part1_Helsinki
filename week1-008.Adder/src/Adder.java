
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        
        // Implement your program here. Remember to ask the input from user
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (n1+n2));
    }
}
