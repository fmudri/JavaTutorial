/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class OverLoadedMetode {
    
    public static void main(String[] args) {
        //Overloaded metode - metode koje dijele isto ime, ali imaju drukčije
        //parametre
        //ime metode + parametri = potpis metode
        
        int x = add(1,2,3,4);
        
        System.out.println(x);
    }
    
    static int add(int a, int b){
        System.out.println("Overloaded metoda 1");
    return a + b;
    }
    
    static int add(int a, int b, int c){
        System.out.println("Overloaded metoda 2");
    return a + b + c;
    }
    
    static int add(int a, int b, int c, int d){
        System.out.println("Overloaded metoda 3");
    return a + b + c + d;
    }
    
}
