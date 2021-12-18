/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem2;

import BookBorrowManagement.BookBorrow;
import BooksManagement.Book;
import PersonManagement.Student;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Library {
    private String location;
    private String openingHours;
    private String phone;
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<BookBorrow> borrowRecords=new ArrayList<BookBorrow>();

    public Library(String location, String openingHours, String phone) {
        this.location = location;
        this.openingHours = openingHours;
        this.phone = phone;
    }
    
    public void printDetails(){
        System.out.println("Location: "+ location);
        System.out.println("Opening Hours: "+ openingHours);
        System.out.println("Phone: "+ phone);
    }
    
    public void addBook(Book bk){
        books.add(bk);
    }
    
    public ArrayList<Book> getBooks(){
        return books;
    }
    
    public Book searchBookByTitle(String title){
        Book found=null;
        for(Book b : books){
            if(b.getTitle()==title){
                found=b;
                break;
            }
        }
        return found;
    }
    
    public Book searchBookByCode(int code){
        Book found1 =null;
        for(Book b : books){
            if(b.getCode()==code){
                found1=b;
                break;
            }
        }
        return found1;
    }
    
    public void issueBook(Book bk, Student borrower, LocalDate returnDueDate){
        BookBorrow record = new BookBorrow(bk,borrower,returnDueDate);
        borrowRecords.add(record);
        bk.issued();
        System.out.println(bk.getTitle() + " Book has been "+"issued succesfully,enjoy");
    }
    
    public void returnBook(Book bk){
        for(BookBorrow rec : borrowRecords){
            Book temp=rec.getBook();
            if(temp.getCode()==bk.getCode() && rec.getReturnDate()==null){
                rec.setReturnDueDate(LocalDate.now());
                temp.returned();
                break;
            }
            
        }
        System.out.println("Book has been returned succesfully");
    }
}
