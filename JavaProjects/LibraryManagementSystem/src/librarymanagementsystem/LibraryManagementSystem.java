/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import BooksManagement.Book;

/**
 *
 * @author Michael
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        book b=new Book();
        Library MITLibrary = new Library("Aukland", "9am-5pm", "9999999");
        
        MITLibrary.addBook(new Book(123,"Louis","Is A Baka","3rd"));
        MITLibrary.addBook(new Book(123,"OMEGA","LUL","1st"));
        MITLibrary.addBook(new Book(123,"Louis","Is A Baka","4th"));
        
        for(Book bk:MITLibrary.getBooks()){
           b.printDetails();
        }
        
    }
    
}
