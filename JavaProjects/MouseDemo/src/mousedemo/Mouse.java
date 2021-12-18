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
public class Mouse {
    private int serialNumber;
    private String colour;
    private double price;
    
    public Mouse(int sn, String colour, double price){
    this.serialNumber=sn; this.colour=colour; this.price=price;
    }
    
    public int getNumber(){
        return serialNumber;
    }
    public String getColour(){
        return colour;
    }
    public double getPrice()
    {     
      return price;
       
    }
    
    public void setNumber(int value){
      this.serialNumber = value;
     }
     public void setColour(String colour){
     this.colour=colour;
     }
     public void setPrice(double price)
     {
     if(price>=10 && price <=500)
     {
     this.price=price;
     }
    
     }

}
