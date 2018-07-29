public class NumberStatistics {
    private int amountOfNumbers;
    private int numbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.numbers += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    
    public int sum() {
        if(this.amountOfNumbers == 0)
            return 0;
        return this.numbers;
    }
    
    public double average() {
        if(this.amountOfNumbers == 0)
            return 0;
        return ((double)(this.numbers))/this.amountOfNumbers;
    }
}
   