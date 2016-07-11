/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class DemonstrateStringMethod {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        String testing = "\"It is better to deserve honours and not have them than to have them and not deserve them\" - Mark Twain";

        int indexOf = testing.indexOf('h');
        char charAt = testing.charAt(14);
        boolean endsWith = testing.endsWith("Twain");
        testing = testing.replace('a', 'A');
        System.out.println(indexOf);
        System.out.println(charAt);
        System.out.println(endsWith);
        System.out.println(testing);

    }

}
