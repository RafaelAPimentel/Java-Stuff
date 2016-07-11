
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class LibraryBookSorter {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String sortBy;
        LibraryBookSort[] books = new LibraryBookSort[3];
        getInfo(books);
        
        sortBy = JOptionPane.showInputDialog("Sort by Title, Author or Page number").toUpperCase();
        switch(sortBy)
        {
        
            case "TITLE":
                System.out.println("TITLE SORT");
                titleSort(books);
                display(books);
                break;
            case "AUTHOR":
                System.out.println("AUTHOR SORT");
                authorSort(books);
                display(books);
                break;
            case "PAGE":
                pageSort(books);
                display(books);
                break;
            default:
                System.out.println("You've entered wrong sort type");
                
        }
       
    }
    
    public static void titleSort(LibraryBookSort[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j].getTitle().compareTo(array[j+1].getTitle())>0)
                {
                    
                    String temp= array[j].getTitle();
                    array[j].setTitle(array[j+1].getTitle()); 
                    array[j+1].setTitle(temp);
                }

            }
            
        }
    }
    
    public static void authorSort(LibraryBookSort[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j].getAuthor().compareTo(array[j+1].getAuthor())<0)
                {
                    String temp= array[j].getAuthor();
                    array[j].setAuthor(array[j+1].getAuthor()); 
                    array[j+1].setAuthor(temp);
                }
            }
            
        }
    }
    
    public static void pageSort(LibraryBookSort[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j].getPageCount()>array[j+1].getPageCount())
                {
                    int temp= array[j].getPageCount();
                    array[j].setPageCount(array[j+1].getPageCount()); 
                    array[j+1].setPageCount(temp);
                }
            }
            
        }
    }
    public static void getInfo(LibraryBookSort[] array)
    {
        
        for (int i = 0; i< array.length; i++) {
            array[i] = new LibraryBookSort();
            array[i].setTitle(JOptionPane.showInputDialog("Enter Title of book "+ (i+1)));
            array[i].setAuthor(JOptionPane.showInputDialog("Enter author for book "+ (i+1)));
            array[i].setPageCount(Integer.parseInt(JOptionPane.showInputDialog("Enter page count for book"+ (i+1))));
        }
        
        
    }
    
    public static void display(LibraryBookSort[] array)
    {
        for (LibraryBookSort array1 : array) {
            System.out.println(array1.getTitle());
            System.out.println(array1.getAuthor());
            System.out.println(array1.getPageCount());
            System.out.println(" ");
        }
    }
    
}
