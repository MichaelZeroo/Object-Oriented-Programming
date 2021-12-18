/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalresource;

/**
 *
 * @author Michael
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private char gender;
    private String email;

    public Customer(int id, String name, String address, char gender, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.setGender(gender);
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
