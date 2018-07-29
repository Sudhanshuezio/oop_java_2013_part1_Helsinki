
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String word;
        while(true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if(word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String ew : words) {
            System.out.println(ew);
        }
    }
}
