/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class ToString {
    
    public static void main(String[] args) {
        //toString() = specijalna metoda koju naslijeđuju svi objekti, a koja
        //vraća string koji "tekstualno predstavlja" objekt.
        //Može se koristiti implicitno i eksplicitno
        
        Car car = new Car();
        
        System.out.println(car.toString());
        System.out.println(car);
    }
    
}
