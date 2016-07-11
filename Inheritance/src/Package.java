/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Package {

    private final int ounces;
    private final String shippingMethod;

    /**
     *
     */
    public double shippingCost;
    public Package(int ounces, String shippingMethod) {
        this.ounces = ounces;
        this.shippingMethod = shippingMethod;
        calculateCost();
    }

    /**
     *
     */
    public void display(){
        System.out.println("ounces: "+ounces+"\nshippingMethod: "+shippingMethod+"\nCost: "+ shippingCost);
    }
    public void calculateCost() {
        
        if (ounces >= 17) {
            switch (shippingMethod) {
                case "A":
                    shippingCost = 4.50;
                    break;
                case "T":
                    shippingCost = 3.25;
                    break;
                case "M":
                    shippingCost = 2.15;
                    break;
            }
        } else if (ounces > 8) {
            switch (shippingMethod) {
                case "A":
                    shippingCost = 3.00;
                    break;
                case "T":
                    shippingCost = 2.35;
                    break;
                case "M":
                    shippingCost = 1.50;
                    break;
            }

        } else {
            switch (shippingMethod) {
                case "A":
                    shippingCost = 2.00;
                    break;
                case "T":
                    shippingCost = 1.50;
                    break;
                case "M":
                    shippingCost = .50;
                    break;
            }
        }
    }

}
