/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import BooksManagement.Book;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Library {
    private String location;
    private String openingHours;
    private String phoneNumber;
    private ArrayList<Book> books;

    public Library(String location, String openingHours, String phoneNumber) {
        this.location = location;
        this.openingHours = openingHours;
        this.phoneNumber = phoneNumber;
        books=new ArrayList<Book>();
    }
    
    
    
    public void addBook(Book bk){
        books.add(bk);
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    
    
}
