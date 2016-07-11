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
public class Student {

    String idNumber;
    CollegeCourse[] course = new CollegeCourse[5];

    public CollegeCourse getCourse(int i) {
        return course[i];
    }

    public void setCourse(CollegeCourse f, int i) {
        course[i] = f;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
}