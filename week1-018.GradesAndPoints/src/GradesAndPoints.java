
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //write your code below this statement
        System.out.println("Type the points [0-60]: ");
        int pts = Integer.parseInt(reader.nextLine());
        int grade;
        if (pts>=0 && pts<=29) {
            System.out.println("Grade: failed");
        }
        else if (pts>=30 && pts<=34) {
            System.out.println("Grade: 1");
        }
        else if (pts>=35 && pts<=39) {
            System.out.println("Grade: 2");
        }
        else if (pts>=40 && pts<=44) {
            System.out.println("Grade: 3");
        }
        else if (pts>=45 && pts<=49) {
            System.out.println("Grade: 4");
        }
        else if (pts>=50 && pts<=60) {
            System.out.println("Grade: 5");
        }    
    }
}
