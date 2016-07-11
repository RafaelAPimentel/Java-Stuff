/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Service {
    private String serviceDesc;
    private String price;
    private String minutes;

    
    public Service(String serviceDesc,String price,String minutes){
        this.serviceDesc = serviceDesc;
        this. price = price;
        this.minutes = minutes;
    }
    /**
     * @return the serviceDesc
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @return the minutes
     */
    public String getMinutes() {
        return minutes;
    }
}
