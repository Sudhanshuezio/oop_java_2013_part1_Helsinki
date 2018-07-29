/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    //Constructor to initialize values in object
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    //Method to print the product
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
    
}
