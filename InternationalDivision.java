/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class InternationalDivision extends Division{
    
    protected String country;
    protected String language;
    
    public InternationalDivision(String name,String number,String country, String language){
        super(name,number);
        this.country = country;
        this.language = language;
    }
    @Override
    public void display(){
        System.out.println("Name: "+ name+
                            "\nNumber: "+ number+
                            "\nCountry: "+ country+
                            "\nLanguage: "+ language);
    }
}
