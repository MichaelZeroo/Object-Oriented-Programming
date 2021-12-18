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
public class Chair extends FurnitureItem {
    private boolean isMovable;
    
    public Chair(String name, String colour, String make, double price, boolean isMovable){
        super(name,colour,make,price);
        this.isMovable=isMovable;
    }

    public boolean isMovable() {
        return isMovable;
    }

    public void setIsMovable(boolean isMovable) {
        this.isMovable = isMovable;
    }
    
}
