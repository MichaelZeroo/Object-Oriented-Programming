/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringdemo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author st14158
 */
public class ToStringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();
    while(true){
   System.out.println("Please enter your id");
    int id = scan.nextInt();
    System.out.println("Please enter your name");
    String name= scan.next();
    System.out.println("Please enter your address");
    String address= scan.next();
    System.out.println("Please enter your gender, M or F");
    char gender= scan.next().charAt(0);   
    System.out.println("Please enter year value");
    int year = scan.nextInt();
    System.out.println("Please enter month");
    int month = scan.nextInt();
    System.out.println("Please enter days");
    int days = scan.nextInt();
    
    LocalDate ed = LocalDate.of(year, month, days);
    
   students.add(new Student(id,name,address,gender,ed));
   System.out.println("Do you want to enter more student records? if yes enter Y else N");
   char option = scan.next().charAt(0);
   if(option=='N' || option=='n'){
       break;
   }
    }
    
    //show all info
    for(Student s : students){
        System.out.println(s);
    }
    
    //show student record jan and feb
//    for(Student s: students){
//        LocalDate ed=s.getEnrollmentDate();
//        if(ed.getYear()==2018 && ed.getMonthValue()>=1 && ed.getMonthValue()<=02)
//        {
//            System.out.println(s);
//                    
//        }
//    }
    

//show student record enrolled after october 2017
    LocalDate fd= LocalDate.of(2017, Month.OCTOBER, 1);
    for(Student st: students){
        LocalDate ed = st.getEnrollmentDate();
        if(ed.isAfter(fd)){
            System.out.println(st);
        }
    }




    
//   System.out.println(st1);
//   
//  System.out.println("Enrollment Date: "+ st1.getEnrollmentDate());
   
//   Student st2 = new Student(11,"XYZ","Hamilton",'F');
//   System.out.println("Student 1 details: "+ st1);
//   System.out.println("Student 2 details: "+ st2);
        }
    
}
