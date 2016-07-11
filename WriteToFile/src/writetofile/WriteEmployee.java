/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;






/**
 *
 * @author Guido
 */
public class WriteEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try{
        FileWriter fw = new FileWriter("C:\\Users\\Guido\\Documents\\NetBeansProjects\\WriteToFile\\Records\\test2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String s = "";
        String delimeter = ",";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;
        
        
            id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID number >>"));
            while(id != QUIT){
                name = JOptionPane.showInputDialog("Enter name for employee #"+ id + " >> ");
                payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter pay rate >>"));
                String idfile= "ID: "+ id; 
                String namefile = "Name: "+ name;
                String payRateFile = "Pay rate: "+ payRate;
                bw.append(idfile);
                bw.newLine();
                bw.append(namefile);
                bw.newLine();
                bw.append(payRateFile);
                bw.newLine();
                bw.newLine();
                id = Integer.parseInt(JOptionPane.showInputDialog("Enter next ID number or 999 to quit >>"));
                   
            }
            bw.close();
            
            if(id==999){
                System.out.println("Thank you have a nice day!!");
            }
        }
        catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
