/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class BoundedCounter {
    private int value;
    private int upperBound;
    
    public BoundedCounter(int upperLimit) {
        this.upperBound = upperLimit;
    }
    
    //this method increments the value of counter
    public void next() {
        if(this.value+1 <= this.upperBound) {
            this.value++;
        }
        else {
            this.value = 0;
        }
    } 
    
    //method to represent counter in form of string
    public String toString() {
        //return Integer.toString(this.value);
        if(this.value<10) {
            return  "0" + this.value;
        }
        return "" + this.value;
        
    }
    
    //method to return value
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if(value > 0 && value<= this.upperBound) {
            this.value = value;
        }
    }
   
    
}
