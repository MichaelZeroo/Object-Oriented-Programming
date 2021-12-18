/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codethedesign;

/**
 *
 * @author Michael
 */
public class Wild extends Dog{
    
    @Override 
    public void feed(){
        System.out.println("Wild feed");
    }

    public Wild(Tail tail) {
        super(tail);
    }
    
}
