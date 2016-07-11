
import javax.swing.JOptionPane;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Median {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] numbers = new int[9];
        inputNumbers(numbers);
        calculate(numbers);
    }
    
    public static void inputNumbers(int[] array)
    {
        int size = array.length;
        System.out.println("Your going to enter " +size+ " numbers!");
        for (int i = 0; i < size ; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number "+ (i+1)));
       
        }
    }
    
    public static void calculate(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
            
        }
            System.out.println("The sum is "+ sum);
   
    }
    
}
