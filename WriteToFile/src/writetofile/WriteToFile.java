/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Guido
 */
public class WriteToFile  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
        FileWriter fw = new FileWriter("C:\\Users\\Guido\\Documents\\NetBeansProjects\\WriteToFile\\Records\\test.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        
       String writableString = JOptionPane.showInputDialog("Enter phrase to append to file");
        writableString = writableString.substring(0,writableString.length()-1);
        System.out.println(writableString);
            bw.newLine();
            bw.append("appended phrase: "+ writableString);
            bw.close();
       }catch(IOException ex){
            System.out.println("ERROR: "+ ex);
        }
        
    }
    
}
