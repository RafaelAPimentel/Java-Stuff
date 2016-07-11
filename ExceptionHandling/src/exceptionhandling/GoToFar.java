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
public class GoToFar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] num = {1,2,3,4,5};
    
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(num[i]);
            }
            
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("array out of bounds");
        }
    }
    
}
