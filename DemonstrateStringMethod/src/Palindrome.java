
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
public class Palindrome {

    public static void main(String[] arg) {
        StringBuilder reverse = new StringBuilder();
        String original = JOptionPane.showInputDialog("Enter a string to check for palindrome");

        for (int i = original.length()-1; i >=0; i--) {
            reverse.append(original.charAt(i));
        }
        if (original.equals(reverse.toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
