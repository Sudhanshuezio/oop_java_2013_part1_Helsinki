/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class LyyraCard {
    private double balance;
    
    //constructor to intialize value to balance
    public LyyraCard(double balance) {
        this.balance = balance;
    }
    
    //toString method to return balance
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    //method top decrease the balance by 2.5 euros
    public void payEconomical() {
        if(this.balance-2.5 >= 0)
            this.balance -= 2.5;
    }
    
    //method to decrease the balance by 4 euros
    public void payGourmet() {
        if(this.balance - 4 >= 0)
            this.balance -= 4;
    }
    
    //method to add money to the card
    public void loadMoney(double amount) {
        if(amount >= 0) 
        {
            if(this.balance+amount > 150) 
                this.balance = 150;
            else
                this.balance += amount;
        }
    }
    
}
