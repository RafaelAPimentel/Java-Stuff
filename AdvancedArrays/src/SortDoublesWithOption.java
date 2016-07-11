
import java.util.Arrays;
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
public class SortDoublesWithOption {

    /**
     * @param args the command line arguments
     */
    enum choices {ASCEND,DESCEND};
    public static void main(String[] args) {
       double[] numbers = {1.0,2.0,15.0,3.0,22.0,16.0,2.0,13.0,17.1,2.0,1.0,0.0,2.0,1.0,1.0};
       
       
       String choice = JOptionPane.showInputDialog("do you want to Ascend or Descend");
       choices compare = choices.valueOf(choice.toUpperCase());
       
       int comparison = compare.compareTo(choices.ASCEND);
       if(comparison==0)
       {
           bubbleSortAsc(numbers);
       }
       else
       {
           bubbleSortDesc(numbers);
       }
       display(numbers);
       
    }
    
    public static void bubbleSortAsc(double[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1])
                {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
            
        }
    }
    
    public static void bubbleSortDesc(double[]  array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]<array[j+1])
                {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
            
        }
    }
    public static void display(double[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    
}
