/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import java.util.*;
import java.util.ArrayList;


/**
 *
 * @author Filip
 */
public class TwoDArraylist {
    
    public static void main(String[] args) {
        
        
        //Definiranje različitih listi
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic");
        bakeryList.add("Donuts");
                
        
        ArrayList<String> FruitAndVeggieList = new ArrayList();
        FruitAndVeggieList.add("Tomato");
        FruitAndVeggieList.add("Cabbage");
        FruitAndVeggieList.add("Apple");
                
        
        ArrayList<String> DrinkList = new ArrayList();
        DrinkList.add("Tea");
        DrinkList.add("Soda");
        DrinkList.add("Coffee");
        
        
        //Spajanje sve u jednu listu
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(FruitAndVeggieList);
        groceryList.add(DrinkList);
        
        // Ispis cijele liste
        System.out.println(groceryList);
        
        // Ispis prvog dijela liste
        System.out.println(groceryList.get(0));
        
        // Ispis prvog itema na prvoj listi
        System.out.println(groceryList.get(0).get(0));
                
    }
    
}
