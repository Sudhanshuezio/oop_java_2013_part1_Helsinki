import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        int i = len-1;
        while(i>=0) {
            System.out.print(name.charAt(i));
            i--;
        }
    }
}
