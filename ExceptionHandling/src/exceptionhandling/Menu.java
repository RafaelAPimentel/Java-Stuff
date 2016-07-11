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
import javax.swing.*;
public class Menu {
    private String[] entreeChoice = {"Rosemary Chicken","Beef Wellington","Maine Lobster"};
    private String menu="";
    private int choice;
    
    public String displayMenu(){
        for (int i = 0; i < entreeChoice.length; i++) {
            menu = menu +"\n "+ (i+1)+ " for "+ entreeChoice[i];
        }
        String input = JOptionPane.showInputDialog(null,"Type your selection, then press Enter."+ menu);
        choice = Integer.parseInt(input);
        return (entreeChoice[choice-1]);
    }

}
