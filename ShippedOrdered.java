
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
public class ShippedOrdered {
    private String name, number;
    private int quantity;
    private double unitPrice;
    public double totalPrice;

    public ShippedOrdered(){
        setName();
        setNumber();
        setQuantity();
        setUnitPrice();
    
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public void setName() {
         
        this.name =  JOptionPane.showInputDialog("Enter your name!");
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

   
    public void setNumber() {
        this.number = JOptionPane.showInputDialog("Enter customer number!") ;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     */
    public void setQuantity() {
        this.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quanity") );
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     */
    public void setUnitPrice() {
        this.unitPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter unit price"));
    }
    
    public  double computeTotalPrice(){
        totalPrice = getQuantity()*getUnitPrice();
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
            
