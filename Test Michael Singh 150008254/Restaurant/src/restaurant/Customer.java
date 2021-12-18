/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Michael
 */
public class Customer {
    private String name;
    private String address;
    private char gender;
    private boolean category;
    private String phone;
    private String email;

    public Customer(String name, String address, char gender, boolean category, String phone, String email) {
        this.name = name;
        this.address = address;
        this.setGender(gender);
        this.category = category;
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name, String address, char gender, boolean category, String email) {
        this.name = name;
        this.address = address;
        this.setGender(gender);
        this.category = category;
        this.email = email;
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

    public char getGender() {
        return gender;
    }

     public void setGender(char gender) {
        if(gender == 'm'){
        this.gender = gender;
        }else if(gender == 'M'){
            this.gender=gender;
        }else if(gender == 'f'){
            this.gender=gender;
        }else if(gender == 'F'){
            this.gender=gender;
        }
    }

    public boolean isCategory() {
        return category;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void getDetail(){
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Gender: "+ gender);
    }
    
}
