
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Upto what number? ");
        int num = Integer.parseInt(reader.nextLine());
        int n = 1;
        while(n<=num) {
            System.out.println(n++);
        }
        
    }
}
