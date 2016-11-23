
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guido
 */
public class Mode {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int numarray[] = {1, 2, 3, 3, 5, 3, 7, 8, 5, 8, 6, 9, 3, 1, 7, 8, 9};
        mode(numarray);

    }

    public static void mode(int[] arr) {
        int count1 = 1;
        int count2 = 1;
        int popular = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Comparing " + arr[i] + " and " + arr[j]);
                if (arr[i] == arr[j]) {

                    count2++;
                    System.out.println("incrementing count: " + count2);
                    if (count2 > count1) {

                        count1 = count2;
                        popular = arr[i];
                        System.out.println("mode of array is: " + popular);
                    }
                }

            }
            count2 = 1;
        }

        System.out.println("popular one is " + popular);

    }
}
