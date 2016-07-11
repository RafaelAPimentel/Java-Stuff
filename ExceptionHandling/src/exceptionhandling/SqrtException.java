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
public class SqrtException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see square root");
        int entry = input.nextInt();
        
        
        display(entry);
        
    }
    
    public static void display(int d){
       try{
            double  s = Math.sqrt(d);
            
            if(!Double.isNaN(s)){
                System.out.println(s);
            }
       }
       catch(ArithmeticException e){
           System.out.println("catch");
       }
            
        
        
    }
    }
    

