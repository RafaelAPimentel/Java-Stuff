/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author Guido
 */
public class NegativeArray {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
            System.out.println("enter size of array");
            int intSize = input.nextInt();
        
        
        try{
            int[] array = new int[intSize];
            System.out.println("Array made successful");
        }
        catch(NegativeArraySizeException e ){
            System.out.println("array size is negative");
        }
        catch(NumberFormatException e){
            System.out.println("input is string");
        }
        
               
        
    }
    
    
    
}
