/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktestsolution;

/**
 *
 * @author Michael
 */
public class Student extends Person{
    private int studentID;
    private double averageMarks;

    public Student(int studentID, double averageMarks, String name, String email, int phone, Car car) {
        super(name, email, phone, car);
        this.studentID = studentID;
        this.averageMarks = averageMarks;
    }

    @Override
    public void introduce(){
        System.out.println("My student ID is "+studentID+", name: "+getName()+", Phone: "+getPhone() + ", and avaerage mark is "+averageMarks);
    }
      
    public int getStudentID() {
        return studentID;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
    
}
