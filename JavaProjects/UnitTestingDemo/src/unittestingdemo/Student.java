/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingdemo;

/**
 *
 * @author st14158
 */
public class Student implements Comparable<Student>
{
 public int id;
 public String name;
 public double marks;
@Override
public String toString()
{
    return "ID: "+id+ ", name "+ name;
}
 
@Override
public int compareTo(Student s)
{
    
    if(s.id > this.id)
    {
        return 1;
    }else if (s.id< this.id)
    {
        return -1;
    }else
    {
        return 0;
    }
}
 public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
 
}
