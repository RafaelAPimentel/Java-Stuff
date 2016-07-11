
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
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog("Enter a three letter word!");
        StringBuilder newString = new StringBuilder();
        char firstLetter = answer.charAt(0);

        if (Character.isLetter(firstLetter)) {
            newString.append(answer.charAt(0));
            for (int i = 0; i < answer.length(); i++) {
                if (Character.isWhitespace(answer.charAt(i))) {
                    newString.append(answer.charAt(i + 1));

                    if (newString.length() == 3) {
                        break;
                    }
                }

            }
        } else {

            for (int i = 0; i < answer.length(); i++) {
                if (Character.isWhitespace(answer.charAt(i))) {
                    newString.append(answer.charAt(i + 1));

                    if (newString.length() == 3) {
                        break;
                    }

                }
            }
        }
        String newerString = newString.toString();
        System.out.println("Acronym: " + newerString.toUpperCase());
    }

}
