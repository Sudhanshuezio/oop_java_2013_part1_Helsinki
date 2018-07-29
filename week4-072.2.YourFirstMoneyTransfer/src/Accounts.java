
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account acc1 = new Account("Matt's account",1000.00);
        Account acc2 = new Account("My account",0.0);
        acc1.withdrawal(100.0);
        acc2.deposit(100.0);
        System.out.println(acc1);
        System.out.println(acc2);
    }

}
