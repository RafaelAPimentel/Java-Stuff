
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
public class CollegeEmployee extends Person{
    
    protected String social;
    protected double salary;
    protected String department;
    
    public CollegeEmployee(){
        
    }
    
    @Override
    public void getInfo(){
        System.out.println("Entering data for College Employee");
        firstName = JOptionPane.showInputDialog("enter your first name");
        lastName = JOptionPane.showInputDialog("enter your last name");
        address = JOptionPane.showInputDialog("enter your address");
        zipCode = JOptionPane.showInputDialog("enter your zip code");
        phoneNumber = JOptionPane.showInputDialog("enter your phone number");
        social = JOptionPane.showInputDialog("enter your social");
        salary = Double.parseDouble(JOptionPane.showInputDialog("enter your salary"));
        department = JOptionPane.showInputDialog("enter your department");
         
    }
    
    @Override
    public void display(){
        System.out.println("firstName: "+ firstName);
        System.out.println("lastName: "+ lastName);
        System.out.println("address: "+ address);
        System.out.println("zip code: "+ zipCode);
        System.out.println("Social: "+ social);
        System.out.println("salary: "+ salary);
        System.out.println("department: "+ department);
                
    }
    
}
