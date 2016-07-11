
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
public class LuxuryCarRental extends CarRental{
    boolean chauffer = false;
    public LuxuryCarRental(String name,String zipCode, String sizeOfCar,int rentalLength){
    super(name,zipCode,sizeOfCar,rentalLength);
    dailyRentalFee = 79.99;
    
    String input = JOptionPane.showInputDialog("Do you want a chauffer! yes or no?");
        if(input.equalsIgnoreCase("yes")){
            totalRental+= 200;
            chauffer = true;
        }
    
    }
    
    public void display(){
        System.out.println("name: "+name+
                            "\nzip Code: "+zipCode+
                            "\nsizeOfCar: "+sizeOfCar+
                            "\nrentalLength: "+rentalLength+
                            "\ndailyRentalfee: "+ dailyRentalFee+
                            "\ntotalRental: "+ totalRental+
                            "\nchauffer: " + chauffer);
    }
    
    
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name!");
        String zipCode = JOptionPane.showInputDialog("Enter zipCode");
        String sizeOfCar = JOptionPane.showInputDialog("What size of car you want!\neconomy\nmidsize\nfullsize");
        int luxury = JOptionPane.showConfirmDialog(null,"Do you want luxury");
        int days = Integer.parseInt(JOptionPane.showInputDialog("Enter length of day"));
        
        if(luxury==0){
        LuxuryCarRental lux = new LuxuryCarRental(name,zipCode,sizeOfCar,days);
        lux.display();
        }
        else{
            CarRental car = new CarRental(name,zipCode,sizeOfCar,days);
            car.display();
        }
        
       
       
    }
}
