/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Guido
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    String idNum;
    double hourlyWage;
    
    public Employee(String idNum,double hourlyWage)throws EmployeeException{
        this.idNum = idNum;
        this.hourlyWage = hourlyWage;
        if(hourlyWage<6.00||hourlyWage>50.00){
            throw(new EmployeeException(this.idNum+ " "+ this.hourlyWage));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Employee one = new Employee("1", 8);
            
            System.out.println("All ran smoothly");
        }
        catch(EmployeeException e){
            System.out.println("Somethin wrong");        }
    }
    
}
