/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class Pizza {
    
    //Overloaded constructors = nekoliko konstruktora unutar klase s istim imenom
    //ali različitim parametrima
    //ime + parametri = potpis
    
    String bread;
    String sauce;
    String cheese;
    String topping;
    
    Pizza(String bread, String sauce, String cheese, String topping){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
    }
    
    
    Pizza(String bread, String sauce, String cheese){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    }
    
    
    Pizza(String bread, String sauce){
    this.bread = bread;
    this.sauce = sauce;
    }
    
    
    Pizza(String bread){
    this.bread = bread;
    }
    
    
    
    Pizza(){}
    
}
