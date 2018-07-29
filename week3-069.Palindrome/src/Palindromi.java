import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String revname = reverse(text);
        if(text.equals(revname))
            return true;
        return false;
    }
    public static String reverse(String name) {
        int size = name.length()-1;
        String newname = "";
        while(size>=0) {
            newname = newname + name.charAt(size);
            size--;
        }
        return newname;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
