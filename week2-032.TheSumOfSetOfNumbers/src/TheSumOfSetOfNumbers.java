
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        int i = 0;
        int num = 0;
        while(i<=limit) {
            num += i;
            i++;
        }
        System.out.println(num);

    }
}
