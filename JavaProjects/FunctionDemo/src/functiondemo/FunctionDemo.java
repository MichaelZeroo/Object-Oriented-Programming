/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functiondemo;

/**
 *
 * @author Michael
 */
public class FunctionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double result=add(10,20);
        displayResult(result); 
    }
    static double add(double v1, double v2){
        double sum = v1+v2; 
        return sum;
    }
    static void displayResult(double output){
        System.out.println("The sum :"+ output);
    }
}
