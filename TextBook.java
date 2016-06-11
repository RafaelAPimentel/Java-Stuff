
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
public class TextBook extends Book{
    private String gradeLevel;
    public TextBook(String title, int numOfPages,String gradeLevel) {
        super(title, numOfPages);
        this.gradeLevel = gradeLevel;
    }

    /**
     * @return the gradeLevel
     */
    public String getGradeLevel() {
        return gradeLevel;
    }
    
    
    @Override
   public void display(){
        
           JOptionPane.showMessageDialog(null, "Book title: "+super.getTitle()+
                                               "\nNumber of Pages: "+super.getNumOfPages()+
                                               "\nGrade Level: "+getGradeLevel());
           
     }
    
    public static void main(String[] args) {
        TextBook text = new TextBook("Adventure",200, "A");
        text.display();
    }
}
