/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class Multiplier {
    private int number;
    
    //constructor to initialize value in object
    public Multiplier(int number) {
        this.number = number;
    }
    
    //method to multiply the value in class with other number
    public int multiply(int otherNumber) {
        return this.number * otherNumber;
        
    }
}
