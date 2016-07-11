/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class InsuredPackage extends Package {

    public InsuredPackage(int ounces,String shippingMethod){
    super(ounces,shippingMethod);
        
        if(shippingCost>3.0){
            shippingCost += 5.55;
        }
        else if(shippingCost>1){
            shippingCost += 3.95;
        }
        else{
            shippingCost+=2.45;
        }
    }
    
    public static void main(String[] args) {
        Package pac = new Package(5,"A");
        InsuredPackage inpac = new InsuredPackage(5,"A");
        
        pac.display();
        inpac.display();
    }
}

