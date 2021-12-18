/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercise;

/**
 *
 * @author Michael
 */
public class Employee {
    private String name;
    private String address;
    private String email;
    private char gender;

    public Employee(String name, String address, String email, char gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char isGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void printDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Email: "+getEmail());
        System.out.println("Gender: "+isGender());
    }
}
