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
public class ExerciseSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student("Louis");
        Lecturer lec = new Lecturer("Bic Boi");
        Room room = new Room();
        st.enterRoom(room);
        lec.enterRoom(room);
    }
    
}
