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

public class Grade {
    private String gradeA = "";
    private String gradeB = "";
    private String gradeC = "";
    private String gradeD = "";
    private String gradeE = "";
    private String gradeF = "";
    int accepted = 0;
    int allscores = 0;
    
    public Grade(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        int grade;
        while(true) {
            grade = Integer.parseInt(scanner.nextLine());
            if(grade == -1) {
                break;
            }
            if(grade >= 0 && grade <= 60) {
                this.allscores++;
            }
            if(grade >= 0 && grade<= 29) {
                //this.allscores += grade;
                this.gradeA += "*";
            }
            else if(grade >=30 && grade <=34) {
                
                    this.accepted++;
                
                //this.allscores += grade;
                this.gradeB += "*";
            }
            else if(grade >= 35 && grade <= 39) {
                
                    this.accepted++;
                
                //this.allscores += grade;
                this.gradeC += "*";
            }
            else if(grade >= 40 && grade <=44) {
                
                    this.accepted++;
                
                //this.allscores += grade;
                this.gradeD += "*";
            }
            else if(grade >= 45 && grade<= 49) {
                
                    this.accepted++;
                
                //this.allscores += grade;
                this.gradeE += "*";
            }
            else if(grade >= 50 && grade <= 60) {
                
                    this.accepted++;
                
                //this.allscores += grade;
                this.gradeF += "*";
            }
            
        }
    }
    
    public double acceptedPercentage() {
        double result = ((double)this.accepted) * 100/(this.allscores);
        return result;
    }
    
    public void printGrades(){
        System.out.println("Grade distribution: ");
        System.out.println("5: " + this.gradeF);
        System.out.println("4: " + this.gradeE);
        System.out.println("3: " + this.gradeD);
        System.out.println("2: " + this.gradeC);
        System.out.println("1: " + this.gradeB);
        System.out.println("0: " + this.gradeA);
        double percent = this.acceptedPercentage();
        System.out.println("Acceptance percentage: " + percent );
    }
    
    
}
