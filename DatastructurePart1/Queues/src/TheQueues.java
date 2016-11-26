
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
public class TheQueues {

    /**
     * @param args the command line arguments
     */
    
    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;
    
    TheQueues(int size){
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray,"-1");
        
    }
    
    public void insert(String input){
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            
            System.out.println(Arrays.toString(queueArray));
        }else{
            System.out.println("Que is full");
        }
    }
    
    public void remove(){
        if (numberOfItems > 0) {
            queueArray[front] = "-1";
            numberOfItems--;
            front++;
            System.out.println(Arrays.toString(queueArray));
        }else{
            System.out.println(Arrays.toString(queueArray));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TheQueues theQueues = new TheQueues(10);
        
        theQueues.insert("10");
        theQueues.insert("15");
        theQueues.insert("20");
        theQueues.remove();
        theQueues.remove();
        theQueues.insert("35");
    }
    
}
