/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem2;

import BooksManagement.Book;
import PersonManagement.Student;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Michael
 */
public class LibraryManagementSystem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate dob = LocalDate.parse("2012-03-29");
        System.out.println("Year: "+dob.getYear());
        System.out.println(dob);
        
//        Library MITLibrary = new Library("Auckland","9am to 5pm","101010");
//        ArrayList<String> authors=new ArrayList<String>();
//        authors.add("Louis");
//        authors.add("Thomas");
//        MITLibrary.addBook(new Book(100,"Java","A",new Date(),authors,true,"CS"));
//        MITLibrary.addBook(new Book(200,"Trash","D",new Date(),authors,true,"RS"));
//        MITLibrary.addBook(new Book(400,"Yeonwoo","B",new Date(),authors,true,"SS"));
//        MITLibrary.addBook(new Book(500,"TET When","C",new Date(),authors,true,"TS"));
//        
//        Print all the books
//        ArrayList<Book> stock=MITLibrary.getBooks();
//        for(Book b: stock){
//           b.printDetails();
//        }
//        issue book
//        Student borrower = new Student(10,"Louis","Akl","louis@trashmail.com");
//        Book bk=MITLibrary.searchBookByTitle("TET When");
//        MITLibrary.issueBook(bk, borrower, LocalDate.now());
//       
//        for(Book b: stock){
//           b.printDetails();
//        }
//        
//        MITLibrary.returnBook(bk);
//        
//        for(Book b: stock){
//           b.printDetails();
//        }
//      Book output=MITLibrary.searchBookByTitle("Java");
//      if(output == null){
//          System.out.println("Book not found");
//      }else{
//              System.out.println("We found book");
//              }
    }
    
}
