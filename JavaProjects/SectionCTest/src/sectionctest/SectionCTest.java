/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectionctest;

/**
 *
 * @author Michael
 */
public class SectionCTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FullTimeEmployee fte = new FullTimeEmployee(70000, "Michael");
        PartTimeEmployee pte = new PartTimeEmployee(16.50, 30, "Michael");
        Bike bike = new Bike("Blue", "Mountain");
        
        pte.getWeeklySalary();
        fte.getWeeklySalary();
        bike.ride();
    }
    
}
