import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday; 
   }
    
    public Person(String name) {
        this(name, new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR))); 
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate date1 = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
        int age = this.birthday.differenceInYears(date1);
        return age;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        double age1 = this.age() + ((double)this.birthday.getDay())/365 + ((double)this.birthday.getMonth())/12;
        double age2 = compared.age() + ((double)compared.birthday.getDay())/365 + ((double)this.birthday.getMonth())/12;
        if(age1 > age2) {
            return true;
        }
        return false;
    }
    
    
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
