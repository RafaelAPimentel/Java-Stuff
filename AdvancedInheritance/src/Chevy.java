/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Chevy extends Auto{
    
    public Chevy(){
        setMake("Chevy");
        display();
    }
    
    @Override
    public void setPrice(){
        setPrice(25000.0);
    }
    
    public void display(){
        System.out.println("Make: "+getMake()+"\nPrice: "+ getPrice());
    }
    
    public static void main(String[] args) {
        Auto ford = new Ford();
    
        Auto che = new Chevy();  
    }
}
