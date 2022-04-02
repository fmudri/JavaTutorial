/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class PrintfMetoda {
    
    public static void main(String[] args) {
        
    
    //printf()= opcionalna metoda namijenjena za formatiranje, kontroliranje, i 
    //prikaz teksta u konzoli.
    //dva argumenta = format string + (Objekt/varijabla/vrijednost)
    //% [flags] [precision] [width] [conversion-character]
    
    
    //Pitati Jakopeca kada se koristi
    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Bro";
    int myInt = 50;
    double myDouble = 1000;
    
        //[conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        
        
        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %-10s",myString);
        
        
        //[precision]
        //Sets number of digits of precision when outputting floating-point
        //values (broj decimala na koji se broj prikazuje)
        System.out.printf("You have this much money %.2f",myDouble);
        
        
        // [flags] (useful for lineing up numbers)
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
}}
