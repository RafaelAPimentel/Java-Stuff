
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
public class SalonReport {

    /**
     * @param args the command line arguments
     */
    enum sort {
        ASCE, DESC
    };

    public static void main(String[] args) {
        // TODO code application logic here
        Service[] serv = new Service[3];
        getData(serv);
        sortOpt(serv);
        display(serv);

    }

    public static void getData(Service[] a) {

        for (int i = 0; i < a.length; i++) {
            String desc = JOptionPane.showInputDialog("Enter service description!");
            String price = JOptionPane.showInputDialog("enter price of service " + desc);
            String min = JOptionPane.showInputDialog("Enter minutes of service " + desc);
            a[i] = new Service(desc, price, min);
        }
    }

    public static void sortOpt(Service[] a) {
        String sortOpt = JOptionPane.showInputDialog("Would you like the order ascending or descending?");

        sort order = sort.ASCE;
        if (sortOpt.charAt(0) == 'a' || sortOpt.charAt(0) == 'A') {

            order = sort.ASCE;
        } else if (sortOpt.charAt(0) == 'd' || sortOpt.charAt(0) == 'D') {
            order = sort.DESC;
        }

        switch (order) {
            case ASCE:
                for (int i = 0; i < a.length - 1; i++) {
                    for (int j = 0; j < a.length - 1; j++) {
                        if (a[j].getServiceDesc().compareTo(a[j + 1].getServiceDesc()) > 0) {

                            Service temp = new Service(a[j].getServiceDesc(), a[j].getPrice(), a[j].getMinutes());
                            a[j] = new Service(a[j + 1].getServiceDesc(), a[j + 1].getPrice(), a[j + 1].getMinutes());
                            a[j + 1] = new Service(temp.getServiceDesc(), temp.getPrice(), temp.getMinutes());
                        }

                    }

                }
                break;
            case DESC:
                for (int i = 0; i < a.length - 1; i++) {
                    for (int j = 0; j < a.length - 1; j++) {
                        if (a[j].getServiceDesc().compareTo(a[j + 1].getServiceDesc()) < 0) {

                            Service temp = new Service(a[j].getServiceDesc(), a[j].getPrice(), a[j].getMinutes());
                            a[j] = new Service(a[j + 1].getServiceDesc(), a[j + 1].getPrice(), a[j + 1].getMinutes());
                            a[j + 1] = new Service(temp.getServiceDesc(), temp.getPrice(), temp.getMinutes());
                        }

                    }
                }
                break;
            default:
                System.out.println("something went wrong!");

        }
    }

    public static void display(Service[] array) {
        for (Service array1 : array) {
            System.out.println(array1.getServiceDesc());
            System.out.println(array1.getPrice());
            System.out.println(array1.getMinutes());
            System.out.println(" ");
        }
    }
}
