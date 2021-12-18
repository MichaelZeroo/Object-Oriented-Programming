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
public class LibraryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book b=new Book("Hentai", "Louis",3,true);
        Library l=new Library("Louis Hentai Library", "12 Hentai Street", "Mon-Sun: 9am-9pm", 23456789, b);
        
        System.out.println("Name :"+l.getName());
        System.out.println("Location :"+l.getLocation());
        System.out.println("Opening hours :"+l.getOpeningHours());
        System.out.println("Phone Number :"+l.getPhoneNumber());
        
        Book book=l.getBook();
        System.out.println("Title :"+ book.getTitle());
        System.out.println("Publisher :"+ book.getPublisher());
        System.out.println("Edition :"+ book.getEdition());
        System.out.println("Available? :"+ book.isStatus());
        
    }
    
}
