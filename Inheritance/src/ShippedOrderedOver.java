
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
public class ShippedOrderedOver  extends ShippedOrdered{
    
    double fee=4.00;

    /**
     *
     */
    public ShippedOrderedOver(){
        super();
        
    }
    
    @Override
    public double computeTotalPrice(){
        totalPrice = getQuantity()*getUnitPrice()+fee;
        return totalPrice;
    }
    
    public void display(){
         JOptionPane.showMessageDialog(null,"name: "+ getName()+
                                            "\ncustomer number: "+getNumber()+
                                            "\nquantity: "+ getQuantity()+
                                            "\nquanity price: "+ getUnitPrice()+
                                            "\n total Price: "+ computeTotalPrice());
    }
}
