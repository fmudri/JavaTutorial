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
public class ForEachLoop {
    
    public static void main(String[] args) {
        //Klasičan array
        //String [] animals = {"Cat","Dog","Rat","Bird"};
        
        //ArrayList
        ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("Cat");
        animals.add("dog");
        animals.add("birb");
        
        
        //Foreach petlja
        // Dvotočka predstavlja each
        for(String i : animals){
            System.out.println(i);
        }
        
        
        
        // dvotočka predstavlja "in"
        // "For every string index "in" animals do"
        //for(String i : animals){
        //    System.out.println(i);
        //}
    }
    
}
