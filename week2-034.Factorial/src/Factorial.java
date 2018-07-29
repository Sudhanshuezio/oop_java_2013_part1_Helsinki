import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        if(n == 0) {
            System.out.println("Factorial is 1");
        }
        else
        {
            int fact = 1;
            int i = 1;
            while(i<=n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial is " + fact);
        }
        

    }
}
