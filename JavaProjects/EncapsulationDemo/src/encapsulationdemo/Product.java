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
public class Product {
     private int code;
     private String name;
     private double price;
    
    public Product(int code,String name, double price){
        this.code=code; this.name=name; this.price=price;
    }
    //Getter
     public int getCode(){
         return code;
     }
     public String getName(){
         return name;
     }
     public double getPrice(){
         return price;
     }
     
     //Setter
     public void setCode(int value){
      this.code = value;
     }
     public void setName(String name){
     this.name=name;
     }
     public void setPrice(double price)
     {
     if(price>=0 && price <=10000)
     {
     this.price=price;
     }
     
     }
    
}
