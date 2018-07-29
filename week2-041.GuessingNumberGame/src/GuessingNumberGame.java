
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int num ;
        int count = 0;
        // program your solution here. Do not touch the above lines!
        while(true) {
            System.out.println("Guess a number: ");
            num = Integer.parseInt(reader.nextLine());
            if(num < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + (++count) );
            }
            else if(num>numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + (++count));
            }
            else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
            

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
