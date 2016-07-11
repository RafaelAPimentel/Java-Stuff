/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Guido
 */
public class Prices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] prices ={2.34,5.23,4.67,1.46,9.56,3.23,6.46,5.14,3.46,5.46,1.23,6.43};
        double sum=0;
        double average=0;
        for(double p:prices){
            sum = sum + p;
            average = sum/prices.length;
            
            if(p<5){
                System.out.println("These are the ones under the five "+ p);
            }
            else{
                System.out.println("These are the ones over five: "+ p);
            }
           
        }
        
        System.out.println("average: "+ average);
        System.out.println("sum: "+sum);
        
    }
    
}
