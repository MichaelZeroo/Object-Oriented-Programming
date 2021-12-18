/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnitureconstuctoroverloadingexample;
import java.util.ArrayList;
/**
 *
 * @author Michael
 */
public class FurnitureConstuctorOverloadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Furniture f1=new Furniture("Chair","Black",39.99,6);
//        Furniture f2=new Furniture("Couch","White",89.99);
//        
//        f1.printDetail();
//        f2.printDetail();
        
        ArrayList<Furniture> items=new ArrayList<Furniture>();
        items.add(new Furniture("Table","White",300));
        items.add(new Furniture("Vhair","White",350));
        items.add(new Furniture("Bed","Black",500));
        items.add(new Furniture("Table","Blue",200));
        items.add(new Furniture("Chair","Red",100));
        
        for(Furniture item: items){
            item.printDetail();
        }
    }
    
}
