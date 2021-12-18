/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationdemo;

/**
 *
 * @author Michael
 */
public class EncapsulationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p=new Product(100,"Hplaptop",1999999);
                
        System.out.println("Code :" + p.getCode());
                System.out.println("Name :" + p.getName());
                        System.out.println("Price :" + p.getPrice());
                
                        
        p.setCode(200);
        p.setName("hp123");
        p.setPrice(1000);
        
        System.out.println("Code :" + p.getCode());
                System.out.println("Name :" + p.getName());
                        System.out.println("Price :" + p.getPrice());
    }
    
}
