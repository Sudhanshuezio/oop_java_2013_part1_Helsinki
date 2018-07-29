
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your first word: ");
        String fword = reader.nextLine();
        System.out.println("Type the second word: ");
        String sword = reader.nextLine();
        if(fword.indexOf(sword) >= 0) {
            
            System.out.println("The word '" + sword + "' is found in the word '" + fword + "'.");
        }
        else {
            System.out.println("The word '" + sword + "' is not found in the word '" + fword + "'.");
        }
    }
}
