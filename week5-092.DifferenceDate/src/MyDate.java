public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getMonth() {
        return this.month;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        double days = 0.0;
        if(this.year > comparedDate.year) {
            //return this.year - comparedDate.year;
            days = (this.year + ((double)this.month)/12 + ((double)this.day)/365) - (comparedDate.year + ((double)comparedDate.month)/12 + ((double)comparedDate.day)/365);
            return (int)days;
        }
        if(this.year < comparedDate.year) {
            days = (comparedDate.year + ((double)comparedDate.month)/12 + ((double)comparedDate.day)/365) - (this.year + ((double)this.month)/12 + ((double)this.day)/365);
            return (int)days;
        }
        return 0;
    }

}
