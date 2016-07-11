/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Guido
 */
public class IceCreamCone {
    protected String flavor;
    protected int scoop;
    
    public IceCreamCone(String f,int l) {
        try {
            setFlavor(f);
        } catch (Exception e) {
            System.out.println("wrong flavor we suggest vanilla");
            
        }
        
        try {
            
            setScoop(l);
        } catch (IceCreamConeException ex) {
            System.out.println("scoop is greater than 3, so we'll give you three");
            
            System.out.println(ex.getMessage());
        }
    }
    
    public void setFlavor(String f)throws IceCreamConeException{
        String[] choice = {"Vanilla","Strawberry","Kiwi"};
        boolean inArray= false;
        for (String string : choice) {
            if(f.equalsIgnoreCase(string)){
                inArray = true;
                flavor = f;
                break;
            }     
        }
        
        if(!inArray){
            flavor = "vanilla";
            throw(new IceCreamConeException(" floavor not in list"));          
            
        }
        
        
    }
    
    public void setScoop(int s)throws IceCreamConeException{
        if(s>3){
            scoop = 3;
            throw(new IceCreamConeException(flavor+" "+ scoop));
            
        }
        else
            scoop = s;
    }
    
    public static void main(String[] arg){
        
            IceCreamCone one = new IceCreamCone("bone",5);
        
        
    }
}
