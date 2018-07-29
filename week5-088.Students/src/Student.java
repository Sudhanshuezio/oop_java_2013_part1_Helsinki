/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu
 */
public class Student {
    private String student;
    private String studentNumber;
    
    public Student(String name , String number){
        this.student = name;
        this.studentNumber = number;
    }
    
    public String getName() {
        return this.student;
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    public String toString() {
        return "" + this.student + " (" + this.studentNumber + ") ";
    }
    
}
