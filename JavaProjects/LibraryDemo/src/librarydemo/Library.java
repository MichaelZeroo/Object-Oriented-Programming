/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydemo;

/**
 *
 * @author Michael
 */
public class Library {
    private String name;
    private String location;
    private String openingHours;
    private int phoneNumber;
    private Book book;

    public Library(String name, String location, String openingHours, int phoneNumber, Book book) {
        this.name = name;
        this.location = location;
        this.openingHours = openingHours;
        this.phoneNumber = phoneNumber;
        this.book=book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
    
}
