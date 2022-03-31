/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ffos;

import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class Skener {

    public static void main(String[] args) {
        // Zamjena dviju varijabli
        String x = "Gdin.";
        String y = "Gđa.";
        String srednje;
        srednje = x;
        x = y;
        y = srednje;
        
        
        //System.out.println("x je " + x + "\n" + "y je " + y);
        
        
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        
        System.out.println("Hello " +name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favorite food is "+food);
        */
        
        
        // Skener pita nazive braće, zatim njihov broj, isto i za sestre, ispis
        System.out.println("Kako se zovu braća?");
        String braca = scanner.nextLine();
        System.out.println("Koliko imaš braće?");
        int brojB = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kako se zovu sestre?");
        String sestre = scanner.nextLine();
        System.out.println("Koliko imaš sestara?");
        int brojS = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Braća se zovu "+braca);
        System.out.println("Imaš "+brojB+" brata");
        System.out.println("Sestre se zovu "+sestre);
        System.out.println("Imaš "+brojS+" sestre");
        
    }
}
