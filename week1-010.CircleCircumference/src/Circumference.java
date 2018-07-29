
import java.util.Scanner;
import java.lang.Math.*;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());
        double circumference = Math.PI * 2 * r;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
