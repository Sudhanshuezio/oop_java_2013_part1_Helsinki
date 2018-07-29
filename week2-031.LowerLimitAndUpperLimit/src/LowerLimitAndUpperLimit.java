
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int u = Integer.parseInt(reader.nextLine());
        System.out.println("last: ");
        int l = Integer.parseInt(reader.nextLine());
        if(u > l){
            System.out.println("");
        }
        else {
            int num = u;
            while(num <= l) {
                System.out.println(num++);
            }
        }

    }
}
