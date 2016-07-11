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
public class TryToParseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(parseString("string"));
        System.out.println(parseString("2"));
    }
    
    public static String parseString(String str){
        int num=0;
        String string = "";
        try{
            num = Integer.parseInt(str);
            string = String.valueOf(num);
        }
        catch(NumberFormatException nu){
            System.out.println("number format");
        }
         return string;
    }
    
}
