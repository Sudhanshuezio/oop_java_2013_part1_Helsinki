public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i<amount)
        {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i<amount) {
            System.out.print(" ");
            i++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = size-1;
        int j = 1;
        while(i>=0) {
            printWhitespaces(i);
            printStars(j);
            i--;
            j++;
        }
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int k = height-1;
        while(k>=0) {
            printWhitespaces(k);
            printStars(i);
            k--;
            i = i+2;
        }
        int m = 1;
        while(m<=2) {
            printWhitespaces(
                    (((i+1)/2)-2)-1);
            printStars(3);
            m++;
        }
        /*int m = 1;
        while(m <= 2) {
            int n = 1;
            while(n<=((i+1)/2 - 2)) {
                printWhitespaces(1);
                n++;
            }
            printStars(3);
            m++;
        }*/
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
