/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Nonfiction extends Book {
    public Nonfiction(String title){
        super(title);
        setPrice();
        }
    
    @Override
    public void setPrice(){
        price = 37.99;
    }
    
    public static void main(String[] args) {
       /* Nonfiction non = new Nonfiction("Nonfiction");
        
        Fiction fic  = new Fiction("Fiction book");
        
        non.display();
        fic.display();
        */
        
      Book[] boo = new Book[5];
        
        boo[0] = new Fiction("Book 1");
        boo[1] = new Nonfiction("Book 2");
        boo[2] = new Fiction("Book 3");
        boo[3] = new Nonfiction("Book 4");
        boo[4] = new Fiction("Book 5");
        
        for (Book book : boo) {
            
            book.display();
            System.out.println(" ");
        }
    }
}
