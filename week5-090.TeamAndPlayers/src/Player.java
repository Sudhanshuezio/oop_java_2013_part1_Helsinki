/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class Player {
    private String playerName;
    private int amountOfGoals;
    
    
    public Player(String name, int goals) {
        this.playerName = name;
        this.amountOfGoals = goals;
    }
    
    public Player(String name) {
        this(name,0);
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.amountOfGoals;
    }
    
    public String toString() {
        return this.getName() + ", goals " + this.goals();
    }
}
