/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregationdemo;

/**
 *
 * @author Michael
 */
public class AggregationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Engine e = new Engine(1500, "ABC123", true);
        Car c= new Car("Sunny", "Nissan", 15000, "White", e);
        
        //dislay the derails of the car
        
        System.out.println("Make :" + c.getMake());
        System.out.println("Model :" + c.getModel());
        System.out.println("Price :" + c.getPrice());
        System.out.println("Colour :" + c.getColour());
        
        Engine engine = c.getEngine();
        System.out.println("Car engine number :"+ engine.getNumber());
        System.out.println("Car engine size :"+ engine.getSize());
        System.out.println("Is car engine petrol? :"+ engine.getIsPetrol()); 
     
    }
    
}
