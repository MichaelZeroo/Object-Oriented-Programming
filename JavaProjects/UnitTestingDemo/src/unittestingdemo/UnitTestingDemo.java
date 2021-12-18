/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingdemo;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author st14158
 */
public class UnitTestingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> students = new ArrayList<Student>();
 students.add(new Student(1,"a",100));
 students.add(new Student(5,"a",105));
 students.add(new Student(3,"a",90));
 students.add(new Student(2,"a",70));
        Collections.sort(students, Collections.reverseOrder());
        System.out.println(students);        
    }
    
}
