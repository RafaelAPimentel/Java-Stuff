
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
public class Person {
    protected String firstName,lastName,address,zipCode,phoneNumber;
    
    public void getInfo(){
        firstName = JOptionPane.showInputDialog("enter your first name");
        lastName = JOptionPane.showInputDialog("enter your last name");
        address = JOptionPane.showInputDialog("enter your address");
        zipCode = JOptionPane.showInputDialog("enter your zip code");
        phoneNumber = JOptionPane.showInputDialog("enter your phone number");
    }
    
    public void display(){
        System.out.println("firstName: "+ firstName);
        System.out.println("lastName: "+ lastName);
        System.out.println("address: "+ address);
        System.out.println("zip code: "+ zipCode);
    }
}
