import java.util.ArrayList;
import java.lang.*;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i : list)
            sum += i;
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double avg = sum/list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double sum = 0;
        for (int i : list ) {
            sum += Math.pow((i - avg),2);
        }
        double variance = sum/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
