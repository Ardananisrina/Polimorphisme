/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Nisrina Izdihar
 */
public class Shape {
    //private member variable
    private String color;
    //construktor
    public Shape(String color){
        this.color = color;
    }
    //override
    public String toString(){
        return "Shape[color = " + color + "]";
    }
    //all shapes must have a method called getArea().
    public double getArea(){
        //we need to return some value to compile the program
        System.err.println("Shape unknown! cannot compute area!");
        return 0;
    }
    
}
