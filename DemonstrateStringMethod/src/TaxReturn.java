
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
public class TaxReturn {

    public String lastName, firstName, streetAddress, city, state, zipCode,socialSecurityNumber;
    public char maritialStatus;
    public double annualIncome;

    public TaxReturn(String socialSecurityNumber, String lastName, String firstName, String streetAddress, String city, String state, String zipCode, char maritialStatus, double annualIncome) {

        
        this.socialSecurityNumber = socialSecurityNumber;
        String regex = ".*[0-9]{3}-[0-9]{2}-[0-9]{4}";
        boolean issn = this.socialSecurityNumber.matches(regex);
        
        while(!issn){
            this.socialSecurityNumber = JOptionPane.showInputDialog("enter your social right!");
            issn = this.socialSecurityNumber.matches(regex);
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        while (this.zipCode.length() < 5) {
            this.zipCode = JOptionPane.showInputDialog("Enter a zip code that is at least 5 char");
        }
        this.maritialStatus = maritialStatus;

        this.annualIncome = annualIncome;
        double taxLiability;
        switch (this.maritialStatus) {
            case 's':
            case 'S':
                if (annualIncome > 50001) {
                    taxLiability = .3;
                } else if (annualIncome > 20001) {
                    taxLiability = .22;
                } else {
                    taxLiability = .15;
                }
                break;
            case 'm':
            case 'M':
                if (annualIncome > 50001) {
                    taxLiability = .28;
                } else if (annualIncome > 20001) {
                    taxLiability = .20;
                } else {
                    taxLiability = .14;
                }
                break;
            default:
                this.maritialStatus = JOptionPane.showInputDialog("enter correct status!").charAt(0);
        }
    }

    public void display() {
        System.out.println("social: " + socialSecurityNumber);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("streetAddress: " + streetAddress);
        System.out.println("zipCode: " + zipCode);
        System.out.println("ciry: " + city);
        System.out.println("state: " + state);
        System.out.println("maritialStatus: " + maritialStatus);
        System.out.println("annualIncome: " + annualIncome);
    }

    public static void main(String[] arg) {
        TaxReturn moo = new TaxReturn("555-55-5555", "Pimentel", "Rafael", "1850 Washington St", "Boston", "Mass", "02118", 'k', 50000);
        moo.display();
    }

}
