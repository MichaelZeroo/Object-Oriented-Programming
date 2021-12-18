/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdmo;

/**
 *
 * @author Michael
 */
public class ClassDmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating object of Class Computer 
        Computer c1=new Computer("hp123", "HP", "White",2010,2.6,1234);
//        c1.brand="HP";
//        c1.code=1234;
//        c1.colour="white";
//        c1.model="Hp123";
//        c1.price=2000;
//        c1.warrantyPeriod=2.6;
        
        //Display the stored values in above object
        
        System.out.println("Brand :"+ c1.brand);       
        System.out.println("Code :"+ c1.code); 
        System.out.println("Model :"+ c1.model); 
        System.out.println("Price : $"+ c1.GetPrice()); 
        System.out.println("Warrant :"+ c1.warrantyPeriod); 
        
        
    }
    
    
    
}
