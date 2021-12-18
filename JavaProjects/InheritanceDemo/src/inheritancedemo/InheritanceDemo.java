/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

/**
 *
 * @author Michael
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chair c = new Chair("Cl","Black","ABC",200,true);
        System.out.println("name: "+ c.getName());
        System.out.println("colour: "+ c.getColour());
        System.out.println("make: "+ c.getMake());
        System.out.println("price: "+ c.getPrice());
        System.out.println("Is movable: "+ c.isMovable());
        
        Table t = new Table("Round Table","White","ADC",300,"Round",3);
        System.out.println("name: "+ t.getName());
        System.out.println("Colour: "+ t.getColour());
        System.out.println("Make: "+ t.getMake());
        System.out.println("Price: "+ t.getPrice());
        System.out.println("Shape: "+ t.getShape());
        System.out.println("Legs: "+ t.getLegs());
        
        
    }
    
}
