
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
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter a password!");
        boolean shortLong =false;
        boolean hasNumber = false;
        while(password.length()<6||password.length()>10){
            password = JOptionPane.showInputDialog("Password is either to short or to long! Keep trying");
            shortLong =true;
        }
               
        while(!hasNumber)  {
             password = JOptionPane.showInputDialog("password doesnt have a number keep going!");
                if(hasNumber(password)){
                hasNumber = true;
                }
            } 
        
        String password2 = JOptionPane.showInputDialog("Enter your pasword again!");
        
        while(!(password.equals(password2))){
        
            password2 = JOptionPane.showInputDialog("Enter your password again to match the first one");
        }
    
           System.out.println("your password is set \nPassword: "+ password);
    }
    
    public static boolean hasNumber(String a){
    for(int i=0; i<a.length();i++){
        
            if(Character.isDigit(a.charAt(i))){
            return true;
            }
        
        }
        return false;
}
}