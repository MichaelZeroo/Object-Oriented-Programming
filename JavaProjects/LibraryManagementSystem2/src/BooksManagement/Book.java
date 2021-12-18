/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BooksManagement;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Michael
 */
public class Book {
    private int code;
    private String title;
    private String publisher;
    private Date releaseDate;
    private ArrayList<String> authors;
    private boolean isAvailable;
    private String category;

    public Book(int code, String title, String publisher, Date releaseDate, ArrayList<String> authors, boolean isAvailable, String category) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.authors = authors;
        this.isAvailable = isAvailable;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void issued(){
        isAvailable=false;
    }
    
    public void returned(){
    isAvailable=true;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void printDetails(){
            System.out.print("Title: "+getTitle());
            System.out.print(",Release Date: "+getReleaseDate());
            System.out.print(",Publisher: "+getPublisher());
            System.out.println(",Is available? "+ isAvailable);
                }
    
    
}
