/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customobjectsortingdemo;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Michael
 */
public class CustomObjectSortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Employee> employee = new ArrayList<Employee>();
        
        employee.add(new Employee(10,"John",50000));
        employee.add(new Employee(7,"Louis",1000));
        employee.add(new Employee(8,"Thomas",30000));
        employee.add(new Employee(25,"Demin",70000));
        employee.add(new Employee(21,"Lulu",40000));
        
        //display before sorting 
        for(Employee em: employee){
            System.out.println(em);
        }
        
        Collections.sort(employee);
        
         for(Employee em: employee){
            System.out.println(em);
        }
        
        
        
        
        
        
        //sorting numbers
//        ArrayList<Integer> data = new ArrayList<Integer>();
//        
//        data.add(10);
//        data.add(20);
//        data.add(3);
        
// ArrayList<String> data = new ArrayList<String>();
//        
//        data.add("ABC");
//        data.add("XYZ");
//        data.add("CDE");
//
//        //print before sorting
//        for(String val: data){
//            System.out.println(val);
//        }
//        
//        //print after sorting in ascending order
//        Collections.sort(data);
//        for(String val: data){
//            System.out.println(val);
//        }
//        //print in descending order
//        Collections.sort(data,Collections.reverseOrder());
//        for(String val: data){
//            System.out.println(val);
//        }

          
        
    }
    
}
