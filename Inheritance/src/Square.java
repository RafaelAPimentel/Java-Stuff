
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
public class Square {
    private final double height;
    private final double width;
    public double surfaceArea;
    
    public Square(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    
    public void computeSurfaceArea(){
        surfaceArea = getHeight()*getWidth();
        JOptionPane.showMessageDialog(null, "surfaceArea: " +surfaceArea);
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
}
