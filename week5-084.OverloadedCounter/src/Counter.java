/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class Counter {
    private int number;
    private boolean check = false;
    
    public Counter(int startingValue,boolean check) {
        this.number = startingValue;
        if(check == true) {
            this.check = true;
        }
    }
    
    public Counter(int startingValue) {
        this(startingValue,false);
    }
    
    public Counter(boolean check) {
        this(0,check);
    }
    
    public Counter() {
        this(0,false);
    }
    
    public int value() {
        return this.number;
    }
    
    
    public void increase(int increaseAmount) {
        if(increaseAmount >= 0) {
            this.number += increaseAmount;
        }
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int decreaseAmount) {
        if(decreaseAmount >= 0) {
            int i = 0;
            while(i<decreaseAmount) {
                decrease();
                i++;
            } 
        }
    }
    
    
    public void decrease() {
        if(this.check == true) {
                if(this.number-1 >= 0) {
                    this.number --;
            }}
            else {
                this.number --;
            }
        
    }
    
}
