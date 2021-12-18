/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingexercise;

import java.time.LocalDate;

/**
 *
 * @author Michael
 */
public class FurnitureItem {
    
    private String name;
    private double price;
    private LocalDate manufactureDate;
    private int warrantyPeriod;

    public FurnitureItem(String name, double price, LocalDate manufactureDate, int warrantyPeriod) {
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
    
}
