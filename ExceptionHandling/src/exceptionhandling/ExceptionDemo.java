/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import javax.swing.JOptionPane;

/**
 *
 * @author Guido
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerator =0, denominator=0,result;
        String inputString;
        
        try {
            inputString = JOptionPane.showInputDialog(null,"Enter a number to be divided");
            
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null,"Enter a number to be divided by the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator/denominator;
                    
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            result =0;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "This application accepts digits only");
            numerator = 999;
            denominator = 999;
            result = 1;
        }
        
        JOptionPane.showMessageDialog(null, numerator +" / "+denominator + "\nResult is "+result);
    }
    
}
