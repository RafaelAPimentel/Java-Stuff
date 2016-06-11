/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Fiction extends Book {
    public Fiction(String title){
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        price = 24.99; 
    }
}
