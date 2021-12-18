/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktestsolution;

/**
 *
 * @author Michael
 */
public class Professor extends Person{
    private int staffID;
    private double salary;

    public Professor(int staffID, double salary, String name, String email, int phone, Car car) {
        super(name, email, phone, car);
        this.staffID = staffID;
        this.salary = salary;
    }
    
    @Override
    public void introduce(){
        System.out.println("My staff ID is "+staffID+", name: "+getName()+", Email: "+getEmail() + ", and salary is "+salary);
    }

    public int getStaffID() {
        return staffID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    
    
}
