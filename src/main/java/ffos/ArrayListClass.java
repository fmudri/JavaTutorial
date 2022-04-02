/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import java.util.ArrayList;


/**
 *
 * @author Filip
 */
public class ArrayListClass {
    
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("pizza");
        food.add("Hamburger");
        food.add("Hotdog");
        
        //Naknadno dodavanje u arrayList
        food.set(0, "sushi");
        
        //Naknadno brisanje elemenata
        food.remove(1);
        
        //Brisanje cijelog arrayLista
        //food.clear();
        
        //Kod ispisa klasičnog niza koristi se array.lenght()
        //Kod arrayLista koristi se array.size()
        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));}
                
    }
    
}
