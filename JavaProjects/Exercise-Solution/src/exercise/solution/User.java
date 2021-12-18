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
abstract public class User {
    private int accessLevel;
    private String name;

    public User(int accessLevel, String name) {
        this.setAccessLevel (accessLevel);
        this.name = name;
    }

    public User(String name) {
        this.name = name;
        this.accessLevel=0;
    }
    
    

    public int getAccessLevel() {
        return accessLevel;
    }

    private void setAccessLevel(int accessLevel) {
        if(accessLevel>=0)
        {
        this.accessLevel = accessLevel;
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    public boolean closeDoor(Room room)
    {
       return room.closeDoor();
    }
    
    public boolean openDoor(Room room)
    {
       return room.openDoor(accessLevel);
    }
    
    public void enterRoom(Room room)
    {
        System.out.println("User tries to enter the room");
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
