/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktestsolution;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
abstract public class Person {
    private String name;
    private String email;
    private int phone;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Person(String name, String email, int phone, Car car) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cars.add(car);
    }
    
    public void addNewCar(Car car){
        this.cars.add(car);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public abstract void introduce();
}
