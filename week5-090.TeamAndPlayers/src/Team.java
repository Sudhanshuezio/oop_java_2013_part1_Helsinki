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

public class Team {
    private String name;
    private ArrayList<Player> teamList ;
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;
        this.teamList = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player newPlayer) {
        if(this.teamList.size() < this.maxSize)
            this.teamList.add(newPlayer);
    }
    
    public void printPlayers() {
        for(Player p : this.teamList) {
            System.out.println(p);
        }
        
    }
    
    public int size() {
        return this.teamList.size();
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;  
    }
    
    public int goals() {
        int goals = 0;
        for(Player p1 : this.teamList ) {
            goals += p1.goals();
        }
        return goals;
    }
    
    
    
    
}
