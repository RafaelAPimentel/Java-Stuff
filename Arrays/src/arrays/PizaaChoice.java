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
public class PizaaChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] pizzaSize = {"S", "M", "L", "X"};
        String[] pizzaSize2 = {"Small", "Medium", "Large", "XtraLarge"};
        double[] pizzaPrice = {6.99, 8.99, 12.50, 15.00};
        boolean hasSize = false;
        

       while(!hasSize){
           String sizeInput = JOptionPane.showInputDialog("(IF INPUT IS WRONG YOU WILL BE PROMPTED AGAIN!)\nenter size of pizza ");
        for (int i = 0; i < pizzaSize.length; i++) {

            if (sizeInput.equalsIgnoreCase(pizzaSize[i])) {
                System.out.println("the price of a " + pizzaSize2[i] + " pizza is " + pizzaPrice[i]);
                hasSize = true;
                break;
            }
        }
       }
        

    }

}
