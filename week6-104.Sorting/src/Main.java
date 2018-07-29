
import java.util.Arrays;


public class Main {
    public static int smallest(int[] array) {
        int min = array[0];
        for(int i = 1;i<array.length;i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int min = smallest(array);
        int index = 0;
        for(int i=0;i<array.length;i++) {
            if(array[i] == min) {
                index = i;
            }
        }
        return index;
}
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minindex = index;
        int min = array[index];
        for(int i=index+1;i<array.length;i++) {
            if(array[i] < min) {
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
}
    
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
}
    
    public static void sort(int[] array) {
        int minindex ;
        for(int i=0;i<array.length-1;i++) {
            minindex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, minindex);
            System.out.println(Arrays.toString(array));
            }
        }
    
    
    public static void main(String[] args) {
      
    }

}
