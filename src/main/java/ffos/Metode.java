/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class Metode {
    
    public static void main(String[] args) {
        //Public - access modifier, čini metodu dostupnom
        //Static - omogućava pozivanje memorije i dodjelu memorije
        //Void - metoda ne vraća ništa (return), zato void
        //Main - Glavna metoda koju program traži prilikom pokretanja
        //String[] Args - metoda prihvaća jedan argument String Arraya
        
        
        //pozivanje (Invoking) metode
        //String name = "Filip";
        //int age = 21;
        //hello(name, age);
        
        int x = 3;
        int y = 4;
        
        //int z = add(x,y);
        
        System.out.println(add(x,y));
    }
    
    //Ovdje ne pišemo Void jer imamo return u metodi
    //pišemo int jer je to tip podatka koji se returna
    static int add(int x, int y){
        return x + y;
        
    }
    
    // Metoda = blok koda koji se izvrši svaki put kad ju se pozove
    
    //Parametri u definiranju metode ne moraju biti istog naziva kao
    //parametri definirani u main metodi
    static void hello(String title, int age){
        System.out.println("Hello " + title + " You are "+ age);
    }
    
    
}
