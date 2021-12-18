/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousedemo;

/**
 *
 * @author Michael
 */
public class MouseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mouse m=new Mouse(1234,"black",50);
        
        System.out.println("Serial Number :" + m.getNumber());
        System.out.println("Colour :" + m.getColour());
        System.out.println("Price :" + m.getPrice());
        
        m.setNumber(9876);
        m.setColour("Blue");
        m.setPrice(90);
        
        System.out.println("Serial Number :" + m.getNumber());
        System.out.println("Colour :" + m.getColour());
        System.out.println("Price :" + m.getPrice());
        
        
    }
    
}
