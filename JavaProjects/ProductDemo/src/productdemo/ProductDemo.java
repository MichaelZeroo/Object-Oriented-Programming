/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productdemo;

/**
 *
 * @author Michael
 */
public class ProductDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product c1=new Product("couch", 300, 80.3, "black","Random Couch Maker",6);
                
        System.out.println("Name :" + c1.name);
        System.out.println("Price :" + c1.price);
        System.out.println("Weight :" + c1.weight);
        System.out.println("Colour :" + c1.colour);
        System.out.println("Make :" + c1.make);
        System.out.println("Quantity :" + c1.quantity);
        
    }
    
}
