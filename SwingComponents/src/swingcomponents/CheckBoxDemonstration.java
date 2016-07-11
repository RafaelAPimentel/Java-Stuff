package swingcomponents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Guido
 */
public class CheckBoxDemonstration extends JFrame implements ItemListener
{
    ArrayList arr = new ArrayList();
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel("What would you like to drink");
    JCheckBox coffee = new JCheckBox("coffee",false);
    JCheckBox cola = new JCheckBox("cola",false);
    JCheckBox milk = new JCheckBox("milk",false);
    JCheckBox water = new JCheckBox("water",false);
    JLabel out = new JLabel("");
    String output,insChosen;
    public CheckBoxDemonstration()
    {
        super("CheckBox Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label.setFont(new Font("Arial",Font.ITALIC,22));
        coffee.addItemListener(this);
        cola.addItemListener(this);
        milk.addItemListener(this);
        water.addItemListener(this);
        add(label);
        add(coffee);
        add(cola);
        add(milk);
        add(water);
        add(out);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
       //actions based on choice go here
        
        Object source = e.getItem();
        if (source == coffee){
            int select = e.getStateChange();
            if(select == ItemEvent.SELECTED){
                arr.add("coffee");
            }
            else{
                arr.remove("coffee");
            }
            
        
        }
        else if(source == cola){
        int select = e.getStateChange();
            if(select == ItemEvent.SELECTED){
                arr.add("cola");
            }
            else{
                arr.remove("cola");
            }
            
        }
        else if(source == milk){
        int select = e.getStateChange();
            if(select == ItemEvent.SELECTED){
                arr.add("milk");
            }
            else{
                arr.remove("milk");
            }
            
        }
        else if(source == water){
        int select = e.getStateChange();
            if(select == ItemEvent.SELECTED){
                arr.add("water");
            }
            else{
                arr.remove("water");
            }
            
        }
        
        out.setText("you've choosen: "+ arr.toString());
      
    }
    
    public static void main(String[] args) {
        final int FRAME_WIDTH =350;
        final int FRAME_HEIGHT = 120;
        CheckBoxDemonstration frame = new CheckBoxDemonstration();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setVisible(true);
    }

}
