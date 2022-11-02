/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author alumne_2n
 */
public class Ej7 {
        //Nom: Allen
        //Cognoms: Matira
        //INS Manuel Vázquez Montalbán
        //Data d’edició: 28/10/22
        //Nom del cicle formatiu: DAW
        //Nom del mòdul: Programación
    public static void main(String args[]) {
        //inicio bucle
        int num = 100;
        /*System.out.println("Escriure per pantalla els 10 primers números començant pel 0.");

        //bucle 1 a 10.
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        System.out.println("\nEscriure per pantalla els 100 primers números començant pel 0.");

        //bucle 1 a 100.
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
        System.out.println("\nEscriure els 100 primers números parells començant pel 0.");

        //bucle 1 a 100.
        while (num <= 100){
            if (num % 2 == 0){
            System.out.println(num);
            }
            num++; 
        } */
        System.out.println("\nEscriure els números del 0 al 100 en ordre descendent.");
        while (num <= 100 && (num >= 0)) {
            System.out.println(num);
            num--;
        }
    }
}
