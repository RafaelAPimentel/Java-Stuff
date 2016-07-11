/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Guido
 */
public class VowelArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        
        char input = JOptionPane.showInputDialog("enter a letter").charAt(0);
        boolean check = false;
        for(char a : vowels){
            if(a==Character.toLowerCase(input)){
                check = true;
                break;
            }   
        }
        if(check){
            System.out.println("Letter is a vowel");
        }
        else
            System.out.println("Not a vowel");
    }
    
}
