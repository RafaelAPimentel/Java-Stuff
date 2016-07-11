/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class LeapYear extends Year{
    
    
    public LeapYear(){
        numberOfDays = 366;
    }
    
    public static void main(String[] args) {
        Year yar = new Year();
        LeapYear yars = new LeapYear();
        
        System.out.println(yar.getNumberOfDays());
        System.out.println(yars.getNumberOfDays());
    }
}
