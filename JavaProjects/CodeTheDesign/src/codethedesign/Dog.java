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
abstract public class Dog extends Animal{
    public Tail tail;

    public Dog(Tail tail) {
        this.tail = tail;
    }
    
}
