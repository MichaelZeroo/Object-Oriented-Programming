/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpreparation;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Shoe {
    private String model;
    private String colour;
    private double pricePerShoe;
    private int quantity;

    public Shoe(String model, String colour, double pricePerShoe, int quantity) {
        this.model = model;
        this.colour = colour;
        this.setPricePerShoe(pricePerShoe);
        this.setQuantity(quantity);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPricePerShoe() {
        return pricePerShoe;
    }

    public void setPricePerShoe(double pricePerShoe){
     if(pricePerShoe>=0 && pricePerShoe <=1000)
     {
     this.pricePerShoe=pricePerShoe;
     }
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0 && quantity <=50){
        this.quantity=quantity;
        }
    }          
        
    public double totalPrice(){  
        return pricePerShoe*quantity;
    }
    
    public void printDetails(){
        System.out.println("Model: "+model);
        System.out.println("Colour: "+colour);
        System.out.println("Price Per Shoe: "+pricePerShoe);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+totalPrice());
        
    }

}
