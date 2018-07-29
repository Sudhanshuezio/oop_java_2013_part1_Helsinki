import java.util.*;/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public void printLine() {
        
        Random random = new Random();
        double probability;
        for(int i = 0;i<this.width;i++) {
            probability = random.nextDouble();
            if(probability <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        this.starsInLastPrint = 0;
        for(int i=0;i<this.height;i++) {
            this.printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
