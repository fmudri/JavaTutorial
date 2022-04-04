/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class Car {
    
    String make = "Volvo";
    String model = "XC90";
    int year = 2022;
    String color = "Blue";
    double price = 5000.00;
    
    void drive(){
        System.out.println("You drive the car");
    }
    
    void brake(){
            System.out.println("You step on the break");
}
    
    @Override
    public String toString(){
    
        //String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
    
}
