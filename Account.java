/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public abstract class Account {
    protected int accNumber;
    protected double accBalance;
    public abstract int getNumber();
    public abstract  double getBalance();
    
    
    public Account(int accNumber){
        this.accNumber = accNumber;
        accBalance = 0.0;
        display();
    }

    /**
     * @param accBalance the accBalance to set
     */
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    
    public void display(){
        System.out.println("Checking Account\nAccountNumber: "+ getNumber()+"\nBalance: "+getBalance());
        System.out.println(" ");
    }
}
