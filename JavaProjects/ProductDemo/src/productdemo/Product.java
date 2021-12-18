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
public class Product {
    String name;
    double price;
    double weight;
    String colour;
    String make;
    int quantity;
           
    public Product(String n, double p, double w, String c, String m, int q){
        name=n; price=p; weight=w; colour=c; make=m; quantity=q;
}
    
}
