/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Ford extends Auto {
    
    public Ford(){
        setMake("Ford");
        setPrice();
        display();
    }
    
    @Override
    public void setPrice(){
        setPrice(20000.0);
    }
    
    public void display(){
        System.out.println("Make: "+getMake()+"\nPrice: "+ getPrice());
    }
    
}
