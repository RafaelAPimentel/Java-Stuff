/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcomponents;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Guido
 */
public class JResortCalculator extends JFrame implements ItemListener{

    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;
    
    JCheckBox weekendBox = new JCheckBox("Weekend premium $"+WEEKEND_PREMIUM,false);
    JCheckBox breakfastBox = new JCheckBox("Breakfast $"+BREAKFAST_PREMIUM,false);
    JCheckBox golfBox = new JCheckBox("Gold $"+GOLF_PREMIUM,false);
    
    JLabel resortLabel = new JLabel("Reort Price Calculator");
    JLabel priceLabel = new JLabel("The price for the stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $"+BASE_PRICE+".");
    JLabel optionExplainLabel2 = new JLabel("check the options you want");
    
    public JResortCalculator(){
        super("Resort Price Estimator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(priceLabel);
        add(totPrice);
        
        totPrice.setText("$"+totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfBox.addItemListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent event){
        Object source = event.getSource();
        int select = event.getStateChange();
        if(source==weekendBox)
            if (select==ItemEvent.SELECTED)
                totalPrice += WEEKEND_PREMIUM;
            else
                totalPrice -= WEEKEND_PREMIUM;
        else if(source==breakfastBox)
            if (select==ItemEvent.SELECTED)
                totalPrice += BREAKFAST_PREMIUM;
            else
                totalPrice -= BREAKFAST_PREMIUM;
        else if(source==golfBox)
            if (select==ItemEvent.SELECTED)
                totalPrice += GOLF_PREMIUM;
            else
                totalPrice -= GOLF_PREMIUM;
        totPrice.setText("$"+totalPrice);
        
    }
    
    public static void main(String[] args) {
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
