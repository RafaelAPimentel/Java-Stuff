/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Guido
 */
public class IntArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        
        System.out.println("Printing forward ");
        for(int item : array){
            System.out.print(item+", ");
        }
        
        System.out.println("\nPrinting backwards");
        for(int i=array.length-1; i>=0;i--){
            System.out.print(array[i]+", ");
        }
    }
    
}
