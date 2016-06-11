/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class CarRental {
    public String name,zipCode,sizeOfCar;
    public int rentalLength;
    double dailyRentalFee,totalRental;
    
    public CarRental(String name,String zipCode, String sizeOfCar,int rentalLength){
        this.name = name;
        this.zipCode = zipCode;
        this.sizeOfCar = sizeOfCar;
        this.rentalLength = rentalLength;
        
        switch(sizeOfCar){
            case "economy":
                dailyRentalFee = 29.99;
                break;
            case "midsize":
                dailyRentalFee = 38.99;
                break;
            case "fullsize":
                dailyRentalFee = 43.50;
                break;
        }
        
        totalRental = dailyRentalFee*this.rentalLength;
    }
    
    public void display(){
        System.out.println("name: "+name+
                            "\nzip Code: "+zipCode+
                            "\nsizeOfCar: "+sizeOfCar+
                            "\nrentalLength: "+rentalLength+
                            "\ndailyRentalfee: "+ dailyRentalFee+
                            "\ntotalRental: "+ totalRental);
    }
}
