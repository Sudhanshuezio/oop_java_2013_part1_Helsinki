
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        // Write your code here
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        System.out.println("How many? ");
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i<n) {
            printText();
            i++;
        }
    }
}
