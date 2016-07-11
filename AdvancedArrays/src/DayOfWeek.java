
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
public class DayOfWeek {

    /**
     * @param args the command line arguments
     */
    enum day {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
    public static String businessHours;
    public static void main(String[] args) {
        // TODO code application logic here
        displayDays();
        getInfo();
       
    }
    
    public static void getInfo(){
         String inputDay = JOptionPane.showInputDialog("Enter a day of the week");
        
        day search = day.valueOf(inputDay.toUpperCase());
        
        switch(search){
            case MONDAY:
                businessHours = "9-5";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            case TUESDAY:
                businessHours = "9-4";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
                
            case WEDNESDAY:
                businessHours = "9-3";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            case THURSDAY:
                businessHours = "10-4";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            case FRIDAY:
                businessHours = "11-4";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            case SATURDAY:
                businessHours = "Closed sorry";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            case SUNDAY:
                businessHours = "Closed 1 more day";
                JOptionPane.showMessageDialog(null,"Business hours are "+ businessHours);
                break;
            default:
                businessHours = "Something went wrong";
                
        }
    }
    public static void displayDays() {
        JOptionPane.showMessageDialog(null, "Days of the week"
                + "\nMonday,Tuesday,Wednesday,Thursday,Friday,\nSaturday,Sunday");
    }
}
