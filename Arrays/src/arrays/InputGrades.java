/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Guido
 */
public class InputGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Student[] stud = new Student[1];
        
        
        
        for(int i=0;i<stud.length;i++){
            
            stud[i] = new Student();
            stud[i].setIdNumber(JOptionPane.showInputDialog("enter student id for student #"+ (i+1)));
            
            for(int j=0;j<stud[i].course.length;j++){
                CollegeCourse course = new CollegeCourse();
                stud[i].setCourse(course, j);
                
                stud[i].course[j].setCourseId(JOptionPane.showInputDialog("Enter course id for course # "+ (j+1)));
                
                
                boolean letter = false;
                while(!letter){
                    String letterGrade = JOptionPane.showInputDialog("Enter grade for class #" + (j+1));
                    
                    switch(letterGrade.charAt(0)){
                        case 'a':
                        case 'A':  
                        case 'b':
                        case 'B':
                        case 'c':
                        case 'C':
                        case 'd':
                        case 'D':
                        case 'f':
                        case 'F':
                            stud[i].course[j].setLetterGrade(Character.toUpperCase(letterGrade.charAt(0)));
                            letter = true;
                            break;
                        default:
                            letter = false;
                    }
                }
                                      
                                
                }
            }
            for(Student st : stud){
                System.out.println("Student number: "+st.getIdNumber()+"\n|~~~~~~~~~~|\n|REPORTCARD|\n|~~~~~~~~~~|");
            for (CollegeCourse course : st.course) {
                System.out.println("Class " + course.getCourseId() + " : " + course.getLetterGrade());
            }
            }
    
        }
        
       
    }
   
    

