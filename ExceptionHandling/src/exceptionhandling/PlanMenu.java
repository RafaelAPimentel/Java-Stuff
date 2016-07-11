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
public class PlanMenu {
    public static void main(String[] args) {
        Menu briefMenu = new Menu();
        PickMenu entree = null;
        String guestChoice = new String();
    
        try {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch (Exception error) {
            guestChoice = "an invalid selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose "+ guestChoice);
    }
}
