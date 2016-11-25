/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public class ArrayStructures {
    private int[] theArray = new int[50];
    
    private int arraySize = 10;
    
    public void generateRandomArray(){
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }
    
    public void printArray(){
        
        for (int i = 0; i < arraySize; i++) {
            System.out.print("-----");
        }
        System.out.println("");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " +i +"  ");
        }
        System.out.println("");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("-----");
        }
        System.out.println("");
            for (int i = 0; i < arraySize; i++) {
                System.out.print("| " +theArray[i] +" ");
        }
            System.out.println("");
                for (int i = 0; i < arraySize; i++) {
            System.out.print("-----");
        }
                System.out.println("");
    }
    
    public int getValueAtIndex(int index){
        if (index < arraySize) return theArray[index];
        
        return 0;
    }
    
    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;
        
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
            }
        
        }
        
        return false;
        
    }
    
    public void insertValue(int value){
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }
    
    public void deleteIndex(int index){
        if (index < arraySize) {
            for (int i = index; i < (arraySize-1); i++) {
                theArray[i] =  theArray[i+1];
            }
            arraySize--;
        }
    }
    
    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexsWithValue = "";
        
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                indexsWithValue+= i + " ";
            }
        }
        
        if (!valueInArray) {
            indexsWithValue = "NONE";
        }
        
        System.out.println("The Value was Found in the Following: " + indexsWithValue);
        System.out.println();
        return indexsWithValue;
    }   

    public void bubbleSort(){
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                //change for asend and desc
                if (theArray[j] > theArray[j+1]) {
                   swapValues(j,j+1); 
                }
                
            }
        }
    }
    
    public void swapValues(int indexOne, int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void binarySearchForValue(int value){
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (theArray[middleIndex] < value){
                System.out.println("Middle is lower than value");
                lowIndex = middleIndex + 1;
            } 
            else if(theArray[middleIndex] > value){
                System.out.println("Middle is higher than value");
                highIndex = middleIndex-1;
            } 
            else{
                System.out.println("Found a match for "+ value+ " at index "+ middleIndex);
                lowIndex = highIndex+1;
            }
       
        }   
     
    }
    
    public void selectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = i; j < arraySize; j++) {
                if (theArray[minimum] > theArray[j]) {
                    minimum = j;
                }
            }
            swapValues(i, minimum);
        }
        
    }
    
    public void insertionSort(){
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];
            
            while ((j>0)&& (theArray[j-1] > toInsert)) {                
                theArray[j] = theArray[j-1];
            }
            
            theArray[j] = toInsert;
                   
        }
    }
    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();
        
        newArray.generateRandomArray();
        System.out.println("Created Array");
        newArray.printArray();
//        System.out.println(newArray.getValueAtIndex(3));
//        System.out.println(newArray.doesArrayContainThisValue(11));
//        newArray.insertValue(50);
//        newArray.deleteIndex(0);
//        newArray.linearSearchForValue(11);
//        newArray.bubbleSort();
//        newArray.binarySearchForValue(13);
        System.out.println("Modified Array");
        newArray.printArray();
        
    }
}
