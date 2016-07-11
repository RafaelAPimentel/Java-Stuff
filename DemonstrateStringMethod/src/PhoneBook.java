
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
public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        getInfo();
    }
    
    public static void getInfo()
    {
        String[] names = new String[20];
        String[] phoneNumber = new String[20];
        
        for (int i = 0; i <= 20; i++) 
        {
           String name =  JOptionPane.showInputDialog("Enter your name");
            if(name.equals("zzz"))
            {
            break;
            }
            else
            {
                names[i] = name;
            }
            
            phoneNumber[i] = JOptionPane.showInputDialog("enter your phone number");
            
        }
        returnInfo(names,phoneNumber);
    }
    
    public static void returnInfo(String[] a, String[] b)
    {
        int arrayLength = a.length;
        System.out.println("Printing out phonebook!");
        for(int i=0; i<arrayLength;i++)
        {
            if(a[i] == null)
            {
            }
            else
            {
            System.out.println("Name: "+ a[i]);
            System.out.println("Phone Number: "+  b[i]);
            }
               
        }
    }
}
