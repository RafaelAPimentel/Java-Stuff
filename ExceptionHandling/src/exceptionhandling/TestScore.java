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
import java.lang.Object;
public class TestScore {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ID = {1,2,3,4,5};
        int[] scores=new int[ID.length];
        try {
            inputScore(ID,scores);
        } catch (Exception e) {
            System.out.println("Entered wrong score");
        }
        
        
    }
    
    public static void inputScore(int[] arr,int[] arr2)throws ScoreException{
        for (int string : arr) {
            int input =Integer.parseInt(JOptionPane.showInputDialog("Enter score number"));
            if(input>100||input<0){
                throw(new ScoreException("wrong score"));
            }
            
            arr2[string-1] = input;
        }
    }
    
}
