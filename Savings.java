/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Savings extends Account {
     double interestRate;
    public Savings(int accNumber,double ir){
        super(accNumber);
        interestRate = ir;
    }
    
    @Override
    public int getNumber(){
        return accNumber;
    }
    @Override
    public double getBalance(){
        return accBalance;
    }
    
    public void display(){
        System.out.println("Savings Account\nAccount Number: "+ getNumber()+"\nBalance "+ getBalance()+"\nInterestRate: "+ interestRate);
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        Account[] acc = new Account[5];
        
        acc[0] = new Checking(1234);
        acc[1] = new Savings(9876, 5.5);
        
        
        //Savings sav = new Savings(1234, 5.5);
        //Checking chec = new Checking(2345);
        //sav.display();
        //System.out.println(" ");
        //chec.dipslay();
    }
    
}
