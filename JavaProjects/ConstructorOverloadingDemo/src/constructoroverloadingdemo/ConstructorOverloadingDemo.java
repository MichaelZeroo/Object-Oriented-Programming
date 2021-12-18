/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloadingdemo;

/**
 *
 * @author Michael
 */
public class ConstructorOverloadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student st1=new Student(1,"Louis","Akl",'M',"1234");
        Student st2=new Student(1,"Hentai","Akl",'M');
        
        st1.printDetails();
        st2.printDetails();
        
    }
    
}
