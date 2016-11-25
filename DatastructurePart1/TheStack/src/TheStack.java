
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guido
 */
public class TheStack {

    /**
     * @param args the command line arguments
     */
    private final String[] stackArray;

    private final int stackSize;

    private int topOfStack = -1;

    TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;

            stackArray[topOfStack] = input;
        } else {
            System.out.println("Sorry but the stack is full");
            displayTheStack();

            System.out.println("PUSH " + input + "was Added to the stack");
        }

    }

    public String pop(){
        if (topOfStack >= 0) {
            
            System.out.println("POP "+ stackArray[topOfStack]+ " Was removed");
            
            stackArray[topOfStack] = "-1";
            displayTheStack();
            return stackArray[topOfStack--];
        }else{
            displayTheStack();
            System.out.println("Sorry but the staac is empty");
            return "-1";
        }
    }
    
    public String peek(){
        displayTheStack();
        
        System.out.println("Peek: " + stackArray[topOfStack] + " is at the top of the stack");
        return stackArray[topOfStack];
    }
    
    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        System.out.println("Pushing in values:");
        for (String string : tempString) {
            System.out.print(string+ " ");
        }
        System.out.println();
        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
        
        displayTheStack();
    }
    
    public void popAll(){
        for (int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }
    public void displayTheStack() {

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            if (stackArray[n].equals("-1")) {
                System.out.print("|     ");
            } else {
                System.out.print(String.format("| %2s " + " ", stackArray[n]));
            }

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("15");
        theStack.peek();
        theStack.pushMany("12 15 34 45 69");
        theStack.popAll();

    }

}
