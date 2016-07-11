
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
public class Majors {

    /**
     * @param args the command line arguments
     */
    public enum Major {ACC,CHEM,CIS,ENG,HIS,PHYS }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null,Major.values() );
        
        String input = JOptionPane.showInputDialog("Enter a Major");
        Major search = Major.valueOf(input.toUpperCase());
        switch(search){
            case ACC:
            case CIS:
                JOptionPane.showMessageDialog(null,"This is a Business Division");
                break;
            case CHEM:
            case PHYS:
                JOptionPane.showMessageDialog(null,"This is a Science Division");
            case ENG:
            case HIS: 
                JOptionPane.showMessageDialog(null,"This is a Humanities Division");
            default:
                JOptionPane.showMessageDialog(null, "Something went wrong!");
        }
    }
    
}
