/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder firstName = new StringBuilder("Rafael");
        StringBuilder middleName = new StringBuilder("Asnoldo");
        StringBuilder lastName = new StringBuilder("Pimentel");

        StringBuilder entireName = new StringBuilder();
        StringBuilder lastFirst = new StringBuilder();
        StringBuilder signiture = new StringBuilder();
        entireName.append(firstName + " ");
        entireName.append(middleName + " ");
        entireName.append(lastName);

        lastFirst.append(lastName + " ");
        lastFirst.append(firstName);

        signiture.append(firstName + " ");
        signiture.append(middleName.charAt(0) + ". ");
        signiture.append(lastName);
        System.out.println(entireName.toString());
        System.out.println(lastFirst);
        System.out.println(signiture);

    }

}
