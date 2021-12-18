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
public class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(double annualSalary, String name) {
        super(name);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    @Override
    public void getWeeklySalary(){
        double weeklysalary = annualSalary/52;
        System.out.println("Weekly Salary is: "+ weeklysalary);
    }
}
