/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregationdemo;

/**
 *
 * @author Michael
 */
public class User {
    private int accessLevel;
    private String name;

    public User(int accessLevel, String name) {
        this.accessLevel = accessLevel;
        this.name = name;
    }

    public User(String name) {
        accessLevel=0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccessLevel() {
        return accessLevel;
    }
    
    
}
