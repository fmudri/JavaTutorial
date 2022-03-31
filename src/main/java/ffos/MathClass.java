/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author Filip
 */
public class MathClass {
    
    public static void main(String[] args) {
        
    
    // Pronađi hipotenuzu, korisnik unosi a i b, treba c
    double a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a stranicu"));
    double b = Integer.parseInt(JOptionPane.showInputDialog("Unesi b stranicu"));
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("Hipotenuza iznosi: "+c+"cm");
    
}
    
}
