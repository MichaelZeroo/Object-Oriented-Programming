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
public class MockTestSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car("white", 2000, "Honda", "Civic");
        Person student = new Student(10, 55.60, "john", "john@gmail.com", 1234, car);
         Person staff = new Professor(11, 90000, "Michael", "abc@gmail.com",1234,  car);
        staff.introduce();
        student.introduce();
    }
    
}
