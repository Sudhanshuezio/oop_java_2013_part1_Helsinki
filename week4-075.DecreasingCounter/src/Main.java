public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.printValue();
    }
}
