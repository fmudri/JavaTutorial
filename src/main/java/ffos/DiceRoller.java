/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Filip
 */
public class DiceRoller {
    
    Random random;
    int number = 0;
    
    DiceRoller(){
        random = new Random();
        int number = 0;
        roll();
    }
    
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
