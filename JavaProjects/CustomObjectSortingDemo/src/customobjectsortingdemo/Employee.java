/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customobjectsortingdemo;

/**
 *
 * @author Michael
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;
    
    public int compareTo(Employee em){
        if(this.salary>em.getSalary())
        {
            return 1;
        }else if (this.salary<em.getSalary()){
            return -1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return  "ID: "+ id+", Name: "+name+", Salary: "+salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
