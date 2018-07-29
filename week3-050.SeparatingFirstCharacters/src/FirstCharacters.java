import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char a,b,c;
        if(name.length()>= 3) {
            a = name.charAt(0);
            b = name.charAt(1);
            c = name.charAt(2);
            System.out.println("1. character: " + a);
            System.out.println("2. character: " + b);
            System.out.println("3. character: " + c);
        }
        else {
            System.out.println("");
        }
    }
}
