import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char l = lastCharacter(name);
        System.out.println("Last character: " + l);
    }
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
