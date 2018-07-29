
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money m) {
        Money add = new Money(this.euros + m.euros,this.cents + m.cents);
        return add;
    }
    
    public boolean less(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        }
        if(this.euros == compared.euros){
            if(this.cents < compared.cents) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Money minus(Money m){
        int moneyeuros ;
        moneyeuros = this.euros - m.euros;
        int moneycents;
        if(this.cents < m.cents) {
            moneycents = 100 + this.cents - m.cents;
            moneyeuros -= 1;
        }
        else {moneycents = this.cents - m.cents;}
        if(moneyeuros < 0) {
            moneyeuros = 0;
            moneycents = 0;
        }
        Money mminus = new Money(moneyeuros,moneycents);
        return mminus;
    }

}
