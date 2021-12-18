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
public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int weeklyHours;

    public PartTimeEmployee(double hourlyRate, int weeklyHours, String name) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }
    
    @Override
    public void getWeeklySalary(){
        double weeklysalary = hourlyRate*weeklyHours;
        System.out.println("Weekly Salary is: "+ weeklysalary);
    }
}
