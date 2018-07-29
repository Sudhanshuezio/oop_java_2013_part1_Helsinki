public class DecreasingCounter {
    private int value; 
    private int backup;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.backup = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if(this.value>0) 
            this.value--;
    }
    
    //method to reset the value
    public void reset() {
        this.value = 0;
    }
    // and here the rest of the methods
    
    //method to return counter to its initial value
    public void setInitial() {
        this.value = this.backup;
    }
}
