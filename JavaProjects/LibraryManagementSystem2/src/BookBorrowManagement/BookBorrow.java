/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookBorrowManagement;

import BooksManagement.Book;
import PersonManagement.Student;
import java.time.LocalDate;

/**
 *
 * @author Michael
 */
public class BookBorrow {
    private Book book;
    private Student borrower;
    LocalDate borrowDate;
    LocalDate returnDueDate;
    LocalDate returnDate;
    public BookBorrow(Book book,Student st,LocalDate returnDueDate){
        this.book=book;
        this.borrower=st;
        this.borrowDate=LocalDate.now();
        this.returnDueDate=returnDueDate;                
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getBorrower() {
        return borrower;
    }

    public void setBorrower(Student borrower) {
        this.borrower = borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDueDate() {
        return returnDueDate;
    }

    public void setReturnDueDate(LocalDate returnDueDate) {
        this.returnDueDate = returnDueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    
    
}
