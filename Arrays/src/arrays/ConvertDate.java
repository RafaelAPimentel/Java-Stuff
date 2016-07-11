/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Guido
 */
public class ConvertDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] month = {"null","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean valid = true;
        String input = JOptionPane.showInputDialog("Enter date in format MM/DD/YYYY");
        int monthSplit =  Integer.parseInt(input.substring(0, input.indexOf('/')));
        int secondsplit =  input.indexOf('/') + 1;
        int daySplit = Integer.parseInt(input.substring(secondsplit,input.indexOf('/',secondsplit)));
        
        if(monthSplit<=12&&monthSplit>=1){
                if(daySplit<day[monthSplit]){
                    valid =true;
                }
            }
            else{
                valid = false;
            }
        
        while(!valid){
                    input = JOptionPane.showInputDialog("Enter a correct format MM/DD/YYYY");
                    monthSplit =  Integer.parseInt(input.substring(0, input.indexOf('/')));
                    secondsplit =  input.indexOf('/') + 1;
                    daySplit = Integer.parseInt(input.substring(secondsplit,input.indexOf('/',secondsplit)));
            if(monthSplit<=12||monthSplit>=1){
                if(daySplit<day[monthSplit]){
                    valid =true;
                }
            }
            else{
                valid = false;
            }
        }
        
        JOptionPane.showConfirmDialog(null, "You entered " + month[monthSplit] + " "+ daySplit,"This is some donkey",JOptionPane.YES_NO_OPTION);
        
                
    }
    
}
