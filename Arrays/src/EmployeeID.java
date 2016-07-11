/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
import javax.swing.JOptionPane;
public class EmployeeID {
    public static void main(String[] args) 
    {
        String[] lastName = {"a","b","c","d","e","f"};
        int[] idNumber = {1,2,3,4,5,6};
        
        int compare = Integer.parseInt(JOptionPane.showInputDialog("enter your id number"));
        
        for (int i = 0; i < idNumber.length; i++) 
        {
         if(compare == idNumber[i])
         {
             System.out.println("idNumber: " + idNumber[i]);
             System.out.println("LastName: " + lastName[i]);
             break;
         }   
        }
    }
}
