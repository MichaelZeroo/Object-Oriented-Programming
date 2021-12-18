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
public class CodeTheDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tail tail = new Tail();
        Animal cat = new Cat();
        Animal domestic = new Domestic(tail);
        Animal wildDog = new Wild(tail);
        
        cat.feed();
        domestic.feed();
        wildDog.feed();
        
    }
    
}
