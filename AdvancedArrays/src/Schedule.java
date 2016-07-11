
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
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] classes = {{"CS 100","Mon 2:30"},
                              {"CS 200", "Tu 12:00"},
                              {"CS 300", "Fr 9:00"}};
        
        boolean exist=false;
        
        
        
         String classInput = JOptionPane.showInputDialog(null, "Enter your class name to show time");
    
        for (String[] classe : classes) {
            if (classInput.equalsIgnoreCase(classe[0])) {
                System.out.println("The class is on " + classe[1]);
                exist = true;
                break;
            }
           
        }
        if(!exist){
            System.out.println("Your class is not in the system!");}
        
    }   
   
}
