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
public final class Cube extends Square{
    
    private final double length;
    
    public Cube(double h,double w, double l){
    super(h,w);
    length = l;
    computeSurfaceArea();
    }
    
    public double getLength() {
        return length;
    }
    
    @Override
    public void computeSurfaceArea(){
    surfaceArea = (2*(getLength()*super.getWidth()))+(2*(getLength()*super.getHeight()))+(2*(super.getHeight()*super.getWidth()));
    JOptionPane.showMessageDialog(null,"SurfaceArea: " + surfaceArea);
    }

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        Cube cub = new Cube(5,5,5);
    }
}
