/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.solution;

/**
 *
 * @author st14158
 */
public class Door {
    private boolean doorLocked;
    private boolean doorOpen;
    public Door() {
        doorLocked= true;
        doorOpen= false;
    }
    public void closeDoor()
    {
        doorOpen=false;
    }
    public boolean lockDoor()
    {
        if(doorOpen==false)
        {
        doorLocked= true;
        }
        return doorLocked;
    }
    public boolean openDoor()
    {
       if(doorLocked==false)
       {
        doorOpen= true;
       }
       return doorOpen;
    }
    public void unlockDoor()
    {
        doorLocked= false;
    }
    
}
