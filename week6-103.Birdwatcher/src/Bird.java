


public class Bird {

    private final String birdName;
    private final String latinName;
    private int count;

    public Bird(String name, String latin) {
        this.birdName = name;
        this.latinName = latin;
        this.count = count;
    }

    public String getName() {
        return this.birdName;
    }

    public String getlatinName() {
        return this.latinName;
    }

    /*public int getCount(){
     return this.count;
     }*/
    
    public void increaseCount() {
        count++;
    }

    @Override
    public String toString() {
        return this.birdName + " (" + this.latinName + "): "
                + this.count + " observations";
    }
}
