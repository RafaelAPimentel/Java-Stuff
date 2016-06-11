/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public abstract class Book {
    private String title;
    protected double price;
    public abstract void setPrice();
    
   public Book(String title ){
       this.title = title;
   }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    public void display(){
        System.out.println("Title: "+getTitle()+"\nPrice: "+getPrice());
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
}
