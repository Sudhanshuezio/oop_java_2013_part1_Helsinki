
import java.util.Scanner;
import java.lang.Math.*;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        while(i<=num) {
            result += (int)Math.pow(2,i);
            i++;
        }
        System.out.println("The result is " + result);

    }
}
