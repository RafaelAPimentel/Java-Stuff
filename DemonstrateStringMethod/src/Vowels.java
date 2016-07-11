
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"rafael","jamie","carlos"};
        String inter ="";
        int count=0;
        for (int i = 0; i < names.length; i++) 
        {
              inter =  names[i];
              for(int z=0;z<inter.length();z++)
              {
                  switch(inter.charAt(z))
                  {
                      case 'a':
                      case 'A':
                      case 'e':
                      case 'E':
                      case 'i':
                      case 'I':
                      case 'o':
                      case 'O':
                      case 'u':
                      case 'U':
                         count ++;
                 }
              }
        }
        System.out.println(Arrays.toString(names));
        System.out.println("count of vowels is: " +count);
        
        
    }
    
}
