/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;
import java.util.ArrayList;
import StudentsManagement.Student;
import Table.Table;
/**
 *
 * @author Michael
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> data =new ArrayList<Student>();
        
        
        data.add(new Student(10,"abc","Auckland"));
        data.add(new Student(11,"Hit","NowNow"));
        data.add(new Student(12,"It","WowWow"));
        
        for(Student s: data)
        {
            s.printDetails();
        }
        
//        ArrayList<Table> data = new ArrayList<Table>();
//        
//        data.add(new Table("Black",100,10.5));
//        data.add(new Table("White",60,11.5));
//        data.add(new Table("Red",80,15.5));
//        
//        for(Table t: data){
//            System.out.println("Colour: " +t.getColour());
//            System.out.println("Price: " +t.getPrice());
//            System.out.println("Height: " +t.getHeight());
//        }
        
        
        
        
//        ArrayList<String> data = new ArrayList<String>();
//        
//        data.add("Louis");
//        data.add("Is");
//        data.add("A");
//        data.add("Hentai");
//        data.add("Baka");
//        
//        //Display values form above arraylist
//        for(String val: data)
//        {
//        System.out.println(val);
//        }
          



    }
    
}
