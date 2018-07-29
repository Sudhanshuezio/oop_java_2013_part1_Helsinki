
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    
    //method to add elements in menu
    public void addMeal(String meal) {
        if(this.meals.contains(meal) == false)
            this.meals.add(meal);
    }
    
    //print the menu
    public void printMeals() {
        for (String m : this.meals)
            System.out.println(m);
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
