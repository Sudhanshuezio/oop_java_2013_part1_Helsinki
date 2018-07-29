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
public class Library {
    private ArrayList<Book> list ;
    
    public Library() {
        this.list = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.list.add(newBook);
    }
    
    public void printBooks() {
        for(Book b : list) {
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> newList = new ArrayList<Book>();
        for(Book b : this.list) {
            if(StringUtils.included(b.title(), title)) {
                newList.add(b);
            }
        }
        return newList;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : this.list) {
                if(StringUtils.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : this.list) {
            if(b.year() == (year)) {
                found.add(b);
            }
        }
        return found;
    } 
            
}
