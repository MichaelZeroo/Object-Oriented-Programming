/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringdemo;

import java.time.LocalDate;

/**
 *
 * @author st14158
 */
public class Student {
   private int id;
   private String name;
   private String address;
   private char gender;
   private LocalDate enrollmentDate;

    public Student(int id, String name, String address, char gender, LocalDate enrollmentDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.enrollmentDate = enrollmentDate;
    }
   
   @Override
   public String toString()
   {
       return "ID: "+ id+ ", name: "+name + ", Address: "+ address + ", Gender: "+gender +", Enrollment Date: "+ enrollmentDate;
   }
   
   
    public Student(int id, String name, String address, char gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
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
        this.gender = gender;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
   
}
