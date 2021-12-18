/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercise;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class ArrayListExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> data=new ArrayList<Employee>();
        
        data.add(new Employee("Louis","Akl","louis@gmail.com",'M'));
        data.add(new Employee("Nig","Akl","nig@gmail.com",'F'));
        data.add(new Employee("LUL","Akl","LUL@gmail.com",'M'));
        data.add(new Employee("monkaS","Akl","monkaS@gmail.com",'F'));
        
        for(Employee e: data){
            e.printDetails();
        }
                
        
    }
    
}
