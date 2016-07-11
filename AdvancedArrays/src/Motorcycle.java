/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Motorcycle extends Vehicle{
    
    public Motorcycle(double milesPerGallon){
        super(2,milesPerGallon);
    }
    
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle(40.0);
        moto.display();
        Car ca = new Car(80.0);
        ca.display();
        
        
    }
}
