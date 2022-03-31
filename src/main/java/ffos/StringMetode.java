/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class StringMetode {
    
    public static void main(String[] args) {
        
        String name = "Filip";
        
        //boolean result = name.equalsIgnoreCase("filip");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("i");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace("i","$");
        System.out.println(result);
    }
    
}
