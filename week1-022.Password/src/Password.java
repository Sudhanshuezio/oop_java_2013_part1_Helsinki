
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while(true) {
            System.out.println("Type the password: ");
        String pass = reader.nextLine();
        if(pass.equals("carrot")) {
            System.out.println("Right!");
            break;
        }
            System.out.println("Wrong!");   
        }
     
        System.out.println("The secret is: jryy qbar!");
    }
}
