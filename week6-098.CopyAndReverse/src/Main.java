

public class Main {

    public static void main(String[] args) {
        // write testcode here
        
    }
    
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0;i<newArray.length;i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0;i<newArray.length;i++) {
            newArray[i] = array[array.length-1 - i];
    }
        return newArray;
    }
}
