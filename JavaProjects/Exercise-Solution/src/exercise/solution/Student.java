/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.solution;

/**
 *
 * @author Michael
 */
public class Student extends User {

    public Student(String name) {
        super(3, name);
    }
 public void enterRoom(Room room)
    {
        System.out.println("Student tries to enter the room");
        if(openDoor(room)==true){
            System.out.println("User opened the door: Successfully");       
            if(closeDoor(room)==true){
                System.out.println("Closed door");
            }
        }else{
            System.out.println("User could not open the door");
        }
    }
}
