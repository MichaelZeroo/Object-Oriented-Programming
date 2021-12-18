/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalresource;

/**
 *
 * @author Michael
 */
public class GlobalResource {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c = new Customer(3,"Michael","4 Marble Rd",'m',"Michael@gmail.com");
        
        System.out.println("ID: "+c.getId());
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Gender: "+c.getGender());
        System.out.println("Email: "+c.getEmail());
        
    }
    
}
