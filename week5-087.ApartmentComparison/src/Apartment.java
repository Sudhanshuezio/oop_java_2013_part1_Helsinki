
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherAppartment) {
        if(this.squareMeters > otherAppartment.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherAppartment) {
        if(this.pricePerSquareMeter * this.squareMeters > otherAppartment.pricePerSquareMeter * otherAppartment.squareMeters) {
            return (this.pricePerSquareMeter * this.squareMeters) - (otherAppartment.pricePerSquareMeter * otherAppartment.squareMeters);
        }
        return (otherAppartment.pricePerSquareMeter * otherAppartment.squareMeters) - (this.pricePerSquareMeter * this.squareMeters);
        
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if(this.pricePerSquareMeter * this.squareMeters > otherApartment.pricePerSquareMeter * otherApartment.squareMeters) {
            return true;
        }
        return false;
    }
    
}
