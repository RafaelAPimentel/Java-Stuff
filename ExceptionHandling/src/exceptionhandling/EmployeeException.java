/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Guido
 */
public class EmployeeException extends Exception {
    
    public EmployeeException(String s){
        
        System.out.println(s);
        
    }
}
