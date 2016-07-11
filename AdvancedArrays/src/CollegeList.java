
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
public class CollegeList {
    public static void main(String[] args) {
        CollegeEmployee[] coll = new CollegeEmployee[3];
        Faculty[] fac = new Faculty[3];
        Student[] stud = new Student[3];
        boolean finished = false;
        int CollegeCounter = 0;
        int FacultyCounter = 0;
        int studentCounter = 0;
        
        do {
            if(CollegeCounter == coll.length&&FacultyCounter ==fac.length&&studentCounter == stud.length){
            finished = true;
        }
              System.out.println("Space left C:" +(coll.length-CollegeCounter)+"\nF: "+(fac.length-FacultyCounter)+"\nS:"+(stud.length-studentCounter));
        String dataType = JOptionPane.showInputDialog("Enter which data type you want to fill \n \"C\" CollegeEmployee \"F\" Faculty \"S\" Student" ).toUpperCase();
        
        switch(dataType){
            case "C":
                
                if(CollegeCounter == coll.length){
                    System.out.println("**Cant enter CollegeEmployee its full!");
                break;
                }
                else{
                coll[CollegeCounter] = new CollegeEmployee();
                coll[CollegeCounter].getInfo();
                CollegeCounter++;
                break;
                }
            case "F":
                if(FacultyCounter == fac.length){
                    System.out.println("Cant enter faculty its full");
                    break;
                }
                else{
                    fac[FacultyCounter] = new Faculty();
                    fac[FacultyCounter].getInfo();
                    FacultyCounter++;
                    break;
                }
            case "S":
                if(studentCounter == stud.length){
                    System.out.println("Cant enter student its full");
                    break;
                }
                else{
                    stud[studentCounter] = new Student();
                    stud[studentCounter].getInfo();
                    studentCounter++;
                    break;
                }
            case "Q":
                finished = true;
                break;
        }
        }while(!finished);
        
        if(finished){
            System.out.println("College Employee"); 
            for (CollegeEmployee col : coll) {
                   
                col.display();
                    System.out.println(" ");
                }
            System.out.println("Faculties");
            for (Faculty fa : fac) {
                
                fa.display();
                System.out.println(" ");
            }
            System.out.println("Students ");
            for (Student student : stud) {
                
                student.display();
                System.out.println(" ");
            }
        }
    }
    
    
}
