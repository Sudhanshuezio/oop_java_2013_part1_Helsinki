import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while(i<this.length) {
            pass = pass + alphabet.charAt(random.nextInt(26));
            i++;
        }
        return pass;
    }
}
