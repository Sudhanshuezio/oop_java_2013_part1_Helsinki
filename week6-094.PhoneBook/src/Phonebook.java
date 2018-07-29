/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
import java.util.*;

public class Phonebook {
    private ArrayList<Person> personList ;
    
    public Phonebook() {
        this.personList = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person p = new Person(name,number);
        this.personList.add(p);
    }
    
    public void printAll() {
        for(Person p1 : personList) {
            System.out.println(p1);
        }
    }
    
    public String searchNumber(String name) {
        for(Person p : this.personList) {
            if(p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";
    } 
    
}
