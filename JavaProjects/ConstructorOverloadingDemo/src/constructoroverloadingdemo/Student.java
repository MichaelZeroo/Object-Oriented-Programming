/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloadingdemo;

/**
 *
 * @author Michael
 */
public class Student {
    private int id;
    private String name;
    private String address;
    private char gender;
    private String phone;
    
    public Student (int is, String name, String address, char gender, String phone){
        this.id=id; this.name=name; this.address=address; this.setGender(gender); this.phone=phone;
    }
    
    public Student (int is, String name, String address, char gender){
        this.id=id; this.name=name; this.address=address; this.setGender(gender); this.phone="Phone number is not provided by student";
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void printDetails(){
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Address: "+ getAddress());
        System.out.println("Gender: "+ getGender());
        System.out.println("Phone: "+ getPhone());
    }
}
