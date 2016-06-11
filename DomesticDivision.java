/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class DomesticDivision extends Division {
    protected String state;
    
    public DomesticDivision(String name,String number,String state){
        super(name,number);
        this.state = state;
    }
    
    @Override
    public void display(){
        System.out.println("Name: "+ name+
                            "\nNumber: "+ number+
                            "\nState: "+ state);
    }
    
    public static void main(String[] args) {
        Division id = new InternationalDivision("Coke","1234","USA","English");
        Division dd = new DomesticDivision("Pepsi","54321","Florida");
        
        id.display();
        System.out.println(" ");
        dd.display();
    }
}
