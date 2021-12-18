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
public class Table extends FurnitureItem{
    private String shape;
    private int legs;
    
    public Table(String name, String colour, String make, double price, String shape, int legs){
        super(name,colour,make,price);
        this.shape=shape;
        this.legs=legs;             
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    
}
