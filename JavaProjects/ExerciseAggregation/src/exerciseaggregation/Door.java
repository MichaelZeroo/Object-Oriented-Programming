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
public class Door {
    private boolean doorLocked;
    private boolean doorOpen;

    public Door() {
        doorLocked= true;
        doorOpen=false;
    }
    
    public void closeDoor(){
        this.doorOpen=false;
    }
    
    public boolean lockDoor(){
        if(doorOpen == false){
            this.doorLocked = true;
        }
        return doorLocked;
    }
    
    public boolean openDoor(){
        if(doorLocked == false){
            this.doorOpen=true;
        }
        return doorOpen;
    }
    
    public void unlockDoor(){
        this.doorLocked = false;
    }
    
    
    
    
}
