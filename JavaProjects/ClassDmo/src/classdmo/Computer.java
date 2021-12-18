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
public class Computer {
   String model;
   String brand;
   String colour;
   double price;
   double warrantyPeriod;
   int code;
   
   double GetPrice(){
       return price;
   }
  public Computer(String m,String b, String c, double p, double wp, int co){
      model=m; brand=b; colour=c; price=p; warrantyPeriod=wp; code=co; 
  }
   
}
