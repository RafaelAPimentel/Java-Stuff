/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atheniumexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Guido
 */
public class AtheniumExercise {

    /**
     * @param args the command line arguments
     */
    private static void gradeScores(List<Integer> Scores) {
        //sorts in order the list
        Collections.sort(Scores);
        //Reverses the order from greatest to least
        Collections.reverse(Scores);
        //create an empty 
        List<Integer> GradedGrades = new ArrayList<Integer>();
        List<String> LetterGrade = new ArrayList<String>();
        System.out.println("Score size:" + Scores.size() );
        System.out.println(Scores);
        
        //getting %20 of array size
        int range = (int) (Scores.size() * .2);
        
        if (range == 0) {
            range = 1;
        }
        System.out.println("Range: "+ range);
        //counter for when 
        int counter = 0;
        for (int i = 1; i <= Scores.size(); i++) {

            GradedGrades.add(Scores.get(i-1));
            switch (counter) {
                case 0:
                    LetterGrade.add("A");
                    break;
                case 1:
                    LetterGrade.add("B");
                    break;
                case 2:
                    LetterGrade.add("C");
                    break;
                case 3:
                    LetterGrade.add("D");
                    break;
                case 4:
                    LetterGrade.add("F");
                    break;
                default:
                    LetterGrade.add("F");
            }

            if (i == range || i % range == 0) {
                counter++;
            }
        }

        System.out.println(GradedGrades);
        System.out.println(LetterGrade);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> array = new ArrayList<Integer>();

        int lengthOfArray = (int) ((Math.random() * 30) + 1);
        for (int i = 0; i < lengthOfArray; i++) {
            int randomNumberForArray = (int) ((Math.random() * 100) + 1);
            array.add(randomNumberForArray);
        }
        gradeScores(array);
    }

}
