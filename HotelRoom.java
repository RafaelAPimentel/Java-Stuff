/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class HotelRoom {
    private final int roomNumber;
    protected double nightlyRentalRate;

    public HotelRoom(int roomNumber){
        this.roomNumber = roomNumber;
        
        if(roomNumber<300){
            this.nightlyRentalRate = 69.95;
        }
        else{
            this.nightlyRentalRate = 89.95;
        }
    }
    /**
     * @return the roomNumber
     */
    
    
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @return the nightlyRentalRate
     */
    public double getNightlyRentalRate() {
        return nightlyRentalRate;
    }
    
    
}
