/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Guido
 */
public class TaxPayer {

    /**
     * @param args the command line arguments
     */
    
    public double yearlyIncome;
    public int socialNum;
    
    public TaxPayer(int socialNum,double yearlyIncome){
        this.yearlyIncome = yearlyIncome;
        this.socialNum = socialNum;
    }
    
    public int getSocialNum(){
        return socialNum;
    }
    
    public double getYearlyIncome(){
        return yearlyIncome;
    }
    
    public String display(){
        //System.out.println("Social: "+getSocialNum());
        //System.out.println("Income: "+getYearlyIncome());
        return "Social: "+getSocialNum()+"\nIncome: "+getYearlyIncome();
    } 
   public static void main(String[] args) {
        // TODO code application logic here
        TaxPayer[] array =  new TaxPayer[10];
       
        for(int i=0;i<10;i++){
            
            array[i] = new TaxPayer((000000001+i),(10000*(i+1)));
            
        }
        
        for(TaxPayer tax: array){
            System.out.println(tax.display());
            
        }
        
    }
    
}
