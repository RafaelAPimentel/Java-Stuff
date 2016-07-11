/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.*;
import java.nio.file.*; 
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guido
 */
public class ReadFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner scanner = new Scanner(System.in);
        String file = JOptionPane.showInputDialog("Enter file name to be read");
        BufferedReader br = null;
        String line;
        int ext = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for txt file\n2 for doc/docx \n3 for jpg"));
        switch(ext){
            case 1:
                file = file+".txt";
                break;
            case 2:
                file = file+".docx";
                break;
            case 3:
                file = file+".jpg";
                break;
        }
        
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Guido\\Documents\\NetBeansProjects\\WriteToFile\\"+ file));
            System.out.println("---Your file---");
        }catch(FileNotFoundException fnfex){
            System.out.println(fnfex.getMessage()+" The file was not found");
            System.exit(0);
        }
        try {
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("---End File---");
        } catch (IOException ex) {
            System.out.println(ex.getMessage()+ "Error reading file");
            
        }
        finally{
            
        System.exit(0);
        }
        
    }
    
}
