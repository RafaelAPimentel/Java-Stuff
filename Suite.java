/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Suite extends HotelRoom {
    
    public Suite(int roomnumber){
        super(roomnumber);
        nightlyRentalRate = getNightlyRentalRate()+40;
    }
    
    public static void main(String[] args) {
        HotelRoom hot = new HotelRoom(500);
        Suite sui = new Suite(500);
        
        System.out.println(
        hot.getNightlyRentalRate()+"\n"+
        sui.getNightlyRentalRate());
    }
}
