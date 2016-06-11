/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Checking extends Account{

    public Checking(int accNumber){
       super(accNumber);
    }
    @Override
    public int getNumber() {
        return accNumber;
    }
    
    @Override
    public double getBalance(){
        return accBalance;
    }
    
    public void dipslay(){
        System.out.println("Checking Account\nAccountNumber: "+ getNumber()+"\nBalance: "+getBalance());
        System.out.println(" ");
    }
    
    
}
