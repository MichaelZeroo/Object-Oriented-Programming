/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpreparation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class TestPreparation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shoe> stock= new ArrayList<Shoe>();
        
        Scanner input=new Scanner(System.in);
        for(int i=0;i<4;i++){
        System.out.println("Please enter shoe model");
        String model = input.next();
        System.out.println("Please enter shoe colour");
        String colour = input.next();
        System.out.println("Please enter shoe price");
        double price = input.nextDouble();
        System.out.println("Please enter shoe quantity");
        int quantity = input.nextInt();
        
        stock.add(new Shoe(model,colour,price,quantity));
        
    }
        for(Shoe s: stock){
            s.printDetails();
        }
        System.out.println("Please enter model");
        String model=input.next();
        System.out.println("The shoes matching with the given model");
        for(Shoe s: stock)
        {
            if(s.getModel()==model)
            {
                s.printDetails();
            }
        }
       
    }
    
}
