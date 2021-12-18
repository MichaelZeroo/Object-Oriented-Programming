/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BooksManagement;

/**
 *
 * @author Michael
 */
public class Book {
    private int isbn;
    private String title;
    private String publisher;
    private String edition;
    private boolean isAvailable;

    public Book(int isbn, String title, String publisher, String edition) {
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
        this.isAvailable = true;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void issued(){
        isAvailable=false;
    }
    public void returned(){
        isAvailable=true;
    }
    
    public void printDetails(){
        System.out.println("ID: "+ isbn+", Name: "+title+", Address: "+publisher+", Edition: "+edition);
    }
}
