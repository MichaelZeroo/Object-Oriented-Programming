/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktestsolution;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Car {
    private String colour;
    private int engineSize;
    private String make;
    private String model;
    
    public void run(){
        System.out.println("Car Running");
    }
    

    public Car(String colour, int engineSize, String make, String model) {
        this.colour = colour;
        this.engineSize = engineSize;
        this.make = make;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
