
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
public class Student extends Person{
    
    protected String major;
    protected double GPA;
    
    public Student(){
        
    }
    
    @Override
    public void getInfo(){
        System.out.println("tner data for Student");
        firstName = JOptionPane.showInputDialog("enter your first name");
        lastName = JOptionPane.showInputDialog("enter your last name");
        address = JOptionPane.showInputDialog("enter your address");
        zipCode = JOptionPane.showInputDialog("enter your zip code");
        phoneNumber = JOptionPane.showInputDialog("enter your phone number");
        major = JOptionPane.showInputDialog("enter your major");
        GPA = Double.parseDouble(JOptionPane.showInputDialog("enter your GPA"));
    }
    
    /**
     *
     */
    @Override
    public void display(){
        System.out.println("firstName: "+ firstName);
        System.out.println("lastName: "+ lastName);
        System.out.println("address: "+ address);
        System.out.println("zip code: "+ zipCode);
        System.out.println("Major: "+ major);
        System.out.println("GPA: "+ GPA);
    }
    
}
