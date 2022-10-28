/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Ej5 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // Pido el año
        System.out.println("Introduce un año");
        int anio = sc.nextInt();
 
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
 
    }
}
