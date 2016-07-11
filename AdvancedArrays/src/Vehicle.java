/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Vehicle {
    private int wheels;
    private double milesPerGallon;
    
    public Vehicle(int wheels,double milesPerGallon){
        this.wheels = wheels;
        this.milesPerGallon = milesPerGallon;
    }
    
    /**
     *
     */
    public void display(){
        
        System.out.println("wheels: "+ wheels+"\nmilesPerGallon: "+ milesPerGallon);
    }
}
