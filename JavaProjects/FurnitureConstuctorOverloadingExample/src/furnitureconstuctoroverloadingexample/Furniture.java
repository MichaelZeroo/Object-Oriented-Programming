/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnitureconstuctoroverloadingexample;

/**
 *
 * @author Michael
 */
public class Furniture {
   private String name;
   private String colour;
   private double price;
   private int warrantyInformation;

    public Furniture(String name, String colour, double price, int warrantyInformation) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.warrantyInformation = warrantyInformation;
    }

    public Furniture(String name, String colour, double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarrantyInformation() {
        return warrantyInformation;
    }

    public void setWarrantyInformation(int warrantyInformation) {
        this.warrantyInformation = warrantyInformation;
    }
   
    public void printDetail(){
        System.out.println("Name: "+ getName());
        System.out.println("Colour: "+ getColour());
        System.out.println("Price: "+ getPrice());
        if(warrantyInformation == 0){
            System.out.println("No warranty");
        }else{
        System.out.println("Warranty Infornation: "+ getWarrantyInformation());
        }
    }
   
}
