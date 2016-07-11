
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Enter your full name");
        String address = JOptionPane.showInputDialog("Enter your address");
        StringBuilder constructID = new StringBuilder();
        
        constructID.append(fullName.charAt(0));
        
        for(int i = 0;i<fullName.length();i++){
        if(Character.isWhitespace(fullName.charAt(i))){
            constructID.append(fullName.charAt(i+1));
        }
        }
        
        for(int i=0;i<address.indexOf(' ');i++){
            constructID.append(address.charAt(i));
        }
        
        System.out.println(constructID.toString().toUpperCase());
    }
    
}
