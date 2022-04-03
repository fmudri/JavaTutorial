/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class Main {
    
    public static void main(String[] args) {
        //Car je oznaka klase na koju se referiramo
        //myCar je jedinstveno ime instance klase (objekta)
        //new (nova) Car (klasa na koju se referiramo)
        
        /*
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        
        myCar1.drive();
        myCar2.brake();
        */
        
        
        /*
        Human human1 = new Human("Rick",65,79.2);
        Human human2 = new Human("Morty",16,50.2);
        
        
        System.out.println(human2.age);
        human2.eat();
        human1.drink(); 
        */
        
        //DiceRoller diceRoller = new DiceRoller();
        
        Pizza pizza = new Pizza("thicc crust","tomato","mozzarella","pepperoni");
        System.out.println("Here are the ingredients:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
    
}
