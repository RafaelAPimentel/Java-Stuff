/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class CollegeCourse {
    protected String department;
    protected String courseNumber;
    protected int credits;
    protected int fee;
    
    public CollegeCourse(String department, String courseNumber, int credits){
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = 1000 * this.credits;
        
    }
    
    public void display(){
        System.out.println("This is a regular college course");
        System.out.println("department: " + department);
        System.out.println("courseNumber: "+ courseNumber);
        System.out.println("credits: "+ credits);
        System.out.println("fee: "+ fee);
        
        
        }
}
