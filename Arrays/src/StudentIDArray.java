
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
public class StudentIDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] idNumber = {1,2,3,4,5,6,7,8,9,10};
        String[] name = {"Rafael","Amanda","Jamie","Zack","Natalie","Bob","Bill","Zoe","jimmy","Dill"};
        double[] gpa = {4.0,3.0,4.5,3.2,2.5,3.0,4.0,3.0,4.0,3.0,};
        boolean entry=false;
        
        do{
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter your id number!"));
            for(int i =0;i<idNumber.length;i++)
            {
                if(input==idNumber[i])
                {
                JOptionPane.showMessageDialog(null,idNumber[i]+"\n"+
                                                       name[i]+"\n"+
                                                        gpa[i]);
                
                entry =true;
                break;
                }
                
            }
            if(entry==false)
            {
                JOptionPane.showMessageDialog(null,"Enter correct id number");
            }
        }while(entry==false);
        
        
    }
    
}
