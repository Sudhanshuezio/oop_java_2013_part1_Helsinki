public class Reformatory {
    private int count = 0;

    public int weight(Person person) {
        // return the weight of the person
        int weight = person.getWeight();
        this.count++;
        return weight;
    }
    
    public void feed(Person person) {
        person.setWeight(this.weight(person)+1);
    }
    
    public int totalWeightsMeasured() {
        return this.count;
    }

}
