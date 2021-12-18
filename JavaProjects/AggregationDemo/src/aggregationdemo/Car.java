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
public class Car {
    private String model;
    private String make;
    private double price;
    private String colour;
    private Engine engine;
    
    public Engine getEngine(){
        return engine;
    }
    public void setEngine(Engine newEngine){
        this.engine=newEngine;
    }
    
    public Car(String model, String make, double price, String colour, Engine engine){
        this.model=model; this.make=make; this.price=price; this.colour=colour; this.engine=engine;
    }
    
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public double getPrice(){
        return price;
    }
    public String getColour(){
        return colour;
    }
    
    public void setModel(String model){
        this.model=model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
