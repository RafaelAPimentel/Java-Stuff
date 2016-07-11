
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class LabCourse extends CollegeCourse{
    
    public LabCourse(String department, String courseNumber, int credit){
    
    super(department,courseNumber,credit);
    fee += 50;
    
    }
    
    /**
     *
     */
    
    @Override
    public void display(){
        System.out.println("**This is a Lab course**");
        System.out.println("department: "+ department);
        System.out.println("courseNumber: "+ courseNumber);
        System.out.println("credits: "+ credits);
        System.out.println("***fee is 1000/credit plus $50 if course is a LabCourse*** \nfee: "+ fee);
        
    }
    public static void main(String[] args) {
        String department = JOptionPane.showInputDialog("Enter department").toUpperCase();
        String courseNumber = JOptionPane.showInputDialog("Enter course number!");
        int credits = Integer.parseInt(JOptionPane.showInputDialog("enter credits!"));
                
        switch(department){
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                LabCourse lab = new LabCourse(department,courseNumber,credits);
                lab.display();
                break;
            default:
                CollegeCourse coll = new CollegeCourse(department,courseNumber,credits);
                coll.display();
        }
    }
}
