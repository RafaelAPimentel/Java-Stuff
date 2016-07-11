/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
import javax.swing.*;
public class Book {
    
    private String title;
    private int numOfPages;

    /**
     * @param title
     * @param numOfPages
     * @return the title
     */
    public Book(String title, int numOfPages){
        this.title = title;
        this.numOfPages = numOfPages;
    }
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the numOfPages
     */
    public int getNumOfPages() {
        return numOfPages;
    }

    /**
     * @param numOfPages the numOfPages to set
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null, "Title: "+ getTitle()+"\nPage Number: "+getNumOfPages());
    }
}
 