/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseaggregation;

/**
 *
 * @author Michael
 */
public class Room {
    private int accessLevel;
    private Door door;

    public Room() {
        door = new Door();
    }
    
    public boolean closeDoor(){
        door.closeDoor();
        return door.lockDoor();
    }
    
    public boolean unlockDoor(int accessLevel){
        if(accessLevel >= this.accessLevel){ 
        door.unlockDoor();
        return true;
        }else{
            return false;
        }
    }
    
    public boolean openDoor(int accessLevel){
        unlockDoor(accessLevel);
        return door.openDoor();
    }
    
    
    
}
