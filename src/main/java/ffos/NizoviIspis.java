/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

/**
 *
 * @author Filip
 */
public class NizoviIspis {

    public static void main(String[] args) {
        /* 
        String[] cars = new String[3];
        
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);}
         */

        //Dvodimenzionalni nizovi
        String[][] cars = 
        {{"Camaro", "Corvette", "Toyota"},
        {"Mustang", "Ford", "Ranger"},
        {"Ferrari", "Opel", "Mazda"}};

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }

}
