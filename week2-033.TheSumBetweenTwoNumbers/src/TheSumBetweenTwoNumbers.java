
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int f = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int l = Integer.parseInt(reader.nextLine());
        int i = f;
        int sum = 0;
        while(i<=l) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
        
    }
}
