/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guido
 */
public  abstract class Division {
    protected String name;
    protected String number;
    public abstract void display();
    
    public Division(String name,String number){
        this.name = name;
        this.number = number;
    }
}
