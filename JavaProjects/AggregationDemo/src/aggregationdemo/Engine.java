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
public class Engine {
    
    private double size;
    private String number;
    private boolean isPetrol;

    public Engine(double size, String number, boolean isPetrol) {
        this.size = size;
        this.number = number;
        this.isPetrol = isPetrol;
    }

    public double getSize() {
        return size;
    }

    public String getNumber() {
        return number;
    }

    public boolean getIsPetrol() {
        return isPetrol;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIsPetrol(boolean isPetrol) {
        this.isPetrol = isPetrol;
    }
    
    
           
    
}
