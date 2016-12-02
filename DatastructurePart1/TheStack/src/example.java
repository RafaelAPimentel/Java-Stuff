
import java.util.Arrays;
import java.util.Stack;
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
public class example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        input = "";
        input = JOptionPane.showInputDialog("Enter what you want to be in the stack array!\nIt will be seperated by space\nexit will close the program");
  
        while (!"exit".equals(input)){
            Stack<Integer> myStack = new Stack();
            if(input.equals("drop")){
                myStack.pop();
            }
            String[] inputValue = input.split(" ");
            for (String string : inputValue) {
                try {
                    myStack.add(Integer.parseInt(string));
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
            System.out.println(myStack);
            input = JOptionPane.showInputDialog("Enter another stack");
        }

        System.out.println("You have exited the program!");
    }
}
