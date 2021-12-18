/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectionctest;

/**
 *
 * @author Michael
 */
public class Bike {
    private String colour;
    private String make;

    public Bike(String colour, String make) {
        this.colour = colour;
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    
    public void ride(){
        System.out.println("Riding bike");
    }
}
