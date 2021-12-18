/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Customer> c1=new ArrayList<Customer>();
        ArrayList<Customer> c2=new ArrayList<Customer>();
        
        c1.add(new Customer("Michael","5 Akl City",'M',true,"12345","michael@gmail.com"));
        c1.add(new Customer("Louis","2 Akl City",'f',true,"987654","louis@gmail.com"));
        c2.add(new Customer("Demin","7 Akl City",'F',true,"demin@gmail.com"));
        c2.add(new Customer("Garry","6 Akl City",'m',true,"garry@gmail.com"));
        
        
        
        for(Customer c: c1){
            c.getDetail();
        }
        for(Customer c: c2){
            c.getDetail();
        }
        
    }
    
}
